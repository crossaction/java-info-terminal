
package infoterminal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Aleksandar Jovanović K1021/12 IKC Jagodina
 */
public class Obrada {
    
        private long letID = 0;
        private double cena = 0.00d;
        private boolean itemFound = false;
        private String destinacijaInfo = "";
        public String[] input = new String[2];
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        
        
        // Instanciranje klasa
        Let brLeta = new Let();
        PodaciDestinacije destinacija = new PodaciDestinacije();
        LetCena abIznos = new LetCena();
        
        
        // Unos osnovnih podataka (ime i prezime)
        public void osnovniPodaci() {
        Scanner sc = new Scanner(System.in);
         
            System.out.println("Upisite ime i prezime:");
            input[1] = sc.nextLine();
            
            System.out.println("Uspešno ste se registrovali ste se kao:");
    System.out.println(input[1]);
    }
        
        
        // Upoređuje unešen broj leta i štampa podatke.
        // U suprotnom, izlazi iz terminala
        public void getIzracunaj() throws IOException {
        
            try {
            System.out.print("Unesite broj leta: ");
                letID = Long.parseLong(br.readLine());
           }
        
            catch(NumberFormatException ex) {
              System.out.println (ex.toString());
              System.out.println("Pogrešan unos - Izlaz iz terminala");   
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                 if (letID == brLeta.getBrojLeta()[i][j]) {
                    destinacijaInfo = destinacija.getAbDestinacija()[i][j];
                    cena = abIznos.getIznos()[i][j];
                    itemFound = true;
                }
            }
        }
        
        if( itemFound == true ) {
            System.out.println("Identifikator broja leta");
            System.out.println("Broj leta: " + letID);
            System.out.println("Destinacija: " + destinacijaInfo);
            System.out.printf("Cena:  %.2f\n", cena);
        }
        else
            System.out.println("Nije nađen let pod ovim brojem - Izlaz iz terminala");
        }
        
}
