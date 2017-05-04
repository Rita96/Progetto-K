/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

/**
 *
 * @author toalgrim
 */
public class Oggetto {
    
    private String nomeoggetto;
    private String descrizione;
    
    public Oggetto(String nomeoggetto, String descrizione) {
        this.nomeoggetto = nomeoggetto;
        this.descrizione = descrizione;
}
    
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public String getNomeOggetto() {
        return this.nomeoggetto;
    } 
    
    public void setDescrizione(String descrizione) {
        descrizione = this.descrizione;
    }
    
    public void setNomeOggetto(String nomeoggetto) {
        nomeoggetto = this.nomeoggetto;
    }
    
    /*
    metodo aggiungiOggetto() da completare una volta realizzato il database degli oggetti
    */
    public void aggiungiOggetto() {
    }
    
}
