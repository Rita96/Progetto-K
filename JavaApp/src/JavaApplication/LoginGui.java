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
public class LoginGui extends JFrame {
    
    private JButton jBottoneLogin;
    private JButton jBottoneRegistrazione;
    private JLabel jLabelNome;
    private JLabel jLabelPass;
    private JTextField jNome;
    private JPasswordField jPasswordField1;
    private JLabel jTitolo;
    private Connection db;

    

    public LoginGui(Connection db) {
        this.db = db;
        initComponents();
        this.setVisible(true);
    }
    
    private void initComponents() {

        jLabelNome = new JLabel();
        jNome = new JTextField();
        jLabelPass = new JLabel();
        jBottoneLogin = new JButton();
        jBottoneRegistrazione = new JButton();
        jPasswordField1 = new JPasswordField();
        jTitolo = new JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelNome.setText("Nome Utente: ");

        jNome.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jLabelPass.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPass.setText("Password:");


        jBottoneLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBottoneLogin.setText("Login");

        jBottoneRegistrazione.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBottoneRegistrazione.setText("Se non sei registrato clicca qui");
        
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        
        jTitolo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTitolo.setText("Casa d'aste");
        
        jBottoneLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jBottoneRegistrazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBottoneRegistrazione, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBottoneLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addGap(246, 246, 246))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGap(41, 41, 41)
                .addComponent(jBottoneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jBottoneRegistrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }
    
    
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = jNome.getText();
        String pass = new String(jPasswordField1.getPassword());
        Login l1 = new Login(nome, pass, db);
        if (l1.verificaUtentePassword(nome, pass)) {
            JOptionPane.showMessageDialog(null, "Login effettuato con successo " + l1.getTipoUtente() + " - " + l1.getCodiceUtente(), "Ok",  JOptionPane.PLAIN_MESSAGE);
            if (l1.getTipoUtente() == 0) {
                Admin a1 = new Admin(l1);
                AdminGui ag = new AdminGui(a1, db);
                this.setVisible(false);
            }
            else if (l1.getTipoUtente() == 2) {
                Banditore b1 = new Banditore(l1.getCognome(), l1.getCodiceUtente(), l1.getNomeUtente());
                BanditoreGui bg = new BanditoreGui(b1, db);
                this.setVisible(false);
            }
            else {
                Utente u1 = new Utente(l1.getCognome(), l1.getCodiceUtente(), l1.getNomeUtente());
                UtenteGui ug = new UtenteGui(db, u1);
                this.setVisible(false);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Errore, password o username non corretto!", "Errore", JOptionPane.ERROR_MESSAGE);
        }
     }
     
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
         FormRegistrazioneGui fr = new FormRegistrazioneGui(1, db);
    }   
     
     
     


                   
     
   

  
        

               
}

    

