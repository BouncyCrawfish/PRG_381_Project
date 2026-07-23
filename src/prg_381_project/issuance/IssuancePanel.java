package prg_381_project.issuance;

import prg_381_project.dao.CleanerDAO;
import prg_381_project.dao.IssuanceDAO;
import prg_381_project.dao.MaterialDAO;
import prg_381_project.daoimpl.CleanerDAOImpl;
import prg_381_project.daoimpl.IssuanceDAOImpl;
import prg_381_project.daoimpl.MaterialDAOImpl;
import prg_381_project.model.Cleaner;
import prg_381_project.model.Issuance;
import prg_381_project.model.Material;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.List;

/**
 * Person 5 — Stock Issuance Management Panel
 *
 * Two tabs:
 *   • "Issue Material"    — opens IssuanceFormDialog (add / edit)
 *   • "Issuance History"  — searchable/filterable table of all records
 *
 * Business rules (enforced inside IssuanceFormDialog):
 *   - All fields required
 *   - Quantity > 0
 *   - Cannot issue more than current stock
 *   - Stock deducted atomically in a single DB transaction (rollback on failure)
 *
 * Feeds Person 6 (DashboardPanel) via IssuanceDAO.getAllIssuances()
 * and Material stock levels via MaterialDAO.getAllMaterials().
 */
public class IssuancePanel extends JPanel {

    // ── DAOs ─────────────────────────────────────────────────────────────────
    private final IssuanceDAO issuanceDAO;
    private final MaterialDAO materialDAO;
    private final CleanerDAO  cleanerDAO;

    // ── History-view widgets ──────────────────────────────────────────────────
    private JTable                         historyTable;
    private DefaultTableModel              historyModel;
    private TableRowSorter<DefaultTableModel> sorter;
    private JTextField                     searchField;

    private static final String[] COLS = {
        "ID", "Date", "Cleaner", "Material", "Qty Issued"
    };

    // ─────────────────────────────────────────────────────────────────────────
    public IssuancePanel() {
        issuanceDAO = new IssuanceDAOImpl();
        materialDAO = new MaterialDAOImpl();
        cleanerDAO  = new CleanerDAOImpl();

        setLayout(new BorderLayout());

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Issue Material",   buildIssueTab());
        tabs.addTab("Issuance History", buildHistoryTab());

        // Refresh history every time that tab is selected
        tabs.addChangeListener(e -> {
            if (tabs.getSelectedIndex() == 1) {
                loadHistory(null);
            }
        });

        add(tabs, BorderLayout.CENTER);
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  TAB 1 — Issue Material
    // ═════════════════════════════════════════════════════════════════════════
    private JPanel buildIssueTab() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets  = new Insets(10, 10, 10, 10);
        gbc.fill    = GridBagConstraints.HORIZONTAL;
        gbc.anchor  = GridBagConstraints.CENTER;
        gbc.gridx   = 0;

        // Title
        JLabel title = new JLabel("Stock Issuance", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        gbc.gridy = 0;
        panel.add(title, gbc);

        // Explanation
        JLabel sub = new JLabel(
            "<html><center>Click <b>New Issuance</b> to issue materials to a cleaner.<br>"
            + "The form will enforce all stock rules automatically.</center></html>",
            SwingConstants.CENTER
        );
        sub.setForeground(Color.GRAY);
        gbc.gridy = 1;
        panel.add(sub, gbc);

        // New Issuance button
        JButton newBtn = new JButton("New Issuance");
        newBtn.setFont(new Font("SansSerif", Font.BOLD, 15));
        newBtn.setBackground(new Color(52, 152, 219));
        newBtn.setForeground(Color.WHITE);
        newBtn.setOpaque(true);
        newBtn.setPreferredSize(new Dimension(200, 42));
        newBtn.addActionListener(e -> openIssueDialog(null));
        gbc.gridy = 2;
        panel.add(newBtn, gbc);

        return panel;
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  TAB 2 — Issuance History
    // ═════════════════════════════════════════════════════════════════════════
    private JPanel buildHistoryTab() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // ── Top bar: search + action buttons ─────────────────────────────────
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 4));

        searchField = new JTextField(22);
        JButton searchBtn = new JButton("Search");
        JButton clearBtn  = new JButton("Clear");
        JButton editBtn   = new JButton("Edit Selected");
        JButton deleteBtn = new JButton("Delete Selected");
        JButton refreshBtn = new JButton("Refresh");

        searchBtn.addActionListener(e  -> onSearch());
        clearBtn.addActionListener(e   -> { searchField.setText(""); loadHistory(null); });
        editBtn.addActionListener(e    -> onEdit());
        deleteBtn.addActionListener(e  -> onDelete());
        refreshBtn.addActionListener(e -> loadHistory(null));

        top.add(new JLabel("Filter (cleaner / material):"));
        top.add(searchField);
        top.add(searchBtn);
        top.add(clearBtn);
        top.add(Box.createHorizontalStrut(16));
        top.add(editBtn);
        top.add(deleteBtn);
        top.add(refreshBtn);

