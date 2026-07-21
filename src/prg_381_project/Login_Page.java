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



/**
 *
 * @author regar
 */
public class Login_Page extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login_Page.class.getName());

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
        initComponents();
        //Set main index icons
        Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/login.png")));
        Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/registration.png")));
        Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/materials.png")));
        Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/issuance.png")));
        Tab_Index.setIconAt(4, new ImageIcon(getClass().getResource("/prg_381_project/icons/suppliers.png")));
        Tab_Index.setIconAt(5, new ImageIcon(getClass().getResource("/prg_381_project/icons/cleaners.png")));
        Tab_Index.setIconAt(6, new ImageIcon(getClass().getResource("/prg_381_project/icons/logout.png")));
        
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

        Cleaners_Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/update.png")));
        Cleaners_Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/delete.png")));
        

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        HideTabs();
    }
    // </editor-fold>
    
    

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
        jLabel6 = new javax.swing.JLabel();
        Supplier_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Supplier_Email = new javax.swing.JTextField();
        Supplier_Phone = new javax.swing.JTextField();
        Supplier_Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Supplier_Name1 = new javax.swing.JTextField();
        Supplier_Tab3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        Supplier_ID3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Supplier_Email3 = new javax.swing.JTextField();
        supp_Add1 = new javax.swing.JButton();
        supp_Delete = new javax.swing.JButton();
        supp_Update = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Supplier_Phone3 = new javax.swing.JTextField();
        Supplier_Address3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Supplier_Name4 = new javax.swing.JTextField();
        View_Suppliers_Tab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Cleaners_Tab = new javax.swing.JPanel();
        Cleaners_Tab_Index = new javax.swing.JTabbedPane();
        Add_Cleaners_Tab = new javax.swing.JPanel();
        Cleaner_Tab = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Cleaner_Department = new javax.swing.JTextField();
        Cleaner_ID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cl_Add = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Cleaner_Surname1 = new javax.swing.JTextField();
        Cleaner_Name1 = new javax.swing.JTextField();
        Cleaner_Tab3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cl_Delete3 = new javax.swing.JButton();
        Cleaner_Department3 = new javax.swing.JTextField();
        Cleaner_ID3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cl_Add3 = new javax.swing.JButton();
        cl_Update3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        Cleaner_Surname4 = new javax.swing.JTextField();
        Cleaner_Name4 = new javax.swing.JTextField();
        View_Cleaners_Tab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        View_Suppliers_Tab = new javax.swing.JPanel();
        Delete_Suppliers_Tab = new javax.swing.JPanel();
        Update_Suppliers_Tab = new javax.swing.JPanel();
        Cleaners_Tab = new javax.swing.JPanel();
        Cleaners_Tab_Index = new javax.swing.JTabbedPane();
        Add_Cleaners_Tab = new javax.swing.JPanel();
        View_Cleaners_Tab = new javax.swing.JPanel();
        Update_Cleaners_Tab = new javax.swing.JPanel();
        Delete_Cleaners_Tab = new javax.swing.JPanel();

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
        Tab_Index.setRequestFocusEnabled(false);

        Login_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Login_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Login_Tab.setFocusTraversalPolicyProvider(true);
        Login_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        Login_Tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 100, 120, 20));

        jLabel1.setText("Email or Username");
        Login_Tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 100, 190, 20));


        Login_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Password_Field.addActionListener(this::Login_Password_FieldActionPerformed);
        Login_Tab.add(Login_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 220, 50));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        Login_Tab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 220, -1, -1));

        Btn_Login.setText("Log In");
        Btn_Login.addActionListener(this::Btn_LoginActionPerformed);
        Login_Tab.add(Btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 350, 220, 40));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(153, 153, 153));
        jTextPane1.setText("Welcome");
        jScrollPane1.setViewportView(jTextPane1);

        Login_Tab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 125, -1));

        Login_Username_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Tab.add(Login_Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 130, 220, 50));

        Tab_Index.addTab("Login", Login_Tab);
        Login_Tab.getAccessibleContext().setAccessibleName("Login_Tab");

        Registration_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Registration_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Registration_Tab.setName(""); // NOI18N
        Registration_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout Registration_TabLayout = new javax.swing.GroupLayout(Registration_Tab);
        Registration_Tab.setLayout(Registration_TabLayout);
        Registration_TabLayout.setHorizontalGroup(
            Registration_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Registration_TabLayout.setVerticalGroup(
            Registration_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jTextPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(153, 153, 153));
        jTextPane3.setText("Add User");
        jScrollPane3.setViewportView(jTextPane3);

        Registration_Tab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 125, -1));

        Register_Username_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 50));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        Registration_Tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        Register_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 50));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        Registration_Tab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 20));

        Register_Email_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("Email");
        Registration_Tab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));


        Tab_Index.addTab("Registration", Registration_Tab);
        Registration_Tab.getAccessibleContext().setAccessibleName("Registration_Tab");

        Materials_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout Add_Materials_TabLayout = new javax.swing.GroupLayout(Add_Materials_Tab);
        Add_Materials_Tab.setLayout(Add_Materials_TabLayout);
        Add_Materials_TabLayout.setHorizontalGroup(
            Add_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Add_Materials_TabLayout.setVerticalGroup(
            Add_Materials_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
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
            .addGap(0, 365, Short.MAX_VALUE)
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
            .addGap(0, 365, Short.MAX_VALUE)
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
            .addGap(0, 365, Short.MAX_VALUE)
        );

        Materials_Tab_Index.addTab("Delete Materials", Delete_Materials_Tab);

        Materials_Tab.add(Materials_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 400));

        Tab_Index.addTab("Materials", Materials_Tab);

        Issuance_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 395, Short.MAX_VALUE)
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
            .addGap(0, 395, Short.MAX_VALUE)
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
            .addGap(0, 395, Short.MAX_VALUE)
        );

        Issuance_Tab_Index.addTab("Delete Issuance", Delete_Issuance_Tab);

        Issuance_Tab.add(Issuance_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 430));

        Tab_Index.addTab("Issuance", Issuance_Tab);

        Suppliers_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suppliers_Tab_Index.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Suppliers_Tab_IndexComponentShown(evt);
            }
        });

        Supplier_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Supplier_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Supplier_Tab.setName("Suppliers"); // NOI18N
        Supplier_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setText("SupplierID");
        Supplier_Tab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Supplier_ID.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_ID.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 20));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Supplier Name");
        Supplier_Tab.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 20));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel8.setText("Supplier Address");
        Supplier_Tab.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        Supplier_Email.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Email.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 20));

        Supplier_Phone.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Phone.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 20));

        Supplier_Address.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Address.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel9.setText("Supplier Phone");
        Supplier_Tab.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 20));

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel10.setText("Supplier Email");
        Supplier_Tab.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 20));

        Supplier_Name1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Name1.setName("SName"); // NOI18N
        Supplier_Tab.add(Supplier_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 20));

        Supplier_Tab3.setBackground(new java.awt.Color(51, 51, 51));
        Supplier_Tab3.setForeground(new java.awt.Color(255, 255, 255));
        Supplier_Tab3.setName("Suppliers"); // NOI18N
        Supplier_Tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel37.setText("SupplierID");
        Supplier_Tab3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Supplier_ID3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_ID3.setName("SName"); // NOI18N
        Supplier_Tab3.add(Supplier_ID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 20));

        jLabel38.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel38.setText("Supplier Name");
        Supplier_Tab3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 20));

        jLabel39.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel39.setText("Supplier Address");
        Supplier_Tab3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        Supplier_Email3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Email3.setName("SName"); // NOI18N
        Supplier_Tab3.add(Supplier_Email3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 20));

        supp_Add1.setText("ADD");
        supp_Add1.addActionListener(this::supp_Add1ActionPerformed);
        Supplier_Tab3.add(supp_Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 220, 40));

        supp_Delete.setText("Delete");
        supp_Delete.addActionListener(this::supp_DeleteActionPerformed);
        Supplier_Tab3.add(supp_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 220, 40));

        supp_Update.setText("Update Info");
        supp_Update.addActionListener(this::supp_UpdateActionPerformed);
        Supplier_Tab3.add(supp_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, 40));

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
        jScrollPane7.setViewportView(jTable2);

        Supplier_Tab3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 410, 300));

        Supplier_Phone3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Phone3.setName("SName"); // NOI18N
        Supplier_Tab3.add(Supplier_Phone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 20));

        Supplier_Address3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Address3.setName("SName"); // NOI18N
        Supplier_Tab3.add(Supplier_Address3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        jLabel40.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel40.setText("Supplier Phone");
        Supplier_Tab3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 20));

        jLabel41.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel41.setText("Supplier Email");
        Supplier_Tab3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 20));

        Supplier_Name4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Supplier_Name4.setName("SName"); // NOI18N
        Supplier_Tab3.add(Supplier_Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 20));

        Supplier_Tab.add(Supplier_Tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout Add_Suppliers_TabLayout = new javax.swing.GroupLayout(Add_Suppliers_Tab);
        Add_Suppliers_Tab.setLayout(Add_Suppliers_TabLayout);
        Add_Suppliers_TabLayout.setHorizontalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Suppliers_TabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Supplier_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        Add_Suppliers_TabLayout.setVerticalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_Suppliers_TabLayout.createSequentialGroup()
                .addComponent(Supplier_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Suppliers_Tab_Index.addTab("Suppliers Tab", Add_Suppliers_Tab);

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
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout View_Suppliers_TabLayout = new javax.swing.GroupLayout(View_Suppliers_Tab);
        View_Suppliers_Tab.setLayout(View_Suppliers_TabLayout);
        View_Suppliers_TabLayout.setHorizontalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        View_Suppliers_TabLayout.setVerticalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Suppliers_TabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        Suppliers_Tab_Index.addTab("View Suppliers", View_Suppliers_Tab);

        Suppliers_Tab.add(Suppliers_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));
        Suppliers_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Suppliers", Suppliers_Tab);

        Cleaners_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cleaner_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Cleaner_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Cleaner_Tab.setFocusTraversalPolicyProvider(true);
        Cleaner_Tab.setName("Cleaners"); // NOI18N
        Cleaner_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel21.setText("Cleaner Department");
        Cleaner_Tab.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel22.setText("CleanerID");
        Cleaner_Tab.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Cleaner_Department.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Department.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        Cleaner_ID.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_ID.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 20));

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel23.setText("Cleaner Name");
        Cleaner_Tab.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 20));

        cl_Add.setText("ADD");
        cl_Add.addActionListener(this::cl_AddActionPerformed);
        Cleaner_Tab.add(cl_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 40));

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel24.setText("Cleaner Surname");
        Cleaner_Tab.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        Cleaner_Surname1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Surname1.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Surname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 220, 20));

        Cleaner_Name1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Name1.setName("SName"); // NOI18N
        Cleaner_Tab.add(Cleaner_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 20));

        Cleaner_Tab3.setBackground(new java.awt.Color(51, 51, 51));
        Cleaner_Tab3.setForeground(new java.awt.Color(255, 255, 255));
        Cleaner_Tab3.setFocusTraversalPolicyProvider(true);
        Cleaner_Tab3.setName("Cleaners"); // NOI18N
        Cleaner_Tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel33.setText("Cleaner Department");
        Cleaner_Tab3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 20));

        jLabel34.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel34.setText("CleanerID");
        Cleaner_Tab3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cl_Delete3.setText("Delete");
        cl_Delete3.addActionListener(this::cl_Delete3ActionPerformed);
        Cleaner_Tab3.add(cl_Delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 220, 40));

        Cleaner_Department3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Department3.setName("SName"); // NOI18N
        Cleaner_Tab3.add(Cleaner_Department3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 20));

        Cleaner_ID3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_ID3.setName("SName"); // NOI18N
        Cleaner_Tab3.add(Cleaner_ID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 20));

        jLabel35.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel35.setText("Cleaner Name");
        Cleaner_Tab3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 20));

        cl_Add3.setText("ADD");
        cl_Add3.addActionListener(this::cl_Add3ActionPerformed);
        Cleaner_Tab3.add(cl_Add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 40));

        cl_Update3.setText("Update Info");
        cl_Update3.addActionListener(this::cl_Update3ActionPerformed);
        Cleaner_Tab3.add(cl_Update3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 220, 40));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable4ComponentShown(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        Cleaner_Tab3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 390, 250));

        jLabel36.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel36.setText("Cleaner Surname");
        Cleaner_Tab3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        Cleaner_Surname4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Surname4.setName("SName"); // NOI18N
        Cleaner_Tab3.add(Cleaner_Surname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 220, 20));

        Cleaner_Name4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Cleaner_Name4.setName("SName"); // NOI18N
        Cleaner_Tab3.add(Cleaner_Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 20));

        Cleaner_Tab.add(Cleaner_Tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout Add_Cleaners_TabLayout = new javax.swing.GroupLayout(Add_Cleaners_Tab);
        Add_Cleaners_Tab.setLayout(Add_Cleaners_TabLayout);
        Add_Cleaners_TabLayout.setHorizontalGroup(
            Add_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Cleaners_TabLayout.createSequentialGroup()
                .addComponent(Cleaner_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        Add_Cleaners_TabLayout.setVerticalGroup(
            Add_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_Cleaners_TabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cleaner_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Cleaners_Tab_Index.addTab("Cleaners Tab", Add_Cleaners_Tab);

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout View_Cleaners_TabLayout = new javax.swing.GroupLayout(View_Cleaners_Tab);
        View_Cleaners_Tab.setLayout(View_Cleaners_TabLayout);
        View_Cleaners_TabLayout.setHorizontalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Cleaners_TabLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        View_Cleaners_TabLayout.setVerticalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_Cleaners_TabLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        Cleaners_Tab_Index.addTab("View Cleaners", View_Cleaners_Tab);

        Cleaners_Tab.add(Cleaners_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        Cleaners_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Cleaners", Cleaners_Tab);


        Logout_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Logout_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Logout_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Logout.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        Btn_Logout.setText("Log Out");
        Btn_Logout.addActionListener(this::Btn_LogoutActionPerformed);
        Logout_Tab.add(Btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 100));

        Tab_Index.addTab("Logout", Logout_Tab);
        Logout_Tab.getAccessibleContext().setAccessibleName("Logout_Tab");
        Logout_Tab.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 830, -1));

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
                jOptionPane1.showMessageDialog(this,
                                           "Logged in as "+Username,
                                           "Login Success",
                                           jOptionPane1.INFORMATION_MESSAGE);
            }
            else{
                jOptionPane1.showMessageDialog(this,
                                           "Username or Password Incorrect",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            }
            
            switch (user.getRole()){
                case "admin":
                Show_Admin_Tabs();
                break;
                
                case "supervisor":
                Show_Admin_Tabs();
                break;
                
                case "staff":
                Show_User_Tabs();
                break;
                
               default:
                jOptionPane1.showMessageDialog(this,
                                           "Error",
                                           "Unkown Role",
                                           jOptionPane1.ERROR_MESSAGE);
                break; 
                
            }    
            
   
         
        } catch (Exception e) {
           jOptionPane1.showMessageDialog(this,
                                           "Error",
                                           e.getMessage(),
                                           jOptionPane1.ERROR_MESSAGE); 
        }
        
    }
    public void HideTabs(){
            Tab_Index.remove(Registration_Tab);
            Tab_Index.remove(Materials_Tab);
            Tab_Index.remove(Issuance_Tab);
            Tab_Index.remove(Suppliers_Tab);
            Tab_Index.remove(Cleaners_Tab);

    }
    
    public void Show_Admin_Tabs(){
     Tab_Index.insertTab("registration", null, Registration_Tab, null, 1);
     Tab_Index.insertTab("Materials", null, Materials_Tab, null, 2);
     Tab_Index.insertTab("Issaunce", null, Issuance_Tab, null, 3);
     Tab_Index.insertTab("Suppliers", null, Suppliers_Tab, null, 4);
     Tab_Index.insertTab("Cleaners", null, Cleaners_Tab, null, 5);
     
     Tab_Index.remove(Login_Tab);
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
           
  
     Tab_Index.remove(Login_Tab);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_Cleaners_Tab;
    private javax.swing.JPanel Add_Issuance_Tab;
    private javax.swing.JPanel Add_Materials_Tab;
    private javax.swing.JPanel Add_Suppliers_Tab;
    private javax.swing.JButton Btn_Login;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JPanel Cleaners_Tab;
    private javax.swing.JTabbedPane Cleaners_Tab_Index;
    private javax.swing.JPanel Delete_Cleaners_Tab;
    private javax.swing.JPanel Delete_Issuance_Tab;
    private javax.swing.JPanel Delete_Materials_Tab;
    private javax.swing.JPanel Delete_Suppliers_Tab;
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
    private javax.swing.JTextField Register_Username_Field;
    private javax.swing.JPanel Registration_Tab;
    private javax.swing.JTabbedPane Tab_Index;
    private javax.swing.JPanel View_Cleaners_Tab;
    private javax.swing.JPanel View_Issuance_Tab;
    private javax.swing.JPanel View_Materials_Tab;
    private javax.swing.JPanel View_Suppliers_Tab;
    private javax.swing.JButton cl_Add;
    private javax.swing.JButton cl_Add3;
    private javax.swing.JButton cl_Delete3;
    private javax.swing.JButton cl_Update3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;

    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}


