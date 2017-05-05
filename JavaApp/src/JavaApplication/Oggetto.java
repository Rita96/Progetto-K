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
    private int codiceoggetto;
    
    public Oggetto(int codiceoggetto,String nomeoggetto, String descrizione) {
        this.codiceoggetto=codiceoggetto;
        this.nomeoggetto = nomeoggetto;
        this.descrizione = descrizione;
}
    
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public String getNomeOggetto() {
        return this.nomeoggetto;
    } 
    public int getCodiceOggetto() {
        return this.codiceoggetto;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public void setNomeOggetto(String nomeoggetto) {
        this.nomeoggetto = nomeoggetto;
    }
    
    public void setCodiceOggetto(int codiceoggetto) {
        this.codiceoggetto = codiceoggetto;
    }
    
    /*
    metodo aggiungiOggetto() da completare una volta realizzato il database degli oggetti
    */
    public void aggiungiOggetto() {
    }
    
}
