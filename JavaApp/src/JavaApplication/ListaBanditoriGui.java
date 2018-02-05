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
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author toalgrim
 */
public class ListaBanditoriGui extends JFrame{
    
    private JList<Utente> jList1;
    private JScrollPane jScrollPane1;
    private JLabel jTitolo;
    private Connection db;
    DefaultListModel model;
    private javax.swing.JButton jElimina;

    
    public ListaBanditoriGui(Connection db, ArrayList listaBanditori) {
        this.db = db;
        initComponents(listaBanditori);
        this.setVisible(true);
    }
    
    private void initComponents(ArrayList listaBanditori) {

        jTitolo = new javax.swing.JLabel();
        setDefaultCloseOperation();
        setTitle("Lista banditori");
        jElimina = new javax.swing.JButton();


        jTitolo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTitolo.setText("Lista banditori");
       
        
        model = new DefaultListModel();
        jList1 = new JList(model);
        jScrollPane1 = new JScrollPane(jList1);
        for (int i=0; i<listaBanditori.size(); i++) {
            model.addElement(listaBanditori.get(i));
        }
        jList1.setSelectedIndex(0);
        
        jElimina.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jElimina.setText("Elimina banditore");
        jElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminaActionPerformed(evt);
            }
        });
        

        
        /*jList1.setModel(new javax.swing.AbstractListModel<Cliente>() {
            String[] strings = { };
            public int getSize() { return listaUtenti.size(); }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);*/

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
                .addComponent(jElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void setDefaultCloseOperation() {
         this.setVisible(false);
     }
    
    private void jEliminaActionPerformed(java.awt.event.ActionEvent evt) { 
        
        
        int codice = jList1.getSelectedValue().getId();
        int reply = JOptionPane.showConfirmDialog(null, "Vuoi davvero eliminare l'utente " + jList1.getSelectedValue() +"?", "Eliminazione banditore", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == reply) {
            Admin.rimuoviUtente(db, codice);
            this.setVisible(false);
        }
        System.out.println(jList1.getSelectedValue());
       
    }        
        
    
    
}
