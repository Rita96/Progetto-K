/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;

/**
 *
 * @author toalgrim
 */
public class FormRegistrazioneGui extends JFrame{
    
    private JButton jBottoneRegistrazione;
    private JTextField jCognome;
    private JLabel jLabel1;
    private JLabel jLabelCognome;
    private JLabel jLabelNome;
    private JLabel jLabelPass1;
    private JLabel jLabelPass2;
    private JTextField jNome;
    private JPasswordField jPass;
    private JPasswordField jPass1;
    private JButton jButtonAnnulla;
    private int numeroTipoUtente;
    private Connection db;
    
    
    
    public FormRegistrazioneGui(int numeroTipoUtente, Connection db) {
        this.db = db;
        this.numeroTipoUtente = numeroTipoUtente;
        initComponents();
        this.setVisible(true);
    }
    
    private void initComponents() {

        jLabelNome = new JLabel();
        jNome = new JTextField();
        jLabelPass2 = new JLabel();
        jBottoneRegistrazione = new JButton();
        jPass1 = new JPasswordField();
        jLabelPass1 = new JLabel();
        jPass = new JPasswordField();
        jLabelCognome = new JLabel();
        jCognome = new JTextField();
        jLabel1 = new JLabel();
        jButtonAnnulla = new JButton();

        setDefaultCloseOperation();

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelNome.setText("Nome Utente:");

        jNome.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jCognome.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N


        jLabelPass2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPass2.setText("Conferma Password:");

        jBottoneRegistrazione.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBottoneRegistrazione.setText("Registrati");
        jBottoneRegistrazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottoneRegistrazioneActionPerformed(evt);
            }
        });

        jPass1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabelPass1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPass1.setText("Password:");

        jPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabelCognome.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelCognome.setText("Cognome");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Registrazione");

        jButtonAnnulla.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButtonAnnulla.setText("Annulla registrazione");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBottoneRegistrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(jLabelPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPass1)
                            .addComponent(jNome)
                            .addComponent(jPass)
                            .addComponent(jCognome))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jPass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCognome, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jCognome))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBottoneRegistrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );

        pack();
    }
    
    private void jBottoneRegistrazioneActionPerformed(java.awt.event.ActionEvent evt) {   
        if (jNome.getText().equalsIgnoreCase("")) {
        }
        String nomeUtente = jNome.getText();
        String pass = new String(jPass.getPassword());
        String pass2 = new String(jPass1.getPassword());
        String cognome = jCognome.getText();
        JOptionPane.showMessageDialog(this, nomeUtente + pass + pass2 + cognome, "ok!", JOptionPane.ERROR_MESSAGE);
        
        
        if (nomeUtente.equalsIgnoreCase("") || pass.equals("")|| pass2.equals("") || cognome.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Errore, alcuni campi non sono stati inseriti!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        else {
            System.out.println(pass + pass2);
            Login l1 = new Login(nomeUtente, pass, pass2, cognome, numeroTipoUtente, db);
            if (l1.getRegistrazioneEffettuata()) {
                JOptionPane.showMessageDialog(this, "Registrazione effettuata con successo!", "Ok",  JOptionPane.PLAIN_MESSAGE);
                jNome.setText("");
                jPass.setText("");
                jPass1.setText("");
                jCognome.setText("");
                this.setVisible(false);
            }
            else {
                if (pass.equalsIgnoreCase(pass2)) {
                    System.out.println(pass + pass2);
                    JOptionPane.showMessageDialog(this, "Errore, username non disponibile!", "Errore", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Errore, le password non coincidono!", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
       
    }                                                     

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {                                               
       this.setVisible(false);
    }            
    
    private void setDefaultCloseOperation() {
         this.setVisible(false);
     }
    
    
    
}
