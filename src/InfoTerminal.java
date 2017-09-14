import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import InputOutput.Covek;
import InputOutput.ProveraKarte;
import InputOutput.StampanjeKarte;
import Let.Let;

public class InfoTerminal {

    public static void main(String[] args) {

        Destinacija destinacija = new Destinacija();

        List<Let> lista = destinacija.getLet();
        HashMap poruke = destinacija.getPoruke();

        ProveraKarte proveraKarte = new ProveraKarte();

        System.out.println(poruke.get(0));

        System.out.println(poruke.get(1));

        // Ovde je pretezno koriscen switch zbog preglednosti.
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                boolean status = proveraKarte.proveri();
                if (status) System.out.println("Karta je uspesno proverena i sve je u redu.");
                else System.out.println("Karta nije vazeca, molimo vas da kontaktirate nasu podrsku.");
                System.exit(0);
                break;
            case 2:
                break;
            default:
                System.out.println("Odaberite opciju 1 ili 2!");
                break;
        }

        // Ovo splituje string u dva. Koristi regex, nalazi space izmedju imena i prezimena i tako ih lomi i smesta
        // u promenljive ime i prezime za coveka. Trenutno puca ako se ne unese space karakter.
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

        // Instancira coveka i stampanjeKarte i "stampa" kartu u .txt fajl u C particiji.
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

        System.out.println(poruke.get(8));
    }

}