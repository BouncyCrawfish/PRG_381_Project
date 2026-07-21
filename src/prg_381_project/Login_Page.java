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
        Suppliers_Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/update.png")));
        Suppliers_Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/delete.png")));
        
        //Set Cleaners index icons
        Cleaners_Tab_Index.setIconAt(0, new ImageIcon(getClass().getResource("/prg_381_project/icons/add.png")));
        Cleaners_Tab_Index.setIconAt(1, new ImageIcon(getClass().getResource("/prg_381_project/icons/view.png")));
        Cleaners_Tab_Index.setIconAt(2, new ImageIcon(getClass().getResource("/prg_381_project/icons/update.png")));
        Cleaners_Tab_Index.setIconAt(3, new ImageIcon(getClass().getResource("/prg_381_project/icons/delete.png")));
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        HideTabs();
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
        jLabel1.setText("Email or Username");
        Login_Tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 100, 190, 20));

        Login_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Password_Field.addActionListener(this::Login_Password_FieldActionPerformed);
        Login_Tab.add(Login_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 220, 50));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
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

        jTextPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(153, 153, 153));
        jTextPane3.setText("Add User");
        jScrollPane3.setViewportView(jTextPane3);

        Registration_Tab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 125, -1));

        Register_Username_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 50));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Username");
        Registration_Tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        Register_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 50));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        Registration_Tab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 20));

        Register_Email_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Registration_Tab.add(Register_Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
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

        javax.swing.GroupLayout Add_Suppliers_TabLayout = new javax.swing.GroupLayout(Add_Suppliers_Tab);
        Add_Suppliers_Tab.setLayout(Add_Suppliers_TabLayout);
        Add_Suppliers_TabLayout.setHorizontalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Add_Suppliers_TabLayout.setVerticalGroup(
            Add_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        Suppliers_Tab_Index.addTab("Add Suppliers", Add_Suppliers_Tab);

        javax.swing.GroupLayout View_Suppliers_TabLayout = new javax.swing.GroupLayout(View_Suppliers_Tab);
        View_Suppliers_Tab.setLayout(View_Suppliers_TabLayout);
        View_Suppliers_TabLayout.setHorizontalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        View_Suppliers_TabLayout.setVerticalGroup(
            View_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        Suppliers_Tab_Index.addTab("View Suppliers", View_Suppliers_Tab);

        javax.swing.GroupLayout Delete_Suppliers_TabLayout = new javax.swing.GroupLayout(Delete_Suppliers_Tab);
        Delete_Suppliers_Tab.setLayout(Delete_Suppliers_TabLayout);
        Delete_Suppliers_TabLayout.setHorizontalGroup(
            Delete_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Delete_Suppliers_TabLayout.setVerticalGroup(
            Delete_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        Suppliers_Tab_Index.addTab("Delete Suppliers", Delete_Suppliers_Tab);

        javax.swing.GroupLayout Update_Suppliers_TabLayout = new javax.swing.GroupLayout(Update_Suppliers_Tab);
        Update_Suppliers_Tab.setLayout(Update_Suppliers_TabLayout);
        Update_Suppliers_TabLayout.setHorizontalGroup(
            Update_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        Update_Suppliers_TabLayout.setVerticalGroup(
            Update_Suppliers_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        Suppliers_Tab_Index.addTab("Update Suppliers", Update_Suppliers_Tab);

        Suppliers_Tab.add(Suppliers_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 420));
        Suppliers_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Suppliers", Suppliers_Tab);

        Cleaners_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout Add_Cleaners_TabLayout = new javax.swing.GroupLayout(Add_Cleaners_Tab);
        Add_Cleaners_Tab.setLayout(Add_Cleaners_TabLayout);
        Add_Cleaners_TabLayout.setHorizontalGroup(
            Add_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        Add_Cleaners_TabLayout.setVerticalGroup(
            Add_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Cleaners_Tab_Index.addTab("Add Cleaners", Add_Cleaners_Tab);

        javax.swing.GroupLayout View_Cleaners_TabLayout = new javax.swing.GroupLayout(View_Cleaners_Tab);
        View_Cleaners_Tab.setLayout(View_Cleaners_TabLayout);
        View_Cleaners_TabLayout.setHorizontalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        View_Cleaners_TabLayout.setVerticalGroup(
            View_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Cleaners_Tab_Index.addTab("View Cleaners", View_Cleaners_Tab);

        javax.swing.GroupLayout Update_Cleaners_TabLayout = new javax.swing.GroupLayout(Update_Cleaners_Tab);
        Update_Cleaners_Tab.setLayout(Update_Cleaners_TabLayout);
        Update_Cleaners_TabLayout.setHorizontalGroup(
            Update_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        Update_Cleaners_TabLayout.setVerticalGroup(
            Update_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Cleaners_Tab_Index.addTab("Update Cleaners", Update_Cleaners_Tab);

        javax.swing.GroupLayout Delete_Cleaners_TabLayout = new javax.swing.GroupLayout(Delete_Cleaners_Tab);
        Delete_Cleaners_Tab.setLayout(Delete_Cleaners_TabLayout);
        Delete_Cleaners_TabLayout.setHorizontalGroup(
            Delete_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        Delete_Cleaners_TabLayout.setVerticalGroup(
            Delete_Cleaners_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Cleaners_Tab_Index.addTab("Delete Cleaners", Delete_Cleaners_Tab);

        Cleaners_Tab.add(Cleaners_Tab_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        Cleaners_Tab_Index.getAccessibleContext().setAccessibleName("");

        Tab_Index.addTab("Cleaners", Cleaners_Tab);

        Logout_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Logout_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Logout_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Logout.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        Btn_Logout.setForeground(new java.awt.Color(0, 0, 0));
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
            Suppliers_Tab_Index.remove(Update_Suppliers_Tab);
            Suppliers_Tab_Index.remove(Delete_Suppliers_Tab);
            
            Issuance_Tab_Index.remove(Add_Issuance_Tab);
            Issuance_Tab_Index.remove(Update_Issuance_Tab);
            Issuance_Tab_Index.remove(Delete_Issuance_Tab);
            
            Cleaners_Tab_Index.remove(Add_Cleaners_Tab);
            Cleaners_Tab_Index.remove(Update_Cleaners_Tab);
            Cleaners_Tab_Index.remove(Delete_Cleaners_Tab);
  
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
    private javax.swing.JPanel Suppliers_Tab;
    private javax.swing.JTabbedPane Suppliers_Tab_Index;
    private javax.swing.JTabbedPane Tab_Index;
    private javax.swing.JPanel Update_Cleaners_Tab;
    private javax.swing.JPanel Update_Issuance_Tab;
    private javax.swing.JPanel Update_Materials_Tab;
    private javax.swing.JPanel Update_Suppliers_Tab;
    private javax.swing.JPanel View_Cleaners_Tab;
    private javax.swing.JPanel View_Issuance_Tab;
    private javax.swing.JPanel View_Materials_Tab;
    private javax.swing.JPanel View_Suppliers_Tab;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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


