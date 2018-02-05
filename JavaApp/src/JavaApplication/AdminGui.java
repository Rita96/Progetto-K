/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import com.mysql.jdbc.Connection;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 *
 * @author toalgrim
 */

    
    public class AdminGui extends JFrame {

    private JButton jAggiungiBanditore;
    private JButton jAggiungiUtente;
    private JButton jEliminaAsta;
    private JButton jEsci;
    private JButton jLogout;
    private JButton jModificaAsta;
    private JButton jRimuoviBanditore;
    private JButton jRimuoviUtente;
    private JLabel jSaluto;
    private Connection db;
    
    public AdminGui(Admin a1, Connection db) {
        this.db = db;
        initComponents(a1);
        this.setVisible(true);
    }

                           
    private void initComponents(Admin a1) {
        
       

        
        jSaluto = new JLabel();
        jEsci = new JButton();
        jAggiungiUtente = new JButton();
        jAggiungiBanditore = new JButton();
        jRimuoviBanditore = new JButton();
        jRimuoviUtente = new JButton();
        jEliminaAsta = new JButton();
        jModificaAsta = new JButton();
        jLogout = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        
        

        jSaluto.setText("Ciao " + a1.getNomeUtente());

        jEsci.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jEsci.setText("Esci");
        jEsci.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEsciActionPerformed(evt);
            }
        });

        jAggiungiUtente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAggiungiUtente.setText("Aggiungi utente");
        jAggiungiUtente.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAggiungiUtenteActionPerformed(evt);
            }
        });

        jAggiungiBanditore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAggiungiBanditore.setText("Rimuovi banditore");
        jAggiungiBanditore.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRimuoviBanditoreActionPerformed(evt);
            }
        });

        jRimuoviBanditore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRimuoviBanditore.setText("Aggiungi banditore");
        jRimuoviBanditore.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAggiungiBanditoreActionPerformed(evt);
            }
        });

        jRimuoviUtente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRimuoviUtente.setText("Rimuovi utente");
        jRimuoviUtente.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRimuoviUtenteActionPerformed(evt);
            }
        });

        jEliminaAsta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jEliminaAsta.setText("Elimina asta");
        jEliminaAsta.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminaAstaActionPerformed(evt);
            }
        });

        jModificaAsta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jModificaAsta.setText("Modifica asta");
        jModificaAsta.addActionListener(new ActionListener() {
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
    }         

                                          

    private void jEsciActionPerformed(ActionEvent evt) {        
        try {
            db.close();
        }
        catch(Exception e) {
            System.err.println("Il database non si è chiuso correttamente");
        }
        finally {
            System.exit(0);
        }
        
    }                                                               

    private void jRimuoviBanditoreActionPerformed(ActionEvent evt) {   
        ArrayList<Banditore> listaBanditori = Banditore.creaListaBanditori(db);
        ListaBanditoriGui lbg = new ListaBanditoriGui(db, listaBanditori);
    }                                                  

    private void jModificaAstaActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jLogoutActionPerformed(ActionEvent evt) {                                        
        LoginGui login= new LoginGui(db);
        this.setVisible(false);
    }                                       

    private void jAggiungiUtenteActionPerformed(ActionEvent evt) {                                                
        FormRegistrazione fg = new FormRegistrazione(1, db);
    }                                               

    private void jRimuoviUtenteActionPerformed(ActionEvent evt) {    
        ArrayList<Utente> listaUtenti = Utente.creaListaUtenti(db);
        ListaUtentiGui listaUtentiGui = new ListaUtentiGui(db, listaUtenti);
    }                                              

    private void jEliminaAstaActionPerformed(ActionEvent evt) {                                             
        
    }                                            

    private void jAggiungiBanditoreActionPerformed(ActionEvent evt) {                                                  
        FormRegistrazione fg = new FormRegistrazione(2, db);

    }                                                 
}


   