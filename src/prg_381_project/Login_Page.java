/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prg_381_project;

import javax.swing.WindowConstants;


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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        Tab_Index.setBackground(new java.awt.Color(102, 102, 102));
        Tab_Index.setForeground(new java.awt.Color(255, 255, 255));

        Login_Tab.setBackground(new java.awt.Color(51, 51, 51));
        Login_Tab.setForeground(new java.awt.Color(255, 255, 255));
        Login_Tab.setFocusTraversalPolicyProvider(true);
        Login_Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        Login_Tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 100, 120, 20));

        Login_Password_Field.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Login_Tab.add(Login_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 250, 220, 50));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        Login_Tab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 220, -1, -1));

        Btn_Login.setText("Log In");
        Btn_Login.addActionListener(this::Btn_LoginActionPerformed);
        Login_Tab.add(Btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 350, 220, 40));

        jTextPane1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
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

        Tab_Index.addTab("Registration", Registration_Tab);
        Registration_Tab.getAccessibleContext().setAccessibleName("Registration_Tab");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Tab_Index, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab_Index, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_LogoutActionPerformed

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed
        String Username = Login_Username_Field.getText();
        String Password = Login_Password_Field.getText();
        
        if(Username.isEmpty()|| Password.isEmpty()){
            jOptionPane1.showMessageDialog(this,
                                           "Please enter a value in all fields",
                                           "Error",
                                           jOptionPane1.ERROR_MESSAGE);
            
        }
        
        
    }//GEN-LAST:event_Btn_LoginActionPerformed


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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Login;
    private javax.swing.JButton Btn_Logout;
    private javax.swing.JPasswordField Login_Password_Field;
    private javax.swing.JPanel Login_Tab;
    private javax.swing.JTextField Login_Username_Field;
    private javax.swing.JPanel Logout_Tab;
    private javax.swing.JPanel Registration_Tab;
    private javax.swing.JTabbedPane Tab_Index;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}


