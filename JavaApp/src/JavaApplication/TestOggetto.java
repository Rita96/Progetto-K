/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author toalgrim
 */

public class TestOggetto {

    public static void main(String[] args) {
           Connection conn = new DBConnection().connect();
        int i = 0;
        int scelta = 0;
        String a, b, c;
        boolean verifica = false;
        Scanner input = new Scanner(System.in);
        
          /* Creo una lista di oggetti*/
        List <Oggetto> Ogg = new ArrayList<>();
        
        /* Scegli se aggiungere oggetto, trovare un oggetto per una stringa, trovare un oggetto a partire dal codice o uscire dal programma*/
        do {
            System.out.println("Che operazione vuoi fare?\n 1 - Aggiungi oggetto\n 2 - Trova oggetto\n 3 - Stampa oggetto a partire dal codice\n 4 - Esci");
            try { 
                scelta = input.nextInt();
                verifica = true;
                }
            catch (InputMismatchException e) {
                    System.out.println("Errore nell'input");
                    input.next();
                } while (verifica != true);
            
            switch(scelta) {
                
                case 1:
                    Oggetto.aggiungiOggetto();
                    break;
                    
                case 2:
                i = 0;
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
                    catch (FileNotFoundException e) {
                        System.out.println("File non trovato");
                    }
                    Scanner trova = new Scanner(System.in);
                    System.out.println("Cosa vuoi cercare? Inserisci una stringa:");
                    c = trova.nextLine();
                    for (int j = 0; j < i ;j++) {
                        boolean retval = Ogg.get(j).getNomeOggetto().contains(c);
                        if (retval == true) {
                            System.out.println("\n" + Ogg.get(j).getCodiceOggetto() + " - " + Ogg.get(j).getNomeOggetto() + " - " + Ogg.get(j).getDescrizione()+ "\n");
                    }
                        else {
                            retval = Ogg.get(j).getDescrizione().contains(c);
                            if (retval == true) {
                                System.out.println("\n" + Ogg.get(j).getCodiceOggetto() + " - " + Ogg.get(j).getNomeOggetto() + " - " + Ogg.get(j).getDescrizione() + "\n");
                            }
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Inserisci il codice dell'articolo:");
                    Scanner code = new Scanner(System.in);
                    int j = code.nextInt();
                    i = 0;
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
                    catch (FileNotFoundException e) {
                        System.out.println("File non trovato");
                    }
                    if (j>=i || j<0) {
                        System.out.println("Codice non trovato");
                    }
                    else {
                        System.out.println("\n" + Ogg.get(j).getCodiceOggetto() + " - " + Ogg.get(j).getNomeOggetto() + " - " + Ogg.get(j).getDescrizione()+ "\n");
                    }
                    break;
                    
                case 4:
                break;
            }  
        } while (scelta!= 4);
    }
}
