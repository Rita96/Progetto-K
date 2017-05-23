/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import static JavaApplication.Register.st0gg;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author codrin
 */
public class Login extends javax.swing.JDialog {
    Connection conn = new DBConnection() .connect(); 

    /**
     * Creates new form Login
     * @param parent
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannelloLogin = new javax.swing.JPanel();
        LoginButtom = new javax.swing.JToggleButton();
        ExitButtom = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserLoginField = new javax.swing.JTextField();
        PassLoginField = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();
        PannelloRegistrati = new javax.swing.JPanel();
        RegistratiLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeRegField = new javax.swing.JTextField();
        UserRegField = new javax.swing.JTextField();
        PassRegField = new javax.swing.JPasswordField();
        RegistratiButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PannelloLogin.setBackground(new java.awt.Color(51, 51, 51));
        PannelloLogin.setOpaque(false);

        LoginButtom.setText("Login");
        LoginButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtomActionPerformed(evt);
            }
        });

        ExitButtom.setText("Exit");
        ExitButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        UserLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginFieldActionPerformed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        LoginLabel.setText("Login Page");

        javax.swing.GroupLayout PannelloLoginLayout = new javax.swing.GroupLayout(PannelloLogin);
        PannelloLogin.setLayout(PannelloLoginLayout);
        PannelloLoginLayout.setHorizontalGroup(
            PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelloLoginLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLabel)
                    .addComponent(PassLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PannelloLoginLayout.setVerticalGroup(
            PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LoginLabel)
                .addGap(46, 46, 46)
                .addGroup(PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserLoginField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PannelloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButtom)
                .addGap(18, 18, 18)
                .addComponent(ExitButtom)
                .addGap(21, 21, 21))
        );

        PannelloRegistrati.setBackground(new java.awt.Color(51, 51, 51));
        PannelloRegistrati.setOpaque(false);

        RegistratiLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        RegistratiLabel.setText("Registrati");

        jLabel5.setText("Username:");

        jLabel6.setText("Password:");

        jLabel7.setText("Nome:");

        nomeRegField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeRegFieldActionPerformed(evt);
            }
        });

        RegistratiButtom.setText("Registrati");
        RegistratiButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistratiButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PannelloRegistratiLayout = new javax.swing.GroupLayout(PannelloRegistrati);
        PannelloRegistrati.setLayout(PannelloRegistratiLayout);
        PannelloRegistratiLayout.setHorizontalGroup(
            PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(RegistratiLabel))
                    .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserRegField)
                                    .addComponent(nomeRegField)))
                            .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RegistratiButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                                        .addComponent(PassRegField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(22, 22, 22))
        );
        PannelloRegistratiLayout.setVerticalGroup(
            PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloRegistratiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(RegistratiLabel)
                .addGap(48, 48, 48)
                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nomeRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(PannelloRegistratiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PassRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(RegistratiButtom)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PannelloRegistrati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PannelloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PannelloRegistrati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PannelloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtomActionPerformed
        // TODO add your handling code here:
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, UserLoginField.getText());
            ps.setString(2, PassLoginField.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.dispose();
                MainMenu mm = new MainMenu ();
                mm.show();
               
            }
            else {
                JOptionPane.showMessageDialog(null, "Username & Password Invalid");
                
            }
        }
        catch (Exception e) {
            
        }
    }//GEN-LAST:event_LoginButtomActionPerformed

    private void ExitButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtomActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_ExitButtomActionPerformed

    private void UserLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginFieldActionPerformed

    private void nomeRegFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeRegFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeRegFieldActionPerformed

    public String getNewID() throws SQLException{
        ResultSet rs =(new DBConnection().connect()).createStatement().executeQuery("SELECT * FROM user");
        int i = 0;
        while (rs.next()){
            i++;
        }
        return Integer.toString(i);
    } 
    
    private void RegistratiButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistratiButtomActionPerformed
       String queryReg = "insert into user ( IDuser, nome, username, password)" + "values(?, ?, ?, ?)";
            try {
           PreparedStatement ps = conn.prepareStatement(queryReg);
           ps.setString(1, getNewID());
           ps.setString(2, nomeRegField.getText());
           ps.setString(3, UserRegField.getText());
           ps.setString(4, PassRegField.getText());
           
           int rs= ps.executeUpdate();
       }
            catch (Exception e) {
            System.out.println("Errore di connessione...");
            e.printStackTrace();
            }
        
        
    }//GEN-LAST:event_RegistratiButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Login dialog = new Login (new javax.swing.JFrame(), true);
               dialog.addWindowFocusListener(new java.awt.event.WindowAdapter() {
                   
                   public void windowsclosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                       
                   }
                } );
               dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ExitButtom;
    private javax.swing.JToggleButton LoginButtom;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel PannelloLogin;
    private javax.swing.JPanel PannelloRegistrati;
    private javax.swing.JPasswordField PassLoginField;
    private javax.swing.JPasswordField PassRegField;
    private javax.swing.JButton RegistratiButtom;
    private javax.swing.JLabel RegistratiLabel;
    private javax.swing.JTextField UserLoginField;
    private javax.swing.JTextField UserRegField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomeRegField;
    // End of variables declaration//GEN-END:variables
}
