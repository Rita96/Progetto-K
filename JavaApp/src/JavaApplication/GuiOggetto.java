/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import JavaApplication.DescrizioneOggetto;
import JavaApplication.Oggetto;

/**
 *
 * @author toalgrim
 */
public class GuiOggetto extends javax.swing.JFrame {

    /**
     * Creates new form GuiOggetto
     */
    public GuiOggetto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jDescrizioneOggetto = new javax.swing.JTextPane();
        jNomeOggetto = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jNomeUtente = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScadenza = new javax.swing.JLabel();
        jUtente = new javax.swing.JLabel();
        jOfferta = new javax.swing.JLabel();
        jOraInizio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oggetto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jDescrizioneOggetto.setEditable(false);
        jDescrizioneOggetto.setBackground(new java.awt.Color(255, 255, 255));
        jDescrizioneOggetto.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jDescrizioneOggetto.setEnabled(false);
        jScrollPane1.setViewportView(jDescrizioneOggetto);

        jNomeOggetto.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jNomeOggetto.setText("Nome Oggetto");

        jButtonUpdate.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButtonUpdate.setText("Aggiorna");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jNomeUtente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jNomeUtente.setText("Ciao, Utente");

        jButtonLogOut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonLogOut.setText("LogOut");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScadenza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScadenza.setText("Scadenza asta: ");

        jUtente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jUtente.setText("Utente con offerta più alta: ");

        jOfferta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jOfferta.setText("Offerta più alta:");

        jOraInizio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jOraInizio.setText("Ora inizio asta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jOraInizio)
                    .addComponent(jScadenza, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOfferta, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jOfferta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScadenza, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jOraInizio)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jNomeOggetto, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNomeUtente)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNomeUtente)
                        .addComponent(jButtonLogOut))
                    .addComponent(jNomeOggetto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(81, 81, 81)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
        try {
            Oggetto ogg1 = new Oggetto(1006);
            setTitle(DescrizioneOggetto.getNomeOggetto(ogg1.getidOggetto()));
            jNomeOggetto.setText(DescrizioneOggetto.getNomeOggetto(ogg1.getidOggetto()));
            jDescrizioneOggetto.setText(DescrizioneOggetto.getDescrizione(ogg1.getidOggetto()));
            jOfferta.setText("Offerta più alta: " + DescrizioneOggetto.getMaxofferta(ogg1.getidOggetto()) + " Euro ");
            String utenteMaxOfferta = DescrizioneOggetto.getidUser(ogg1.getidOggetto());
            if (utenteMaxOfferta == null) {
                jUtente.setText("Nessuna offerta ricevuta");
            }
            else {
                jUtente.setText(utenteMaxOfferta);
                
            }
            
            jScadenza.setText("Data inizio asta: " + DescrizioneOggetto.getDataInizioAsta(ogg1.getidOggetto()));
            jOraInizio.setText("Ora inizio asta: " + DescrizioneOggetto.getOraInizioAsta(ogg1.getidOggetto()));
        } catch (Exception e) {
           
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(GuiOggetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiOggetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiOggetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiOggetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiOggetto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JTextPane jDescrizioneOggetto;
    private javax.swing.JLabel jNomeOggetto;
    private javax.swing.JLabel jNomeUtente;
    private javax.swing.JLabel jOfferta;
    private javax.swing.JLabel jOraInizio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jScadenza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jUtente;
    // End of variables declaration//GEN-END:variables
}
