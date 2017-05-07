/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import java.io.File;
import java.util.Scanner;
import java.io.*;


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
    
    
    public static void aggiungiOggetto() {
        
        /*Provo ad aprire il file contenente oggetti e descrizioni, e una volta aperto aggiungo nuovi oggetti nel file*/
        String a, b;
        try
        {
            File x = new File("src/resources/oggetti");
            Scanner testo = new Scanner (System.in);
            System.out.println("Inserisci il nome dell'oggetto:");
            a = testo.nextLine();
            System.out.println("Inserisci la descrizione dell'oggetto");
            b = testo.nextLine();
            FileWriter fw = new FileWriter(x,true);         
            fw.write(a + "\n");                       
            fw.write(b + "\n");
            fw.close();
        }
        catch(IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    
}
