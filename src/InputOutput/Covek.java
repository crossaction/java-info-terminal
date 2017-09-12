package InputOutput;

import Let.Let;

public class Covek {

    private String ime, prezime;
    private Let let = new Let();

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Let getLet() {
        return let;
    }

    // Setio sam se da bi pri stampanju karte trebalo da se zapise ime i prezime kupca. Mozda postoji bolje resenje,
    // mozda ne treba posebna klasa za te dve informacije?
    public Covek(String ime, String prezime, Let let) {
        this.ime = ime;
        this.prezime = prezime;
        this.let = let;
    }

}
