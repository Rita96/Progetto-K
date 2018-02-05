/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import javax.swing.JFrame;

/**
 *
 * @author toalgrim
 */
public class UtenteGui extends JFrame{
    
    private javax.swing.JButton jLogOut;
    private javax.swing.JButton jOffertefatte;
    private javax.swing.JLabel jSaluto;
    private javax.swing.JButton jVisualizzaAste;
    private javax.swing.JButton jesci;
    private Connection db;
    
    public UtenteGui(Connection db, Utente u1) {
        this.db = db;
        initComponents(u1);
        this.setVisible(true);
    }
    
    private void initComponents(Utente u1) {

        jSaluto = new javax.swing.JLabel();
        jLogOut = new javax.swing.JButton();
        jOffertefatte = new javax.swing.JButton();
        jVisualizzaAste = new javax.swing.JButton();
        jesci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(u1.getUsername());
        setMinimumSize(new java.awt.Dimension(800, 600));

        jSaluto.setText("Ciao, " + u1.getUsername());

        jLogOut.setText("Logout");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        jOffertefatte.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jOffertefatte.setText("Visualizza offerte fatte");
        jOffertefatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOffertefatteActionPerformed(evt);
            }
        });

        jVisualizzaAste.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jVisualizzaAste.setText("Visualizza aste");
        jVisualizzaAste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisualizzaAsteActionPerformed(evt);
            }
        });

        jesci.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jesci.setText("Esci");
        jesci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jesciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSaluto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLogOut)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jesci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jOffertefatte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVisualizzaAste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaluto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogOut))
                .addGap(51, 51, 51)
                .addComponent(jOffertefatte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jVisualizzaAste, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jesci, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>                        

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {                                        
        LoginGui login= new LoginGui(db);
        this.setVisible(false);
    }                                       

    private void jOffertefatteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jVisualizzaAsteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jesciActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.exit(0);
    }   
}
