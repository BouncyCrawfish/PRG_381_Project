/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prg_381_project;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import prg_381_project.daoimpl.UserDAOImpl;
import prg_381_project.dao.UserDAO;
import prg_381_project.model.User;
import prg_381_project.model.Cleaner;
import prg_381_project.daoimpl.CleanerDAOImpl;
import prg_381_project.model.Supplier;
import prg_381_project.daoimpl.SupplierDAOImpl;
import prg_381_project.issuance.IssuancePanel;


import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author regar
 */
public class Login_Page extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login_Page.class.getName());
    private javax.swing.JPanel Dashboard_Tab;
    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
        initComponents();
        Dashboard_Tab = new DashboardPanel();
        Tab_Index.insertTab("Dashboard", null, Dashboard_Tab, null, 6);
        
        
        //Set main index icons
        Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/login.png")));
        Tab_Index.setIconAt(7, new ImageIcon(getClass().getResource("/prg_381_project/icons/logout.png")));
        
        //Set materials index icons
        Materials_Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/add.png")));
        Materials_Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/view.png")));
        Materials_Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/update.png")));
        Materials_Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/delete.png")));
        
        //Set Issuance index icons
        Issuance_Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/add.png")));
        Issuance_Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/view.png")));
        Issuance_Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/update.png")));
        Issuance_Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/delete.png")));
        
        //Set Suppliers index icons
        Suppliers_Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/add.png")));
        Suppliers_Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/view.png")));
        
        
        //Set Cleaners index icons
        Cleaners_Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/add.png")));
        Cleaners_Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/view.png")));
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Person 5 — wire IssuancePanel into the Issuance tab.
        // Replace the empty generated sub-tabs with a single full-featured panel.
        Issuance_Tab.removeAll();
        Issuance_Tab.setLayout(new java.awt.BorderLayout());
        Issuance_Tab.add(new IssuancePanel(), java.awt.BorderLayout.CENTER);
        
        HideTabs();
        
        pack();
        setLocationRelativeTo(null);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        this.setVisible(false);
        jOptionPane1 = new javax.swing.JOptionPane();
        Tab_Index = new javax.swing.JTabbedPane();
        Login_Tab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Login_Password_Field = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Btn_Login = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Login_Username_Field = new javax.swing.JTextField();
        Registration_Tab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        Register_Username_Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Register_Password_Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Register_Email_Field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Btn_Add_User = new javax.swing.JButton();
        Register_Role_Field = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Materials_Tab = new javax.swing.JPanel();
        Materials_Tab_Index = new javax.swing.JTabbedPane();
        Add_Materials_Tab = new javax.swing.JPanel();
        View_Materials_Tab = new javax.swing.JPanel();
        Update_Materials_Tab = new javax.swing.JPanel();
        Delete_Materials_Tab = new javax.swing.JPanel();
        Issuance_Tab = new javax.swing.JPanel();
        Issuance_Tab_Index = new javax.swing.JTabbedPane();
        Add_Issuance_Tab = new javax.swing.JPanel();
        View_Issuance_Tab = new javax.swing.JPanel();
        Update_Issuance_Tab = new javax.swing.JPanel();
        Delete_Issuance_Tab = new javax.swing.JPanel();
        Suppliers_Tab = new javax.swing.JPanel();
        Suppliers_Tab_Index = new javax.swing.JTabbedPane();
        Add_Suppliers_Tab = new javax.swing.JPanel();
        Supplier_Tab = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Supplier_ID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Supplier_Email = new javax.swing.JTextField();
        supp_Add = new javax.swing.JButton();
        supp_Delete = new javax.swing.JButton();
        supp_Update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Supplier_Phone = new javax.swing.JTextField();
        Supplier_Address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Supplier_Name1 = new javax.swing.JTextField();
        View_Suppliers_Tab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Cleaners_Tab = new javax.swing.JPanel();
        Cleaners_Tab_Index = new javax.swing.JTabbedPane();
        Add_Cleaners_Tab = new javax.swing.JPanel();
        Cleaner_Tab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cl_Delete = new javax.swing.JButton();
        Cleaner_Department = new javax.swing.JTextField();
        Cleaner_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cl_Add = new javax.swing.JButton();
        cl_Update = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Cleaner_Surname1 = new javax.swing.JTextField();
        Cleaner_Name1 = new javax.swing.JTextField();
        View_Cleaners_Tab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Logout_Tab = new javax.swing.JPanel();
        Btn_Logout = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cleaning Inventory & Issuance System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Tab_Index.setForeground(new java.awt.Color(255, 255, 255));
        Tab_Index.setMaximumSize(new java.awt.Dimension(490, 430));
        Tab_Index.setMinimumSize(new java.awt.Dimension(490, 430));
        Tab_Index.setRequestFocusEnabled(false);

        Login_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Login_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Login_Tab.setFocusTraversalPolicyProvider(true);
        Login_Tab.setMaximumSize(new java.awt.Dimension(490, 430));
        Login_Tab.setPreferredSize(new java.awt.Dimension(490, 430));
        Login_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email or Username");
        Login_Tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 100, 190, 20));

        Login_Password_Field.setBackground(new java.awt.Color(102, 102, 102));
        Login_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Password_Field.setForeground(new java.awt.Color(255, 255, 255));
        Login_Password_Field.addActionListener(this::Login_Password_FieldActionPerformed);
        Login_Tab.add(Login_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 220, 50));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        Login_Tab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 220, -1, -1));

        Btn_Login.setBackground(new java.awt.Color(102, 102, 102));
        Btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Login.setText("Log In");
        Btn_Login.addActionListener(this::Btn_LoginActionPerformed);
        Login_Tab.add(Btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 220, 40));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Welcome");
        jScrollPane1.setViewportView(jTextPane1);

        Login_Tab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 125, -1));

        Login_Username_Field.setBackground(new java.awt.Color(102, 102, 102));
        Login_Username_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Username_Field.setForeground(new java.awt.Color(255, 255, 255));
        Login_Tab.add(Login_Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 130, 220, 50));

        Tab_Index.addTab("Login", Login_Tab);
        Login_Tab.getAccessibleContext().setAccessibleName("Login_Tab");

        Registration_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Registration_Tab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registration_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.setMaximumSize(new java.awt.Dimension(490, 430));
        Registration_Tab.setName(""); // NOI18N
        Registration_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane3.setText("Add User");
        jTextPane3.setFocusable(false);
        jScrollPane3.setViewportView(jTextPane3);

        Registration_Tab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 120, -1));

        Register_Username_Field.setBackground(new java.awt.Color(102, 102, 102));
        Register_Username_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Register_Username_Field.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.add(Register_Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 50));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        Registration_Tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        Register_Password_Field.setBackground(new java.awt.Color(102, 102, 102));
        Register_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Register_Password_Field.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.add(Register_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 50));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        Registration_Tab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 20));

        Register_Email_Field.setBackground(new java.awt.Color(102, 102, 102));
        Register_Email_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Register_Email_Field.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.add(Register_Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        Registration_Tab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        Btn_Add_User.setBackground(new java.awt.Color(102, 102, 102));
        Btn_Add_User.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Add_User.setText("Add User");
        Btn_Add_User.addActionListener(this::Btn_Add_UserActionPerformed);
        Registration_Tab.add(Btn_Add_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 220, 40));

        Register_Role_Field.setBackground(new java.awt.Color(102, 102, 102));
        Register_Role_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Register_Role_Field.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.add(Register_Role_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 50));

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Role (Lowercase only)");
        Registration_Tab.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        Tab_Index.addTab("Registration", Registration_Tab);
        Registration_Tab.getAccessibleContext().setAccessibleName("Registration_Tab");

        Materials_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Materials_Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Materials_Tab_Index.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Add_Materials_TabLayout = new javax.swing.GroupLayout(Add_Materials_Tab);
        Add_Materials_Tab.setLayout(Add_Materials_TabLayout);
        Add_Materials_TabLayout.setHorizontalGroup(
            Add_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Add_Materials_TabLayout.setVerticalGroup(
            Add_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Materials_Tab_Index.addTab("Add Materials", Add_Materials_Tab);

        javax.swing.GroupLayout View_Materials_TabLayout = new javax.swing.GroupLayout(View_Materials_Tab);
        View_Materials_Tab.setLayout(View_Materials_TabLayout);
        View_Materials_TabLayout.setHorizontalGroup(
            View_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        View_Materials_TabLayout.setVerticalGroup(
            View_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Materials_Tab_Index.addTab("View Materials", View_Materials_Tab);

        javax.swing.GroupLayout Update_Materials_TabLayout = new javax.swing.GroupLayout(Update_Materials_Tab);
        Update_Materials_Tab.setLayout(Update_Materials_TabLayout);
        Update_Materials_TabLayout.setHorizontalGroup(
            Update_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Update_Materials_TabLayout.setVerticalGroup(
            Update_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Materials_Tab_Index.addTab("Update Materials", Update_Materials_Tab);

        javax.swing.GroupLayout Delete_Materials_TabLayout = new javax.swing.GroupLayout(Delete_Materials_Tab);
        Delete_Materials_Tab.setLayout(Delete_Materials_TabLayout);
        Delete_Materials_TabLayout.setHorizontalGroup(
            Delete_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Delete_Materials_TabLayout.setVerticalGroup(
            Delete_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Materials_Tab_Index.addTab("Delete Materials", Delete_Materials_Tab);

        Materials_Tab.add(Materials_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 610));

        Tab_Index.addTab("Materials", Materials_Tab);

        Issuance_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Issuance_Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Issuance_Tab_Index.setForeground(new java.awt.Color(255, 255, 255));

        Add_Issuance_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Issuance_Tab_Index.addTab("Add Issuance", Add_Issuance_Tab);

        javax.swing.GroupLayout View_Issuance_TabLayout = new javax.swing.GroupLayout(View_Issuance_Tab);
        View_Issuance_Tab.setLayout(View_Issuance_TabLayout);
        View_Issuance_TabLayout.setHorizontalGroup(
            View_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        View_Issuance_TabLayout.setVerticalGroup(
            View_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Issuance_Tab_Index.addTab("View Issuance", View_Issuance_Tab);

        javax.swing.GroupLayout Update_Issuance_TabLayout = new javax.swing.GroupLayout(Update_Issuance_Tab);
        Update_Issuance_Tab.setLayout(Update_Issuance_TabLayout);
        Update_Issuance_TabLayout.setHorizontalGroup(
            Update_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Update_Issuance_TabLayout.setVerticalGroup(
            Update_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Issuance_Tab_Index.addTab("Update Issuance", Update_Issuance_Tab);

        javax.swing.GroupLayout Delete_Issuance_TabLayout = new javax.swing.GroupLayout(Delete_Issuance_Tab);
        Delete_Issuance_Tab.setLayout(Delete_Issuance_TabLayout);
        Delete_Issuance_TabLayout.setHorizontalGroup(
            Delete_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Delete_Issuance_TabLayout.setVerticalGroup(
            Delete_Issuance_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        Issuance_Tab_Index.addTab("Delete Issuance", Delete_Issuance_Tab);

        Issuance_Tab.add(Issuance_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 610));

        Tab_Index.addTab("Issuance", Issuance_Tab);

        Suppliers_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suppliers_Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Suppliers_Tab_Index.setForeground(new java.awt.Color(255, 255, 255));

        Supplier_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Supplier_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Supplier_Tab.setName("Suppliers"); // NOI18N
        Supplier_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel10.setText("SupplierID");
        Supplier_Tab.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Supplier_ID.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_ID.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 20));

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel11.setText("Supplier Name");
        Supplier_Tab.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 20));

        jLabel12.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel12.setText("Supplier Address");
        Supplier_Tab.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        Supplier_Email.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Email.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 20));

        supp_Add.setBackground(new java.awt.Color(102, 102, 102));
        supp_Add.setForeground(new java.awt.Color(255, 255, 255));
        supp_Add.setText("ADD");
        supp_Add.addActionListener(this::supp_AddActionPerformed);
        Supplier_Tab.add(supp_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 220, 40));

        supp_Delete.setBackground(new java.awt.Color(102, 102, 102));
        supp_Delete.setForeground(new java.awt.Color(255, 255, 255));
        supp_Delete.setText("Delete");
        supp_Delete.addActionListener(this::supp_DeleteActionPerformed);
        Supplier_Tab.add(supp_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 220, 40));

        supp_Update.setBackground(new java.awt.Color(102, 102, 102));
        supp_Update.setForeground(new java.awt.Color(255, 255, 255));
        supp_Update.setText("Update Info");
        supp_Update.addActionListener(this::supp_UpdateActionPerformed);
        Supplier_Tab.add(supp_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Supplier_Tab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 410, 300));

        Supplier_Phone.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Phone.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 20));

        Supplier_Address.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Address.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel13.setText("Supplier Phone");
        Supplier_Tab.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 20));

        jLabel14.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel14.setText("Supplier Email");
        Supplier_Tab.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 20));

        Supplier_Name1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Name1.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 20));

        javax.swing.GroupLayout Add_Suppliers_TabLayout = new javax.swing.GroupLayout(Add_Suppliers_Tab);
        Add_Suppliers_Tab.setLayout(Add_Suppliers_TabLayout);
        Add_Suppliers_TabLayout.setHorizontalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Suppliers_TabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Supplier_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Add_Suppliers_TabLayout.setVerticalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_Suppliers_TabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Supplier_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        Suppliers_Tab_Index.addTab("Add Suppliers", Add_Suppliers_Tab);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable3ComponentShown(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout View_Suppliers_TabLayout = new javax.swing.GroupLayout(View_Suppliers_Tab);
        View_Suppliers_Tab.setLayout(View_Suppliers_TabLayout);
        View_Suppliers_TabLayout.setHorizontalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Suppliers_TabLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                .addContainerGap())
        );
        View_Suppliers_TabLayout.setVerticalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Suppliers_TabLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
        );

        Suppliers_Tab_Index.addTab("View Suppliers", View_Suppliers_Tab);

        Suppliers_Tab.add(Suppliers_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));
        Suppliers_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Suppliers", Suppliers_Tab);

        Cleaners_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cleaners_Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Cleaners_Tab_Index.setForeground(new java.awt.Color(255, 255, 255));

        Add_Cleaners_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cleaner_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Cleaner_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Cleaner_Tab.setFocusTraversalPolicyProvider(true);
        Cleaner_Tab.setName("Cleaners"); // NOI18N
        Cleaner_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cleaner Department");
        Cleaner_Tab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CleanerID");
        Cleaner_Tab.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cl_Delete.setBackground(new java.awt.Color(102, 102, 102));
        cl_Delete.setForeground(new java.awt.Color(255, 255, 255));
        cl_Delete.setText("Delete");
        cl_Delete.addActionListener(this::cl_DeleteActionPerformed);
        Cleaner_Tab.add(cl_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 220, 40));

        Cleaner_Department.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Department.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        Cleaner_ID.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_ID.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 20));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cleaner Name");
        Cleaner_Tab.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 20));

        cl_Add.setBackground(new java.awt.Color(102, 102, 102));
        cl_Add.setForeground(new java.awt.Color(255, 255, 255));
        cl_Add.setText("ADD");
        cl_Add.addActionListener(this::cl_AddActionPerformed);
        Cleaner_Tab.add(cl_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 40));

        cl_Update.setBackground(new java.awt.Color(102, 102, 102));
        cl_Update.setForeground(new java.awt.Color(255, 255, 255));
        cl_Update.setText("Update Info");
        cl_Update.addActionListener(this::cl_UpdateActionPerformed);
        Cleaner_Tab.add(cl_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 220, 40));

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cleaner Surname");
        Cleaner_Tab.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        Cleaner_Surname1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Surname1.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Surname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 220, 20));

        Cleaner_Name1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Name1.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 20));

        Add_Cleaners_Tab.add(Cleaner_Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -4, 830, 580));

        Cleaners_Tab_Index.addTab("Add Cleaners", Add_Cleaners_Tab);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout View_Cleaners_TabLayout = new javax.swing.GroupLayout(View_Cleaners_Tab);
        View_Cleaners_Tab.setLayout(View_Cleaners_TabLayout);
        View_Cleaners_TabLayout.setHorizontalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Cleaners_TabLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        View_Cleaners_TabLayout.setVerticalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Cleaners_TabLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 148, Short.MAX_VALUE))
        );

        Cleaners_Tab_Index.addTab("View Cleaners", View_Cleaners_Tab);

        Cleaners_Tab.add(Cleaners_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));
        Cleaners_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Cleaners", Cleaners_Tab);

        Logout_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Logout_Tab.setForeground(new java.awt.Color(255, 255, 255));

        Btn_Logout.setBackground(new java.awt.Color(102, 102, 102));
        Btn_Logout.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        Btn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Logout.setText("Log Out");
        Btn_Logout.addActionListener(this::Btn_LogoutActionPerformed);

        javax.swing.GroupLayout Logout_TabLayout = new javax.swing.GroupLayout(Logout_Tab);
        Logout_Tab.setLayout(Logout_TabLayout);
        Logout_TabLayout.setHorizontalGroup(
            Logout_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Logout_TabLayout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(Btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        Logout_TabLayout.setVerticalGroup(
            Logout_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Logout_TabLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(Btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        Tab_Index.addTab("Logout", Logout_Tab);
        Logout_Tab.getAccessibleContext().setAccessibleName("Logout_Tab");
        Logout_Tab.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
        System.exit(0);
                
    }//GEN-LAST:event_Btn_LogoutActionPerformed

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed
        String Username = Login_Username_Field.getText();
        String Password = Login_Password_Field.getText();
       
        
        if(!Username.isEmpty()|| !Password.isEmpty()){
            
            Access_Control(Username, Password);
               
        }
        else{
            jOptionPane1.showMessageDialog(this,
                                           "Please enter a value in all fields",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_Btn_LoginActionPerformed

    private void Login_Password_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_Password_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_Password_FieldActionPerformed

    
    
    public String idText;
    public String cl_Name;
    public String cl_Surname;
    public String cl_Department;
    public String supp_supplierId;
    public String supp_name;
    public String supp_phone;
    public String supp_email;
    public String supp_address;
                                                 
        public void CLDetails(){
           idText = Cleaner_ID.getText().trim();
           cl_Name = Cleaner_Name1.getText().trim();
           cl_Surname = Cleaner_Surname1.getText().trim();
           cl_Department = Cleaner_Department.getText().trim();

            if (idText.isEmpty() || cl_Name.isEmpty() || cl_Surname.isEmpty() || cl_Department.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Please fill in all fields before adding a cleaner.", 
                    "Validation Error", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                return; // Stop execution
                }   
        }
        public void SuppDetails(){
            supp_supplierId = Supplier_ID.getText().trim();
            supp_name = Supplier_Name1.getText().trim();
            supp_phone = Supplier_Phone.getText().trim();
            supp_email = Supplier_Email.getText().trim();
            supp_address = Supplier_Address.getText().trim();

             if (idText.isEmpty() || cl_Name.isEmpty() || cl_Surname.isEmpty() || cl_Department.isEmpty()) {
                 javax.swing.JOptionPane.showMessageDialog(this, 
                     "Please fill in all fields before adding a cleaner.", 
                     "Validation Error", 
                     javax.swing.JOptionPane.WARNING_MESSAGE);
                 return; // Stop execution
                 }   
        }  
    private void cl_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cl_DeleteActionPerformed

        CLDetails();
        try {
            int cl_ID = Integer.parseInt(idText);
            CleanerDAOImpl cleanerDAO = new CleanerDAOImpl();
            boolean isAdded = cleanerDAO.deleteCleaner(cl_ID);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cleaner updated successfully!");

                // Clear input fields after success
                Cleaner_ID.setText("");
                Cleaner_Name1.setText("");
                Cleaner_Surname1.setText("");
                Cleaner_Department.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Cleaner ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cl_DeleteActionPerformed

    private void cl_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cl_AddActionPerformed
        // TODO add your handling code here:

        CLDetails();

        try {
            int cl_ID = Integer.parseInt(idText);

            Cleaner cleaner = new Cleaner(cl_ID, cl_Name, cl_Surname, cl_Department);
            CleanerDAOImpl cleanerDAO = new CleanerDAOImpl();
            boolean isAdded = cleanerDAO.addCleaner(cleaner);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cleaner added successfully!");

                // Clear input fields after success
                Cleaner_ID.setText("");
                Cleaner_Name1.setText("");
                Cleaner_Surname1.setText("");
                Cleaner_Department.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Cleaner ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cl_AddActionPerformed

    private void cl_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cl_UpdateActionPerformed
        // TODO add your handling code here:
        CLDetails();

        try {
            int cl_ID = Integer.parseInt(idText);

            Cleaner cleaner = new Cleaner(cl_ID, cl_Name, cl_Surname, cl_Department);
            CleanerDAOImpl cleanerDAO = new CleanerDAOImpl();
            boolean isAdded = cleanerDAO.updateCleaner(cleaner);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cleaner updated successfully!");

                // Clear input fields after success
                Cleaner_ID.setText("");
                Cleaner_Name1.setText("");
                Cleaner_Surname1.setText("");
                Cleaner_Department.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Cleaner ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cl_UpdateActionPerformed

    private void supp_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_UpdateActionPerformed
        // TODO add your handling code here:
        SuppDetails();

        try {
            int supp_ID = Integer.parseInt(supp_supplierId);

            Supplier supplier = new Supplier(supp_ID, supp_name, supp_phone, supp_email,supp_address);
            SupplierDAOImpl supplierDAO = new SupplierDAOImpl();
            boolean isAdded = supplierDAO.updateSupplier(supplier);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Supplier updated successfully!");

                // Clear input fields after success
                Supplier_ID.setText("");
                Supplier_Name1.setText("");
                Supplier_Phone.setText("");
                Supplier_Email.setText("");
                Supplier_Address.setText("");

            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Supplier ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_supp_UpdateActionPerformed

    private void supp_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_DeleteActionPerformed
        // TODO add your handling code here:
        SuppDetails();

        try {
            int supp_ID = Integer.parseInt(supp_supplierId);

            SupplierDAOImpl supplierDAO = new SupplierDAOImpl();
            boolean isAdded = supplierDAO.deleteSupplier(supp_ID);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Supplier deleted successfully!");

                // Clear input fields after success
                Supplier_ID.setText("");
                Supplier_Name1.setText("");
                Supplier_Phone.setText("");
                Supplier_Email.setText("");
                Supplier_Address.setText("");

            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Supplier ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_supp_DeleteActionPerformed

    private void supp_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supp_AddActionPerformed
        // TODO add your handling code here:
        SuppDetails();

        try {
            int supp_ID = Integer.parseInt(supp_supplierId);

            Supplier supplier = new Supplier(supp_ID, supp_name, supp_phone, supp_email,supp_address);
            SupplierDAOImpl supplierDAO = new SupplierDAOImpl();
            boolean isAdded = supplierDAO.addSupplier(supplier);

            if (isAdded) {
                javax.swing.JOptionPane.showMessageDialog(this, "Supplier added successfully!");

                // Clear input fields after success
                Supplier_ID.setText("");
                Supplier_Name1.setText("");
                Supplier_Phone.setText("");
                Supplier_Email.setText("");
                Supplier_Address.setText("");

            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to add cleaner. Please try again.",
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Supplier ID must be a valid whole number.",
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_supp_AddActionPerformed

    private void jTable3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable3ComponentShown
        // TODO add your handling code here:
        loadCleanerTableData();
    }//GEN-LAST:event_jTable3ComponentShown
     ;
    
    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
        loadSupplierTableData();
    }//GEN-LAST:event_jTable1ComponentShown

    private void Btn_Add_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Add_UserActionPerformed
        String Username = Register_Username_Field.getText();
        String Password = Register_Password_Field.getText();
        String Role = Register_Role_Field.getText();
        String Email = Register_Email_Field.getText();
        
        if(!Username.isEmpty()|| !Password.isEmpty()|| !Email.isEmpty()||Role.isEmpty()){
            
            if (Input_validation(Username, Password,Email,Role)){
            UserDAO userDAO = new UserDAOImpl();
            User user = new User(0,Username, Password,Email,Role);
            
                try {
                    userDAO.addUser(user);
                    jOptionPane1.showMessageDialog(this,
                                           "Added "+Username,
                                           "Login Success",
                                           jOptionPane1.INFORMATION_MESSAGE);
                    
                } catch (Exception e) {
                  jOptionPane1.showMessageDialog(this,
                                           "Error",
                                           e.getMessage(),
                                           jOptionPane1.ERROR_MESSAGE);  
                }
        }
            
               
        }
        else{
            jOptionPane1.showMessageDialog(this,
                                           "Please enter a value in all fields",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_Btn_Add_UserActionPerformed
   
    private void loadSupplierTableData() {
    
    SwingWorker<DefaultTableModel, Void> worker = new SwingWorker<DefaultTableModel, Void>() {
        @Override
        protected DefaultTableModel doInBackground() throws Exception {
            
            String[] columns = {"supplier_id","name", "phone", "email","address"};
            DefaultTableModel model = new DefaultTableModel(columns, 0);

            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/StudentsRegistry", "USER", "PASS");
                 PreparedStatement stmt = conn.prepareStatement("SELECT supplier_id,name, phone, email, address FROM suppliers");
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("supplier_id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address")
                         
                    });
                }
            }
            return model;
        }

        @Override
        protected void done() {
            // 2. Update JTable on the Swing thread
            try {
                DefaultTableModel model = get();
                jTable1.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jTable1.setEnabled(true);
            }
        }
    };

    worker.execute();
}
    
    
    private void loadCleanerTableData() {
    
    SwingWorker<DefaultTableModel, Void> worker = new SwingWorker<DefaultTableModel, Void>() {
        @Override
        protected DefaultTableModel doInBackground() throws Exception {
            
            String[] columns = {"cleaner_id","first_name", "last_name", "department"};
            DefaultTableModel model = new DefaultTableModel(columns, 0);

            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/StudentsRegistry", "USER", "PASS");
                 PreparedStatement stmt = conn.prepareStatement("SELECT cleaner_id,first_name, last_name, department FROM cleaners");
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("department")
                         
                    });
                }
            }
            return model;
        }

        @Override
        protected void done() {
            // 2. Update JTable on the Swing thread
            try {
                DefaultTableModel model = get();
                jTable3.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jTable3.setEnabled(true);
            }
        }
    };

    worker.execute();
}

    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login_Page().setVisible(true));
    }
    
    public void Access_Control(String Username, String Password){
        try {
             
            UserDAO userDAO = new UserDAOImpl();
            User user = userDAO.getUserByUsername(Username);
            
            if(Password.equals(user.getPassword())){
                
                
                switch (user.getRole()){
                case "admin":
                jOptionPane1.showMessageDialog(this,
                                           "Logged in as "+Username,
                                           "Login Success",
                                           jOptionPane1.INFORMATION_MESSAGE);    
                Show_Admin_Tabs();
                break;
                
                case "supervisor":
                jOptionPane1.showMessageDialog(this,
                                           "Logged in as "+Username,
                                           "Login Success",
                                           jOptionPane1.INFORMATION_MESSAGE);
                Show_Admin_Tabs();
                break;
                
                case "staff":
                jOptionPane1.showMessageDialog(this,
                                           "Logged in as "+Username,
                                           "Login Success",
                                           jOptionPane1.INFORMATION_MESSAGE);  
                Show_User_Tabs();
                break;
                
               default:
                jOptionPane1.showMessageDialog(this,
                                           "Error",
                                           "Unkown Role",
                                           jOptionPane1.ERROR_MESSAGE);
                break; 
                
            }
                
            }
            else{
                jOptionPane1.showMessageDialog(this,
                                           "Username or Password Incorrect",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            }
            
               
            
   
         
        } catch (Exception e) {
           jOptionPane1.showMessageDialog(this,
                                           "Error",
                                           e.getMessage(),
                                           jOptionPane1.ERROR_MESSAGE); 
        }
        
    }
    
    public boolean Input_validation(String Username, String Password, String Email, String Role){
        //Validate Password
        if (Password.length()< 8){
            jOptionPane1.showMessageDialog(this,
                                           "Password must contain at least 8 characters",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);  
            return false;
        }
    
        if (!Password.matches(".*[A-Z].*")) {
            jOptionPane1.showMessageDialog(this,
                                           "Password must contain at least one uppercase letter.",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            return false;
        }
    
        if (!Password.matches(".*[a-z].*")) {
            jOptionPane1.showMessageDialog(this,
                                           "Password must contain at least one lowercase letter.",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            return false;   
        }
        
        
        if (!Password.matches(".*\\d.*")) {
            jOptionPane1.showMessageDialog(this,
                                           "Password must contain at least one digit.",
                                           "Error",
                                              jOptionPane1.ERROR_MESSAGE);
            return false;
        }
        
        if (!Password.matches(".*[@#$%^&+=!].*")) {
            jOptionPane1.showMessageDialog(this,
                                           "Password must contain at least one special character.",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            return false;
        }
        //Validate Username
        if (Username.isEmpty()||Username.isBlank()){
            jOptionPane1.showMessageDialog(this,
                                           "Please enter a username",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);  
            return false;
        }
        //Validate Email
        if (!Email.matches(".*[@].*")) {
            jOptionPane1.showMessageDialog(this,
                                           "Email must contain @ symbol.",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            return false;   
        }
        
        //
        if (Role.equalsFoldCase("admin")||Role.equalsFoldCase("staff")||Role.equalsFoldCase("supervisor"))
        {
            return true;
        }
        else{
            
            jOptionPane1.showMessageDialog(this,
                                           "Unkown Role",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    
    public void HideTabs(){
            Tab_Index.remove(Registration_Tab);
            Tab_Index.remove(Materials_Tab);
            Tab_Index.remove(Issuance_Tab);
            Tab_Index.remove(Suppliers_Tab);
            Tab_Index.remove(Cleaners_Tab);
            Tab_Index.remove(Dashboard_Tab);

    }
    
    public void Show_Admin_Tabs(){
    Tab_Index.insertTab("registration", new ImageIcon(getClass().getResource("/prg_381_project/icons/registration.png")), Registration_Tab, null, 1);
    Tab_Index.insertTab("Materials", new ImageIcon(getClass().getResource("/prg_381_project/icons/materials.png")), Materials_Tab, null, 2);
    Tab_Index.insertTab("Issaunce", new ImageIcon(getClass().getResource("/prg_381_project/icons/issuance.png")), Issuance_Tab, null, 3);
    Tab_Index.insertTab("Suppliers", new ImageIcon(getClass().getResource("/prg_381_project/icons/suppliers.png")), Suppliers_Tab, null, 4);
    Tab_Index.insertTab("Cleaners", new ImageIcon(getClass().getResource("/prg_381_project/icons/cleaners.png")), Cleaners_Tab, null, 5);
    Tab_Index.insertTab("Dashboard", new ImageIcon(getClass().getResource("/prg_381_project/icons/dashboard.png")), Dashboard_Tab, null, 6);

    Tab_Index.remove(Login_Tab);
    pack();
    setLocationRelativeTo(null);
}

public void Show_User_Tabs(){
    Tab_Index.insertTab("registration", new ImageIcon(getClass().getResource("/prg_381_project/icons/registration.png")), Registration_Tab, null, 1);
    Tab_Index.insertTab("Materials", new ImageIcon(getClass().getResource("/prg_381_project/icons/materials.png")), Materials_Tab, null, 2);
    Tab_Index.insertTab("Issaunce", new ImageIcon(getClass().getResource("/prg_381_project/icons/issuance.png")), Issuance_Tab, null, 3);
    Tab_Index.insertTab("Suppliers", new ImageIcon(getClass().getResource("/prg_381_project/icons/suppliers.png")), Suppliers_Tab, null, 4);
    Tab_Index.insertTab("Cleaners", new ImageIcon(getClass().getResource("/prg_381_project/icons/cleaners.png")), Cleaners_Tab, null, 5);
    Tab_Index.insertTab("Dashboard", new ImageIcon(getClass().getResource("/prg_381_project/icons/dashboard.png")), Dashboard_Tab, null, 6);

    Materials_Tab_Index.remove(Add_Materials_Tab);
    Materials_Tab_Index.remove(Update_Materials_Tab);
    Materials_Tab_Index.remove(Delete_Materials_Tab);

    Suppliers_Tab_Index.remove(Add_Suppliers_Tab);

    Issuance_Tab_Index.remove(Add_Issuance_Tab);
    Issuance_Tab_Index.remove(Update_Issuance_Tab);
    Issuance_Tab_Index.remove(Delete_Issuance_Tab);

    Cleaners_Tab_Index.remove(Add_Cleaners_Tab);

    Tab_Index.remove(Login_Tab);
    pack();
    setLocationRelativeTo(null);
}
    public void Show_User_Tabs(){
     Tab_Index.insertTab("registration", null, Registration_Tab, null, 1);
     Tab_Index.insertTab("Materials", null, Materials_Tab, null, 2);
     Tab_Index.insertTab("Issaunce", null, Issuance_Tab, null, 3);
     Tab_Index.insertTab("Suppliers", null, Suppliers_Tab, null, 4);
     Tab_Index.insertTab("Cleaners", null, Cleaners_Tab, null, 5);
     
     Materials_Tab_Index.remove(Add_Materials_Tab);
            Materials_Tab_Index.remove(Update_Materials_Tab);
            Materials_Tab_Index.remove(Delete_Materials_Tab);
            
            Suppliers_Tab_Index.remove(Add_Suppliers_Tab);
            
            
            Issuance_Tab_Index.remove(Add_Issuance_Tab);
            Issuance_Tab_Index.remove(Update_Issuance_Tab);
            Issuance_Tab_Index.remove(Delete_Issuance_Tab);
            
            Cleaners_Tab_Index.remove(Add_Cleaners_Tab);
            // Note: Issuance_Tab_Index sub-tab references above are now no-ops
            // because IssuancePanel replaced the tab content in the constructor.
            // They are kept to avoid compile errors from the GEN variables block.
            
  
     Tab_Index.remove(Login_Tab);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_Cleaners_Tab;
    private javax.swing.JPanel Add_Issuance_Tab;
    private javax.swing.JPanel Add_Materials_Tab;
    private javax.swing.JPanel Add_Suppliers_Tab;
    private javax.swing.JButton Btn_Add_User;
    private javax.swing.JButton Btn_Login;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JTextField Cleaner_Department;
    public javax.swing.JTextField Cleaner_ID;
    private javax.swing.JTextField Cleaner_Name1;
    private javax.swing.JTextField Cleaner_Surname1;
    private javax.swing.JPanel Cleaner_Tab;
    private javax.swing.JPanel Cleaners_Tab;
    private javax.swing.JTabbedPane Cleaners_Tab_Index;
    private javax.swing.JPanel Delete_Issuance_Tab;
    private javax.swing.JPanel Delete_Materials_Tab;
    private javax.swing.JPanel Issuance_Tab;
    private javax.swing.JTabbedPane Issuance_Tab_Index;
    private javax.swing.JPasswordField Login_Password_Field;
    private javax.swing.JPanel Login_Tab;
    private javax.swing.JTextField Login_Username_Field;
    private javax.swing.JPanel Logout_Tab;
    private javax.swing.JPanel Materials_Tab;
    private javax.swing.JTabbedPane Materials_Tab_Index;
    private javax.swing.JTextField Register_Email_Field;
    private javax.swing.JTextField Register_Password_Field;
    private javax.swing.JTextField Register_Role_Field;
    private javax.swing.JTextField Register_Username_Field;
    private javax.swing.JPanel Registration_Tab;
    private javax.swing.JTextField Supplier_Address;
    private javax.swing.JTextField Supplier_Email;
    private javax.swing.JTextField Supplier_ID;
    private javax.swing.JTextField Supplier_Name1;
    private javax.swing.JTextField Supplier_Phone;
    private javax.swing.JPanel Supplier_Tab;
    private javax.swing.JPanel Suppliers_Tab;
    private javax.swing.JTabbedPane Suppliers_Tab_Index;
    private javax.swing.JTabbedPane Tab_Index;
    private javax.swing.JPanel Update_Issuance_Tab;
    private javax.swing.JPanel Update_Materials_Tab;
    private javax.swing.JPanel View_Cleaners_Tab;
    private javax.swing.JPanel View_Issuance_Tab;
    private javax.swing.JPanel View_Materials_Tab;
    private javax.swing.JPanel View_Suppliers_Tab;
    private javax.swing.JButton cl_Add;
    private javax.swing.JButton cl_Delete;
    private javax.swing.JButton cl_Update;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JButton supp_Add;
    private javax.swing.JButton supp_Delete;
    private javax.swing.JButton supp_Update;
    // End of variables declaration//GEN-END:variables
}


