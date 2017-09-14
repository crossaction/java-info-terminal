package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import Let.Let;


public class ProveraKarte {

    private static final String fajl = "C:\\karta.txt";

    private Let mainLet = new Let();
    private Let let;

    private List<Let> lista = mainLet.getList();;

    private BufferedReader br;
    private FileReader fr;

    private String[] karta = new String[6];


    private boolean ucitaj() {
        try {
            fr = new FileReader(fajl);
            br = new BufferedReader(fr);

            String sCurrentLine;

            int i = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                sCurrentLine.trim();
                karta[i] = sCurrentLine;
                i++;
            }

            let = new Let(Integer.parseInt(karta[2]), Integer.parseInt(karta[3]), Integer.parseInt(karta[4]), karta[5]);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean proveri() {
        boolean status = ucitaj();
        if(status) {
            for (Let l : lista) {
                if (l.getKat() == let.getKat() && l.getBroj() == let.getBroj() && l.getCena() == let.getCena() && Objects.equals(l.getDestinacija(), let.getDestinacija())) return true;
            }
        }
        return false;
    }

}