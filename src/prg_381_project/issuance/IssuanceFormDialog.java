package prg_381_project.issuance;

import prg_381_project.connection.DBConnection;
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
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Modal dialog for issuing a material to a cleaner.
 *
 * Business rules enforced here:
 *  - All fields are required.
 *  - Quantity must be a positive integer.
 *  - Cannot issue more than the material's current available stock
 *    (prevents negative stock values).
 *  - On save, stock is deducted atomically inside a single DB transaction
 *    so a partial failure cannot leave data inconsistent.
 *
 * Pass a non-null {@code issuanceToEdit} to pre-fill the form in edit mode.
 * In edit mode the stock deduction logic re-adds the old quantity first so
 * the available-stock check remains accurate.
 */
public class IssuanceFormDialog extends JDialog {

    // ── form fields ──────────────────────────────────────────────────────────
    private JComboBox<CleanerItem> cleanerCombo;
    private JComboBox<MaterialItem> materialCombo;
    private JTextField quantityField;
    private JTextField dateField;          // yyyy-MM-dd, defaults to today

    // ── state ─────────────────────────────────────────────────────────────────
    private final Issuance issuanceToEdit; // null → add mode
    private boolean saved = false;

    // ── DAOs ──────────────────────────────────────────────────────────────────
    private final CleanerDAO cleanerDAO   = new CleanerDAOImpl();
    private final MaterialDAO materialDAO = new MaterialDAOImpl();
    private final IssuanceDAO issuanceDAO = new IssuanceDAOImpl();

    // ─────────────────────────────────────────────────────────────────────────
    //  Construction
    // ─────────────────────────────────────────────────────────────────────────

    public IssuanceFormDialog(JFrame parent, Issuance issuanceToEdit) {
        super(parent, issuanceToEdit == null ? "Issue Material" : "Edit Issuance", true);
        this.issuanceToEdit = issuanceToEdit;
        buildUI();
        populateCombos();
        if (issuanceToEdit != null) {
            prefillForEdit(issuanceToEdit);
        }
        pack();
        setMinimumSize(new Dimension(380, 280));
        setLocationRelativeTo(parent);
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  UI construction
    // ─────────────────────────────────────────────────────────────────────────

    private void buildUI() {
        JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
        form.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));

        cleanerCombo  = new JComboBox<>();
        materialCombo = new JComboBox<>();
        quantityField = new JTextField();
        dateField     = new JTextField(LocalDate.now().toString());

        // Show live stock info when the selected material changes
        materialCombo.addActionListener(e -> updateStockHint());

        JLabel stockHintLabel = new JLabel(" ");
        stockHintLabel.setForeground(new Color(180, 60, 60));
        stockHintLabel.setName("stockHint");

        form.add(new JLabel("Cleaner:"));
        form.add(cleanerCombo);
        form.add(new JLabel("Material:"));
        form.add(materialCombo);
        form.add(new JLabel("Quantity:"));
        form.add(quantityField);
        form.add(new JLabel("Issue Date (yyyy-MM-dd):"));
        form.add(dateField);
        form.add(new JLabel("Available Stock:"));
        form.add(stockHintLabel);

        JButton saveBtn   = new JButton("Save");
        JButton cancelBtn = new JButton("Cancel");
        saveBtn.addActionListener(e -> onSave());
        cancelBtn.addActionListener(e -> dispose());

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttons.add(saveBtn);
        buttons.add(cancelBtn);

