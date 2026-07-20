/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enhle
 */
package prg_381_project;

import prg_381_project.dao.MaterialDAO;
import prg_381_project.dao.CleanerDAO;
import prg_381_project.dao.IssuanceDAO;
import prg_381_project.daoimpl.MaterialDAOImpl;
import prg_381_project.daoimpl.CleanerDAOImpl;
import prg_381_project.daoimpl.IssuanceDAOImpl;
import prg_381_project.model.Material;
import prg_381_project.model.Cleaner;
import prg_381_project.model.Issuance;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DashboardPanel extends JPanel {

    private JLabel totalMaterialsValue;
    private JLabel lowStockValue;
    private JLabel totalCleanersValue;
    private JTable recentIssuancesTable;
    private DefaultTableModel issuancesTableModel;

    private MaterialDAO materialDAO;
    private CleanerDAO cleanerDAO;
    private IssuanceDAO issuanceDAO;

    public DashboardPanel() {
        // TODO: confirm these Impl class names match what's in your daoimpl package
        materialDAO = new MaterialDAOImpl();
        cleanerDAO = new CleanerDAOImpl();
        issuanceDAO = new IssuanceDAOImpl();

        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(buildStatCardsPanel(), BorderLayout.NORTH);
        add(buildRecentIssuancesPanel(), BorderLayout.CENTER);

        loadDashboardData();
    }

    private JPanel buildStatCardsPanel() {
        JPanel cardsPanel = new JPanel(new GridLayout(1, 3, 15, 0));

        totalMaterialsValue = new JLabel("0", SwingConstants.CENTER);
        lowStockValue = new JLabel("0", SwingConstants.CENTER);
        totalCleanersValue = new JLabel("0", SwingConstants.CENTER);

        cardsPanel.add(createStatCard("Total Materials", totalMaterialsValue, new Color(52, 152, 219)));
        cardsPanel.add(createStatCard("Low-Stock Items", lowStockValue, new Color(231, 76, 60)));
        cardsPanel.add(createStatCard("Total Cleaners", totalCleanersValue, new Color(46, 204, 113)));

        return cardsPanel;
    }

    private JPanel createStatCard(String title, JLabel valueLabel, Color accentColor) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(accentColor, 2),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        valueLabel.setFont(new Font("SansSerif", Font.BOLD, 32));
        valueLabel.setForeground(accentColor);
        valueLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        card.add(titleLabel);
        card.add(Box.createRigidArea(new Dimension(0, 10)));
        card.add(valueLabel);

        return card;
    }

    private JPanel buildRecentIssuancesPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Recent Stock Issuances"));

        String[] columns = {"Date", "Material", "Cleaner", "Quantity"};
        issuancesTableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        recentIssuancesTable = new JTable(issuancesTableModel);
        panel.add(new JScrollPane(recentIssuancesTable), BorderLayout.CENTER);

        return panel;
    }

    public void loadDashboardData() {
        try {
            
            List<Material> allMaterials = materialDAO.getAllMaterials();
            totalMaterialsValue.setText(String.valueOf(allMaterials.size()));

            
            long lowStockCount = allMaterials.stream()
                    .filter(m -> m.getQuantity() <= m.getReorderLevel())
                    .count();
            lowStockValue.setText(String.valueOf(lowStockCount));

            
            List<Cleaner> allCleaners = cleanerDAO.getAllCleaners();
            totalCleanersValue.setText(String.valueOf(allCleaners.size()));

            // Take top 10 ---
            List<Issuance> allIssuances = issuanceDAO.getAllIssuances();
            List<Issuance> recent = allIssuances.stream()
                    .sorted(Comparator.comparing(Issuance::getIssueDate).reversed())
                    .limit(10)
                    .collect(Collectors.toList());

            issuancesTableModel.setRowCount(0);
            for (Issuance issuance : recent) {
                Material material = materialDAO.getMaterialById(issuance.getMaterialId());
                Cleaner cleaner = cleanerDAO.getCleanerById(issuance.getCleanerId());

                String materialName = (material != null) ? material.getName() : "Unknown";
                
                String cleanerName = (cleaner != null) ? cleaner.toString() : "Unknown";

                issuancesTableModel.addRow(new Object[]{
                        issuance.getIssueDate(),
                        materialName,
                        cleanerName,
                        issuance.getQuantity()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error loading dashboard data: " + e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
