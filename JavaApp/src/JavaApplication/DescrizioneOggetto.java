/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

/**
 *
 * @author andre
 */
public class DescrizioneOggetto {
    private int idOggetto, quantita, prezzoIniziale;
    
    public DescrizioneOggetto(int idOggetto , int quantita , int prezzoIniziale) {
        this.idOggetto = idOggetto ;
        this.quantita = quantita;
        this.prezzoIniziale = prezzoIniziale;
}
    
    public int getidOggetto() {
        return this.idOggetto;
    }
    
    public int getquantita() {
        return this.quantita;
    } 
    public int getprezzoIniziale() {
        return this.prezzoIniziale;
    }
    
    public void setidOggetto(int idOggetto) {
        this.idOggetto = idOggetto ;
    }
    
    public void setquantita(int quantita) {
        this.quantita = quantita;
    }
    
    public void setprezzoIniziale (int prezzoIniziale) {
        this.prezzoIniziale = prezzoIniziale;
    }
    
    
}
