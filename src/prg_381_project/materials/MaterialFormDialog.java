package prg_381_project.materials;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import prg_381_project.model.Material;

/**
 * Modal dialog used for BOTH adding a new material and editing an existing
 * one. If an existing Material is passed in, the fields are pre-filled and
 * we're in "edit" mode; otherwise we're in "add" mode.
 *
 * NOTE: matches Liam's Material class, where supplierId is a required int
 * (not nullable), so the Supplier ID field here is required.
 */
public class MaterialFormDialog extends JDialog {

    private JTextField nameField;
    private JTextField quantityField;
    private JTextField reorderLevelField;
    private JTextField supplierIdField;

    private Material material; // null = adding new, non-null = editing
    private boolean saved = false;

    public MaterialFormDialog(JFrame parent, Material materialToEdit) {
        super(parent, materialToEdit == null ? "Add Material" : "Edit Material", true);
        this.material = materialToEdit;
        buildUI();
        if (materialToEdit != null) {
            populateFields(materialToEdit);
        }
        pack();
        setLocationRelativeTo(parent);
    }

    private void buildUI() {
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        nameField = new JTextField();
        quantityField = new JTextField();
        reorderLevelField = new JTextField();
        supplierIdField = new JTextField();

        formPanel.add(new JLabel("Material Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Quantity:"));
        formPanel.add(quantityField);
        formPanel.add(new JLabel("Reorder Level:"));
        formPanel.add(reorderLevelField);
        formPanel.add(new JLabel("Supplier ID:"));
        formPanel.add(supplierIdField);

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        saveButton.addActionListener(e -> onSave());
        cancelButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void populateFields(Material m) {
        nameField.setText(m.getName());
        quantityField.setText(String.valueOf(m.getQuantity()));
        reorderLevelField.setText(String.valueOf(m.getReorderLevel()));
        supplierIdField.setText(String.valueOf(m.getSupplierId()));
    }

    private void onSave() {
        String name = nameField.getText().trim();
        String quantityText = quantityField.getText().trim();
        String reorderText = reorderLevelField.getText().trim();
        String supplierText = supplierIdField.getText().trim();

        // Required field validation
        if (name.isEmpty()) {
            showError("Material name is required.");
            return;
        }
        if (quantityText.isEmpty() || reorderText.isEmpty() || supplierText.isEmpty()) {
            showError("Quantity, Reorder Level, and Supplier ID are all required.");
            return;
        }

        int quantity;
        int reorderLevel;
        int supplierId;
        try {
            quantity = Integer.parseInt(quantityText);
            reorderLevel = Integer.parseInt(reorderText);
            supplierId = Integer.parseInt(supplierText);
        } catch (NumberFormatException ex) {
            showError("Quantity, Reorder Level, and Supplier ID must all be whole numbers.");
            return;
        }

        // Business rule: no negative stock
        if (quantity < 0) {
            showError("Quantity cannot be negative.");
            return;
        }
        if (reorderLevel < 0) {
            showError("Reorder Level cannot be negative.");
            return;
        }
        if (supplierId <= 0) {
            showError("Supplier ID must be a valid positive number.");
            return;
        }

        if (material == null) {
            material = new Material(0, name, quantity, reorderLevel, supplierId);
        } else {
            material.setName(name);
            material.setQuantity(quantity);
            material.setReorderLevel(reorderLevel);
            material.setSupplierId(supplierId);
        }

        saved = true;
        dispose();
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    public boolean isSaved() {
        return saved;
    }

    public Material getMaterial() {
        return material;
    }
}