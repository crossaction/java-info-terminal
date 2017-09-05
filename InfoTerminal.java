/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoterminal;

import java.io.*;
import java.util.InputMismatchException;


/**
 *
 * @author Aleksandar Jovanović K1021/12 IKC Jagodina
 */
public class InfoTerminal {

    public static void main(String[] args) throws IOException {
        
        // Instanciranje klasa
        Let brLeta = new Let();
        PodaciDestinacije destinacija = new PodaciDestinacije();
        LetCena abIznos = new LetCena();
        Obrada ob = new Obrada();
        Poruke por = new Poruke();
        
       
        
        //Metode koje koristi Info terminal
        
        //Poruke dobrodošlice
        por.ispisiDobrodoslicu();
        por.ispisiOpis();
        
        // Unos osnovnih podataka korisnika
        ob.osnovniPodaci();
        
        // Info poruka o destinacijama
        por.ispisiDestinacije();
        
        // Obrada podataka o izabranoj destinaciji
        ob.getIzracunaj();
        
        // Pozdravna poruka
        por.ispisiPozdrav();
        
    }
    
}
