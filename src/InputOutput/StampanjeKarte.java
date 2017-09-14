package InputOutput;

import Let.Let;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StampanjeKarte {


    private String ime, prezime;
    private Let let = new Let();

    private String sadrzaj;

    private BufferedWriter bw;
    private FileWriter fw;

    // Ova metoda pokusava stvori fajl. Ako ne moze, hvata IOException i stampa StackTrace, i na kraju zatvara
    // FIleWriter i BufferedWriter da ne ostaju otvoreni kada se zavrsi upisivanje ili ne uspe. Za ovu putanju
    // "C:\" potreban je administrator nalog. Ukoliko je potrebno da radi sa obicnim WIndows nalogom, potrebno
    // je da se putanja promeni u korisnicki direktorijum.
    public void stampaj() {
        try {
            String fileName = "C:\\karta.txt";
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
