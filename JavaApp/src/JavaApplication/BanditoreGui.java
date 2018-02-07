/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author toalgrim
 */
public class BanditoreGui extends JFrame{
    
    private JButton jAggiungiOggetto;
    private JButton jLogOut;
    private JLabel jSaluto;
    private JButton jVisualizzaAste;
    private JButton jesci;
    private Connection db;
    private Banditore b1;
    
    public BanditoreGui(Banditore b1, Connection db) {
        this.b1 = b1;
        this.db = db;
        initComponents(b1);
        this.setVisible(true);
    }
    
    private void initComponents(Banditore b1) {

        jSaluto = new JLabel();
        jLogOut = new JButton();
        jAggiungiOggetto = new JButton();
        jVisualizzaAste = new JButton();
        jesci = new JButton();

        setMinimumSize(new Dimension(800, 600));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle(b1.getUsername());

        jSaluto.setText("Ciao, " + b1.getUsername());

        jLogOut.setText("Logout");
        jLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        jAggiungiOggetto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jAggiungiOggetto.setText("Aggiungi oggetto");
        jAggiungiOggetto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jAggiungiOggettoActionPerformed(evt);
            }
        });

        jVisualizzaAste.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jVisualizzaAste.setText("Visualizza aste");
        jVisualizzaAste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jVisualizzaAsteActionPerformed(evt);
            }
        });

        jesci.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jesci.setText("Esci");
        jesci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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
                    .addComponent(jAggiungiOggetto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(jVisualizzaAste, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaluto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogOut))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAggiungiOggetto, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jVisualizzaAste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jesci, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        
    }                       

    private void jLogOutActionPerformed(ActionEvent evt) {                                        
        LoginGui login= new LoginGui(db);
        this.setVisible(false);
    }                                       

    private void jAggiungiOggettoActionPerformed(ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jVisualizzaAsteActionPerformed(ActionEvent evt) {  
        ArrayList<Oggetto> listaOggetti = Oggetto.creaListaOggetti(db, "");
        ListaOggettiGui log = new ListaOggettiGui(db, listaOggetti, b1);
    }                                               

    private void jesciActionPerformed(ActionEvent evt) {                                      
       System.exit(0);
    }                                     

    
}
