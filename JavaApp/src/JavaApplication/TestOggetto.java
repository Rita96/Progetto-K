/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author toalgrim
 */
public class TestOggetto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String a,b;
        
        System.out.println("Inserisci il nome dell'oggetto");
        a = testo.nextLine();
        System.out.println("Inserisci la descrizione dell'oggetto");
        b = testo.nextLine();
        Oggetto ogg1  = new Oggetto(1, a, b);
        System.out.println(ogg1.getCodiceOggetto() + " - " + ogg1.getNomeOggetto() + " - " + ogg1.getDescrizione());*/
        
        
        int i=0;
        String a,b;
        List <Oggetto> Ogg = new ArrayList<>();
        
        try {
            
            File x = new File("src/resources/oggetti");
            Scanner testo = new Scanner (x);
            while (testo.hasNext()){
                a = testo.nextLine();
                b = testo.nextLine();
                Ogg.add(new Oggetto(i, a, b));
                i++;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File non trovato");
        }
        
        Ogg.add(new Oggetto (i, "Ciao", "Salve"));
        Ogg.add(new Oggetto (1+1, "Console", "Xbox"));
        
        
        System.out.println(Ogg.get(i).getCodiceOggetto() + " ; " + Ogg.get(i).getNomeOggetto() + " ; " + Ogg.get(i).getDescrizione());
        
      

    }
    
}
