
package prg_381_project.materials;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import prg_381_project.dao.MaterialDAO;
import prg_381_project.daoimpl.MaterialDAOImpl;
import prg_381_project.model.Material;

/**
 * Materials Management screen - View, Add, Update, Delete, Search materials.
 * Low-stock rows are highlighted so it's visually obvious which materials
 * need reordering (this also feeds the dashboard's low-stock count later).
 *
 * Built against Liam's real MaterialDAO: CRUD methods return boolean
 * (not exceptions), and there's no built-in search method, so search is
 * done client-side by filtering the full list.
 *
 * This panel can be embedded into the main application shell (Person 2's
 * JFrame) via CardLayout, or run standalone for testing (see main() below).
 */
public class MaterialsPanel extends JPanel {

    private final MaterialDAO materialDAO;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField searchField;

    private static final String[] COLUMN_NAMES = {
        "ID", "Name", "Quantity", "Reorder Level", "Supplier ID", "Low Stock?"
    };

    public MaterialsPanel() {
        this.materialDAO = new MaterialDAOImpl();
        buildUI();
        loadMaterials();
    }

    private void buildUI() {
        setLayout(new BorderLayout(10, 10));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Top: search bar ---
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JButton clearSearchButton = new JButton("Clear");

        searchButton.addActionListener(e -> onSearch());
        clearSearchButton.addActionListener(e -> {
            searchField.setText("");
            loadMaterials();
        });

        topPanel.add(new JLabel("Search by name:"));
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(clearSearchButton);

        // --- Center: table ---
        tableModel = new DefaultTableModel(COLUMN_NAMES, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // read-only, edits happen via dialog
            }
        };
        table = new JTable(tableModel);
        table.setRowHeight(24);
        table.getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setDefaultRenderer(Object.class, new LowStockRowRenderer());

        JScrollPane scrollPane = new JScrollPane(table);

        // --- Bottom: action buttons ---
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton addButton = new JButton("Add Material");
        JButton editButton = new JButton("Edit Selected");
        JButton deleteButton = new JButton("Delete Selected");
        JButton refreshButton = new JButton("Refresh");

        addButton.addActionListener(e -> onAdd());
        editButton.addActionListener(e -> onEdit());
        deleteButton.addActionListener(e -> onDelete());
        refreshButton.addActionListener(e -> loadMaterials());

        bottomPanel.add(addButton);
        bottomPanel.add(editButton);
        bottomPanel.add(deleteButton);
        bottomPanel.add(refreshButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void loadMaterials() {
        List<Material> materials = materialDAO.getAllMaterials();
        populateTable(materials);
    }

    /**
     * No searchMaterials() exists on the shared DAO, so we filter the
     * full list client-side by name (case-insensitive, partial match).
     */
    private void onSearch() {
        String keyword = searchField.getText().trim().toLowerCase();
        if (keyword.isEmpty()) {
            loadMaterials();
            return;
        }
        List<Material> filtered = materialDAO.getAllMaterials().stream()
                .filter(m -> m.getName().toLowerCase().contains(keyword))
                .collect(Collectors.toList());
        populateTable(filtered);
    }

    private void populateTable(List<Material> materials) {
        tableModel.setRowCount(0);
        for (Material m : materials) {
            boolean lowStock = m.getQuantity() <= m.getReorderLevel();
            tableModel.addRow(new Object[]{
                m.getMaterialId(),
                m.getName(),
                m.getQuantity(),
                m.getReorderLevel(),
                m.getSupplierId(),
                lowStock ? "YES" : "No"
            });
        }
    }

    private void onAdd() {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        MaterialFormDialog dialog = new MaterialFormDialog(parentFrame, null);
        dialog.setVisible(true);

        if (dialog.isSaved()) {
            boolean success = materialDAO.addMaterial(dialog.getMaterial());
            if (success) {
                loadMaterials();
                JOptionPane.showMessageDialog(this, "Material added successfully.");
            } else {
                showError("Failed to add material. Check the database connection and try again.");
            }
        }
    }

    private void onEdit() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            showError("Please select a material to edit.");
            return;
        }

        int materialId = (int) tableModel.getValueAt(selectedRow, 0);
        Material material = materialDAO.getMaterialById(materialId);

        if (material == null) {
            showError("Material not found. It may have been deleted by someone else.");
            loadMaterials();
            return;
        }

        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        MaterialFormDialog dialog = new MaterialFormDialog(parentFrame, material);
        dialog.setVisible(true);

        if (dialog.isSaved()) {
            boolean success = materialDAO.updateMaterial(dialog.getMaterial());
            if (success) {
                loadMaterials();
                JOptionPane.showMessageDialog(this, "Material updated successfully.");
            } else {
                showError("Failed to update material. Check the database connection and try again.");
            }
        }
    }

    private void onDelete() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            showError("Please select a material to delete.");
            return;
        }

        int materialId = (int) tableModel.getValueAt(selectedRow, 0);
        String materialName = (String) tableModel.getValueAt(selectedRow, 1);

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete \"" + materialName + "\"?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = materialDAO.deleteMaterial(materialId);
            if (success) {
                loadMaterials();
                JOptionPane.showMessageDialog(this, "Material deleted.");
            } else {
                showError("Failed to delete material. Check the database connection and try again.");
            }
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Highlights rows red where the "Low Stock?" column is "YES", so
     * low-stock materials are visually obvious at a glance.
     */
    private class LowStockRowRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            String lowStockValue = (String) tableModel.getValueAt(row, 5);
            if (!isSelected) {
                if ("YES".equals(lowStockValue)) {
                    c.setBackground(new Color(255, 205, 205)); // light red
                } else {
                    c.setBackground(Color.WHITE);
                }
            }
            return c;
        }
    }

    /**
     * Standalone launcher so you can test this screen right now, without
     * waiting on Person 2's main application shell to be ready.
     * Delete or ignore this once your screens are wired into the real shell.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Materials Management - Standalone Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 500);
            frame.add(new MaterialsPanel());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}