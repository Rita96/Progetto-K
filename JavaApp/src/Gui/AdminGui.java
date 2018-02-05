package Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toalgrim
 */
public class AdminGui extends javax.swing.JFrame {

    /**
     * Creates new form AdminGui
     * @param l1
     */
    public AdminGui() {
        initComponents();
        //Login l = l1;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSaluto = new javax.swing.JLabel();
        jEsci = new javax.swing.JButton();
        jAggiungiUtente = new javax.swing.JButton();
        jAggiungiBanditore = new javax.swing.JButton();
        jRimuoviBanditore = new javax.swing.JButton();
        jRimuoviUtente = new javax.swing.JButton();
        jEliminaAsta = new javax.swing.JButton();
        jModificaAsta = new javax.swing.JButton();
        jLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSaluto.setText("Ciao ");

        jEsci.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jEsci.setText("Esci");
        jEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEsciActionPerformed(evt);
            }
        });

        jAggiungiUtente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAggiungiUtente.setText("Aggiungi utente");
        jAggiungiUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAggiungiUtenteActionPerformed(evt);
            }
        });

        jAggiungiBanditore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAggiungiBanditore.setText("Aggiungi banditore");
        jAggiungiBanditore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAggiungiBanditoreActionPerformed(evt);
            }
        });

        jRimuoviBanditore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRimuoviBanditore.setText("Rimuovi banditore");
        jRimuoviBanditore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRimuoviBanditoreActionPerformed(evt);
            }
        });

        jRimuoviUtente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRimuoviUtente.setText("Rimuovi utente");
        jRimuoviUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRimuoviUtenteActionPerformed(evt);
            }
        });

        jEliminaAsta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jEliminaAsta.setText("Elimina asta");
        jEliminaAsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminaAstaActionPerformed(evt);
            }
        });

        jModificaAsta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jModificaAsta.setText("Modifica asta");
        jModificaAsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaAstaActionPerformed(evt);
            }
        });

        jLogout.setText("Logout");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRimuoviBanditore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAggiungiBanditore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRimuoviUtente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAggiungiUtente, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jModificaAsta, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jEliminaAsta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jEsci, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSaluto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLogout)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogout)
                    .addComponent(jSaluto))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAggiungiUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jModificaAsta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRimuoviUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEliminaAsta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jAggiungiBanditore, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRimuoviBanditore, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jEsci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEsciActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jSaluto.setText("Ciao ");
        
    }//GEN-LAST:event_formWindowOpened

    private void jAggiungiBanditoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAggiungiBanditoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAggiungiBanditoreActionPerformed

    private void jModificaAstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaAstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jModificaAstaActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jAggiungiUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAggiungiUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAggiungiUtenteActionPerformed

    private void jRimuoviUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRimuoviUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRimuoviUtenteActionPerformed

    private void jEliminaAstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminaAstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEliminaAstaActionPerformed

    private void jRimuoviBanditoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRimuoviBanditoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRimuoviBanditoreActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminGui(Login l1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAggiungiBanditore;
    private javax.swing.JButton jAggiungiUtente;
    private javax.swing.JButton jEliminaAsta;
    private javax.swing.JButton jEsci;
    private javax.swing.JButton jLogout;
    private javax.swing.JButton jModificaAsta;
    private javax.swing.JButton jRimuoviBanditore;
    private javax.swing.JButton jRimuoviUtente;
    private javax.swing.JLabel jSaluto;
    // End of variables declaration//GEN-END:variables
}
