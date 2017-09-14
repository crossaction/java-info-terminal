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

    // Posto u karti uz informacije o letu i destinaciji idu ime i prezime, napravljena je klasa Covek koja se lakse
    // prosledjuje. Umesto jedne instance i par String-ova, prosledjuje se samo 1 instanca.
    public Covek(String ime, String prezime, Let let) {
        this.ime = ime;
        this.prezime = prezime;
        this.let = let;
    }

}
