/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import java.util.*;

/**
 *
 * @author toalgrim
 */
public class TestOggetto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a,b;
        Scanner testo = new Scanner (System.in);
        System.out.println("Inserisci il nome dell'oggetto");
        a = testo.nextLine();
        System.out.println("Inserisci la descrizione dell'oggetto");
        b = testo.nextLine();
        Oggetto ogg1  = new Oggetto(1, a, b);
        System.out.println(ogg1.getCodiceOggetto() + " - " + ogg1.getNomeOggetto() + " - " + ogg1.getDescrizione());
    }
    
}
