import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import InputOutput.Covek;
import InputOutput.StampanjeKarte;
import Let.Let;

public class InfoTerminal {

    public static void main(String[] args) {

        Destinacija destinacija = new Destinacija();

        List<Let> lista = destinacija.getLet();
        HashMap poruke = destinacija.getPoruke();

        System.out.println(poruke.get(0));

        System.out.println(poruke.get(1));

        // Ovde pretezno koristim switch zbog preglednosti. IF bih morao da gledam da li je 1, 2, da li nije 1 ili 2...
        // Nije tesko ali mnogo vise karaktera prostorno zauzima od switch-a.
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Odaberite opciju 1 ili 2!");
                break;
        }

        // Ovo splituje string u dva. Koristi regex, nalazi space izmedju imena i prezimena i tako ih lomi i smesta
        // u promenljive ime i prezime za coveka. Trenutno puca ako se ne unese space karakter. Mozda bi bilo pametnije
        // da u Covek klasi ime i prezime budu jedna promenljiva? Mnogo laksa ispravka od proveravanja uslova za
        // razbijanje stringa.
        System.out.println(poruke.get(2));
        String imeIPrezime = new Scanner(System.in).nextLine();
        String[] tempIP = imeIPrezime.split(" ");
        String tempIme = tempIP[0];
        String tempPrezime = tempIP[1];

        System.out.println(poruke.get(3));
        for (Let l : lista) {
            System.out.println(l.getBroj()+". "+l.getDestinacija());
        }

        // Kada se ispisu destinacije, korisnik odabere jednu i ova funkcija nalazi taj let objekat u listi i cuva
        // ga kao posebnog za sptampanje.
        int tempBroj = new Scanner(System.in).nextInt();
        Let tempLet = new Let();

        for (Let l : lista) {
            if (tempBroj == l.getBroj()) {
                tempLet = l;
                break;
            }
        }
        System.out.println(tempLet.getKat());
        System.out.println(poruke.get(4)+" "+tempLet.getCena());

        // Instancira coveka i stampanjeKarte i "stampa" kartu u .txt fajl u C particiji. Sadrzaj tekst fajla
        // bi trebao da se prolepsa malo, ali trenutno nije prioritet.
        System.out.println(poruke.get(5));
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                Covek covek = new Covek(tempIme, tempPrezime, tempLet);
                StampanjeKarte stampanjeKarte = new StampanjeKarte(covek, tempLet);
                stampanjeKarte.stampaj();
                System.out.println(poruke.get(6));
                break;
            case 2:
                break;
            default:
                System.out.println("Odaberite opciju 1 ili 2!");
                break;
        }

        // Razmisljao sam kako da se ponovo pokrene ceo proces main-a za stvaranje karte i nisam nasao lagan nacin.
        // Najjednostavnije resenje bi bilo da se SVE prebaci u novu klasu, ovde ubaci jedna while petlja i vrti
        // u krug i stvaraju karte koliko korisnik zeli dok se ne izjasni da ne zeli vise da kreira karte.
        // poruke.get(7) je iz tog razloga neiskorisceno.
        System.out.println(poruke.get(8));
    }

}