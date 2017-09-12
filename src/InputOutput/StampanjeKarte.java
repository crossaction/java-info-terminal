package InputOutput;

import Let.Let;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StampanjeKarte {


    private String ime, prezime;
    private Let let = new Let();

    private int zero = 0;
    private int counter = ++zero;

    private String fileName = "C:\\karta"+Integer.toString(counter)+".txt";

    private String sadrzaj;

    private BufferedWriter bw;
    private FileWriter fw;

    public void stampaj() {
        // Ovo ne bi trebalo (ne znam ni da li moze) da stoji van try-catch-finally. Kakogod, prebrinuli smo jedan
        // zahtev za projekat na odlican nacin.
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(sadrzaj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public StampanjeKarte(Covek covek, Let let) {
        this.ime = covek.getIme();
        this.prezime = covek.getPrezime();
        this.let = let;
        sadrzaj = ime+"\n"
                +prezime+"\n"
                +let.getKat()+"\n"
                +let.getBroj()+"\n"
                +let.getCena()+"\n"
                +let.getDestinacija();
    }
}