        // ── Table ─────────────────────────────────────────────────────────────
        historyModel = new DefaultTableModel(COLS, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        historyTable = new JTable(historyModel);
        historyTable.setRowHeight(24);
        historyTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        sorter = new TableRowSorter<>(historyModel);
        historyTable.setRowSorter(sorter);

        // Hide the raw ID column from the user — still in model at index 0
        historyTable.getColumnModel().getColumn(0).setMinWidth(0);
        historyTable.getColumnModel().getColumn(0).setMaxWidth(0);
        historyTable.getColumnModel().getColumn(0).setWidth(0);

        panel.add(top, BorderLayout.NORTH);
        panel.add(new JScrollPane(historyTable), BorderLayout.CENTER);

        loadHistory(null);
        return panel;
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  ACTIONS
    // ═════════════════════════════════════════════════════════════════════════

    /** Open the issuance dialog in add mode (null) or edit mode (existing record). */
    private void openIssueDialog(Issuance existing) {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        IssuanceFormDialog dialog = new IssuanceFormDialog(parentFrame, existing);
        dialog.setVisible(true);

        if (dialog.isSaved()) {
            loadHistory(null); // refresh history after any change
            String msg = (existing == null)
                ? "Issuance recorded and stock deducted successfully."
                : "Issuance updated successfully.";
            JOptionPane.showMessageDialog(this, msg, "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void onEdit() {
        int viewRow = historyTable.getSelectedRow();
        if (viewRow == -1) {
            showError("Please select an issuance record to edit.");
            return;
        }

        int modelRow   = historyTable.convertRowIndexToModel(viewRow);
        int issuanceId = (int) historyModel.getValueAt(modelRow, 0);

        Issuance record;
        try {
            record = issuanceDAO.getIssuanceById(issuanceId);
        } catch (Exception ex) {
            showError("Could not load issuance record:\n" + ex.getMessage());
            return;
        }

        if (record == null) {
            showError("Record not found — it may have already been deleted.");
            loadHistory(null);
            return;
        }

        openIssueDialog(record);
    }

    private void onDelete() {
        int viewRow = historyTable.getSelectedRow();
        if (viewRow == -1) {
            showError("Please select an issuance record to delete.");
            return;
        }

        int modelRow    = historyTable.convertRowIndexToModel(viewRow);
        int issuanceId  = (int) historyModel.getValueAt(modelRow, 0);
        String cleaner  = (String) historyModel.getValueAt(modelRow, 2);
        String material = (String) historyModel.getValueAt(modelRow, 3);
        int qty         = (int)    historyModel.getValueAt(modelRow, 4);

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Delete this issuance record?\n\n"
            + "Cleaner:  " + cleaner + "\n"
            + "Material: " + material + "\n"
            + "Qty:      " + qty + "\n\n"
            + "Note: stock is NOT automatically restored when deleting a record.",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );
        if (confirm != JOptionPane.YES_OPTION) return;

        boolean deleted;
        try {
            deleted = issuanceDAO.deleteIssuance(issuanceId);
        } catch (Exception ex) {
            showError("Delete failed:\n" + ex.getMessage());
            return;
        }

        if (deleted) {
            loadHistory(searchField.getText().trim().isEmpty()
                ? null : searchField.getText().trim());
            JOptionPane.showMessageDialog(this, "Issuance record deleted.");
        } else {
            showError("Delete failed — the record may have already been removed.");
        }
    }

    private void onSearch() {
        String kw = searchField.getText().trim();
        loadHistory(kw.isEmpty() ? null : kw);
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  DATA LOADING
    // ═════════════════════════════════════════════════════════════════════════

    /**
     * Loads all issuance records into the history table, joining with cleaner
     * and material names for readability.
     *
     * @param keyword  if non-null, only rows whose cleaner or material name
     *                 contains this string (case-insensitive) are shown.
     */
    private void loadHistory(String keyword) {
        historyModel.setRowCount(0);

        List<Issuance> all;
        try {
            all = issuanceDAO.getAllIssuances();
        } catch (Exception ex) {
            showError("Failed to load issuance history:\n" + ex.getMessage());
            return;
        }

        for (Issuance iss : all) {
            // Resolve cleaner name — gracefully fall back to ID if lookup fails
            String cleanerName;
            try {
                Cleaner c = cleanerDAO.getCleanerById(iss.getCleanerId());
                cleanerName = (c != null) ? c.toString() : "ID " + iss.getCleanerId();
            } catch (Exception ex) {
                cleanerName = "ID " + iss.getCleanerId();
            }

            // Resolve material name — gracefully fall back to ID if lookup fails
            String materialName;
            try {
                Material m = materialDAO.getMaterialById(iss.getMaterialId());
                materialName = (m != null) ? m.getName() : "ID " + iss.getMaterialId();
            } catch (Exception ex) {
                materialName = "ID " + iss.getMaterialId();
            }

            // Client-side keyword filter (case-insensitive, partial match)
            if (keyword != null && !keyword.isEmpty()) {
                String kw = keyword.toLowerCase();
                if (!cleanerName.toLowerCase().contains(kw)
                        && !materialName.toLowerCase().contains(kw)) {
                    continue;
                }
            }

            historyModel.addRow(new Object[]{
                iss.getIssuanceId(),          // col 0 — hidden, used for edit/delete
                iss.getIssueDate(),            // col 1
                cleanerName,                  // col 2
                materialName,                 // col 3
                iss.getQuantity()             // col 4
            });
        }
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  HELPERS
    // ═════════════════════════════════════════════════════════════════════════

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // ═════════════════════════════════════════════════════════════════════════
    //  STANDALONE TEST LAUNCHER
    //  Run this main() to test without the full app shell.
    // ═════════════════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception ignored) { }

            JFrame frame = new JFrame("Issuance Management — Standalone Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 580);
            frame.add(new IssuancePanel());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
