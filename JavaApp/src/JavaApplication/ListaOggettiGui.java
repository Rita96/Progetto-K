/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author toalgrim
 */
public class ListaOggettiGui extends JFrame {
    
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JButton jButtonView;
    private javax.swing.JTextField jCerca;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jText;
    private Connection db;
    private DefaultListModel model;
    private int typeUser;
    
    public ListaOggettiGui (Connection db, ArrayList listaOggetti, Admin a1) {
        this.db = db;
        this.typeUser = 0;
        initComponents(db, listaOggetti);
        this.setVisible(true);
        
    }
    
    public ListaOggettiGui (Connection db, ArrayList listaOggetti, Utente u1) {
        this.db = db;
        this.typeUser = 1;
        initComponents(db, listaOggetti);
        this.setVisible(true);
        
    }
    
    public ListaOggettiGui (Connection db, ArrayList listaOggetti, Banditore b1) {
        this.db = db;
        this.typeUser = 2;
        initComponents(db, listaOggetti);
        this.setVisible(true);
        
    }
    
    public void initComponents(Connection db, ArrayList listaOggetti) {
        
        jText = new javax.swing.JTextField();
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jButtonFind = new javax.swing.JButton();
        jCerca = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        
        jText.setText("");
        setTitle("Oggetti");
        

        setDefaultCloseOperation();
        setMinimumSize(new java.awt.Dimension(1024, 768));

        

        model = new DefaultListModel();
        jList = new JList(model);
        jScrollPane1 = new JScrollPane(jList);
        for (int i=0; i<listaOggetti.size(); i++) {
            model.addElement(listaOggetti.get(i));
        }

        jButtonFind.setText("Cerca");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        jButtonView.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonView.setText("Visualizza oggetto");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        if (this.typeUser == 0) {
            jButtonModify.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            jButtonModify.setText("Modifica oggetto");
            jButtonModify.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonModifyActionPerformed(evt);
                }
            });
        }
        

       /* jButtonRemove.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonRemove.setText("Rimuovi oggetto");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });*/

        jButtonList.setText("Visualizza tutto");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonList, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCerca)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonModify, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCerca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonView, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jButtonModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        
    }
    
    public void setDefaultCloseOperation() {
    
        this.setVisible(false);
    }
    
                            

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
            ArrayList <Oggetto> listaOggetti = Oggetto.creaListaOggetti(db, "");
            model.removeAllElements();
            for (int i=0; i<listaOggetti.size(); i++) {
                model.addElement(listaOggetti.get(i));
            }
            
        }
       
                                              

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {  
        String testoDaCercare = jCerca.getText();
        if (!testoDaCercare.equalsIgnoreCase("")) {
            ArrayList <Oggetto> listaOggetti = Oggetto.creaListaOggetti(db, testoDaCercare);
            model.removeAllElements();
            for (int i=0; i<listaOggetti.size(); i++) {
                model.addElement(listaOggetti.get(i));
            }
            
        }
       
    }                                           

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /*private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }    */                                         
    
        
    }


    

