package Poruka;

import java.util.HashMap;

public class Poruka {

    // HashMap umesto liste ili bilo cega drugog, da bi se uredno pristupalo porukama iz InfoTerminala.
    private HashMap<Integer, String> poruke = new HashMap<>();

    private String welcome =
            "**************************************************************\n" +
            "*                                                            *\n" +
            "*           Dobrodosli na aerodrom Veselog Curana!           *\n" +
            "*                                                            *\n" +
            "**************************************************************",
    proveraIliKupovina = "Da li zelite da proverite kartu ili kupite?\n1. Provera\n2. Kupovina",
    imePrezime = "Unesite ime i prezime kupca karte:",
    odaberiteDestinaciju = "Odaberite vasu zeljenu destinaciju",
    proveriteCenu = "Cena za odabranu destinaciju je:",
    stampa = "Da li zelite da odstampate vasu kartu?\n1. Da\n2. Ne",
    stampaGotova = "Vasa karta je uspesno odstampana i nalazi se u vasem korisnickom direktorijumu.",
    josNesto = "Da li zelite da ponovo pregledate vasu kartu ili kupite jos jednu?",
    dovidjenja = "Dovidjenja!";

    // Ova metoda se koristi za uredno ispisivanje poruka. Posto HashMap skladisti podatke u key-value parovima,
    // Key moze biti bilo sta, ne Integer, pa moze vrlo lako i uredno da se kontrolise ispis poruka na ekranu
    // u main funkciji.
    public HashMap getPoruke() {
        poruke.put(0, welcome);
        poruke.put(1, proveraIliKupovina);
        poruke.put(2, imePrezime);
        poruke.put(3, odaberiteDestinaciju);
        poruke.put(4, proveriteCenu);
        poruke.put(5, stampa);
        poruke.put(6, stampaGotova);
        poruke.put(7, josNesto);
        poruke.put(8, dovidjenja);
        return poruke;
    }

    public Poruka() {

    }

}