        setLayout(new BorderLayout());
        add(form,    BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);
    }

    /** Reload the "Available Stock: X" hint whenever the material combo changes. */
    private void updateStockHint() {
        MaterialItem selected = (MaterialItem) materialCombo.getSelectedItem();
        JLabel hint = findStockHintLabel();
        if (hint == null) return;
        if (selected == null) {
            hint.setText(" ");
            return;
        }
        Material m = materialDAO.getMaterialById(selected.id);
        if (m == null) {
            hint.setText("Unknown");
        } else {
            int available = m.getQuantity();
            hint.setText(available + " units available");
            hint.setForeground(available <= m.getReorderLevel()
                    ? new Color(180, 60, 60)   // red if low-stock
                    : new Color(40, 140, 40));  // green if fine
        }
    }

    /** Walk the form panel to find the stock-hint label by name. */
    private JLabel findStockHintLabel() {
        for (Component c : ((JPanel) getContentPane().getComponent(0)).getComponents()) {
            if (c instanceof JLabel && "stockHint".equals(c.getName())) {
                return (JLabel) c;
            }
        }
        return null;
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Populating combos
    // ─────────────────────────────────────────────────────────────────────────

    private void populateCombos() {
        // Cleaners
        List<Cleaner> cleaners = cleanerDAO.getAllCleaners();
        cleanerCombo.removeAllItems();
        for (Cleaner c : cleaners) {
            cleanerCombo.addItem(new CleanerItem(c.getCleanerId(), c.toString()));
        }

        // Materials
        List<Material> materials = materialDAO.getAllMaterials();
        materialCombo.removeAllItems();
        for (Material m : materials) {
            materialCombo.addItem(new MaterialItem(m.getMaterialId(), m.getName(), m.getQuantity()));
        }

        // Trigger hint update for the default selection
        updateStockHint();
    }

    private void prefillForEdit(Issuance issuance) {
        // Select the matching cleaner
        for (int i = 0; i < cleanerCombo.getItemCount(); i++) {
            if (cleanerCombo.getItemAt(i).id == issuance.getCleanerId()) {
                cleanerCombo.setSelectedIndex(i);
                break;
            }
        }
        // Select the matching material
        for (int i = 0; i < materialCombo.getItemCount(); i++) {
            if (materialCombo.getItemAt(i).id == issuance.getMaterialId()) {
                materialCombo.setSelectedIndex(i);
                break;
            }
        }
        quantityField.setText(String.valueOf(issuance.getQuantity()));
        dateField.setText(issuance.getIssueDate().toString());
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Save logic — validates, enforces stock rule, deducts atomically
    // ─────────────────────────────────────────────────────────────────────────

    private void onSave() {
        // ── 1. Basic field validation ────────────────────────────────────────
        CleanerItem  selectedCleaner  = (CleanerItem)  cleanerCombo.getSelectedItem();
        MaterialItem selectedMaterial = (MaterialItem) materialCombo.getSelectedItem();

        if (selectedCleaner == null || selectedMaterial == null) {
            showError("Please select both a cleaner and a material.");
            return;
        }

        String quantityText = quantityField.getText().trim();
        String dateText     = dateField.getText().trim();

        if (quantityText.isEmpty() || dateText.isEmpty()) {
            showError("Quantity and Issue Date are required.");
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException ex) {
            showError("Quantity must be a whole number.");
            return;
        }

        if (quantity <= 0) {
            showError("Quantity must be greater than zero.");
            return;
        }

        LocalDate issueDate;
        try {
            issueDate = LocalDate.parse(dateText);
        } catch (Exception ex) {
            showError("Date must be in yyyy-MM-dd format (e.g. 2025-07-23).");
            return;
        }

        // ── 2. Load current material to check available stock ────────────────
        Material material = materialDAO.getMaterialById(selectedMaterial.id);
        if (material == null) {
            showError("Selected material no longer exists. Please refresh and try again.");
            return;
        }

        int availableStock = material.getQuantity();

        // In edit mode: the old quantity was already deducted, so add it back
        // for the purposes of the available-stock check.
        if (issuanceToEdit != null) {
            availableStock += issuanceToEdit.getQuantity();
        }

        // ── 3. Business rule: cannot exceed available stock ──────────────────
        if (quantity > availableStock) {
            showError(
                "Cannot issue " + quantity + " unit(s) of \"" + material.getName() + "\".\n"
                + "Only " + availableStock + " unit(s) are currently available."
            );
            return;
        }

        // ── 4. Persist atomically ────────────────────────────────────────────
        boolean success = issueAtomically(
                selectedCleaner.id,
                selectedMaterial.id,
                quantity,
                issueDate,
                material,
                availableStock
        );

        if (success) {
            saved = true;
            dispose();
        }
        // Error messages are shown inside issueAtomically on failure.
    }

    /**
     * Executes the issuance insert (or update) AND the stock deduction in a
     * single database transaction.  If either statement fails the whole thing
     * is rolled back so we never end up with a deducted stock and no issuance
     * record (or vice-versa).
     */
    private boolean issueAtomically(int cleanerId, int materialId, int quantity,
                                     LocalDate issueDate, Material material,
                                     int availableStock) {
        Connection conn = DBConnection.getConnection();
        if (conn == null) {
            showError("Database connection unavailable. Please try again.");
            return false;
        }

        try {
            conn.setAutoCommit(false); // begin transaction

            // ── Step A: insert or update the issuance record ─────────────────
            if (issuanceToEdit == null) {
                // INSERT new issuance
                String insertSql =
                    "INSERT INTO issuances(cleaner_id, material_id, quantity, issue_date) "
                    + "VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
                    ps.setInt(1, cleanerId);
                    ps.setInt(2, materialId);
                    ps.setInt(3, quantity);
                    ps.setDate(4, java.sql.Date.valueOf(issueDate));
                    ps.executeUpdate();
                }
            } else {
                // UPDATE existing issuance
                String updateSql =
                    "UPDATE issuances SET cleaner_id=?, material_id=?, quantity=?, issue_date=? "
                    + "WHERE issuance_id=?";
                try (PreparedStatement ps = conn.prepareStatement(updateSql)) {
                    ps.setInt(1, cleanerId);
                    ps.setInt(2, materialId);
                    ps.setInt(3, quantity);
                    ps.setDate(4, java.sql.Date.valueOf(issueDate));
                    ps.setInt(5, issuanceToEdit.getIssuanceId());
                    ps.executeUpdate();
                }
            }

            // ── Step B: update the material's stock quantity ──────────────────
            // newStock = (availableStock already accounts for edit mode) - quantity
            int newStock = availableStock - quantity;

            String stockSql = "UPDATE materials SET quantity=? WHERE material_id=?";
            try (PreparedStatement ps = conn.prepareStatement(stockSql)) {
                ps.setInt(1, newStock);
                ps.setInt(2, materialId);
                ps.executeUpdate();
            }

            conn.commit(); // both succeeded — commit
            return true;

        } catch (SQLException e) {
            // Roll back so neither change persists on partial failure
            try { conn.rollback(); } catch (SQLException ignored) { /* nothing more to do */ }
            showError("Transaction failed and was rolled back.\nDetail: " + e.getMessage());
            return false;
        } finally {
            try { conn.setAutoCommit(true); conn.close(); } catch (SQLException ignored) { /* cleanup */ }
        }
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Public accessors
    // ─────────────────────────────────────────────────────────────────────────

    /** @return true if the user clicked Save and all validation passed. */
    public boolean isSaved() { return saved; }

    // ─────────────────────────────────────────────────────────────────────────
    //  Helpers
    // ─────────────────────────────────────────────────────────────────────────

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  Inner wrapper types for combo display
    // ─────────────────────────────────────────────────────────────────────────

    /** Wraps a Cleaner for display in JComboBox. */
    static class CleanerItem {
        final int    id;
        final String label;
        CleanerItem(int id, String label) { this.id = id; this.label = label; }
        @Override public String toString() { return label; }
    }

    /** Wraps a Material for display in JComboBox (includes stock count). */
    static class MaterialItem {
        final int    id;
        final String name;
        final int    stock;
        MaterialItem(int id, String name, int stock) { this.id = id; this.name = name; this.stock = stock; }
        @Override public String toString() { return name + "  [stock: " + stock + "]"; }
    }
}
