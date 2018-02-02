/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import JavaApplication.DescrizioneOggetto;
import java.sql.*;

/**
 *
 * @author toalgrim
 */

public class TestOggetto {

    public static void main(String[] args) throws SQLException{
        
        //Oggetto ogg1 = new Oggetto(1001);
        DescrizioneOggetto.getNomeOggetto(1001);
//        Oggetto.aggiungiOggetto();
    }
}
 