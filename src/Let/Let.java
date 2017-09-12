package Let;

import java.util.ArrayList;
import java.util.List;

public class Let {

    private int kat;
    private int broj;
    private int cena;
    private String destinacija;

    private List<Let> lista = new ArrayList<Let>();

    public int getKat() {
        return kat;
    }

    public int getBroj() {
        return broj;
    }

    public int getCena() {
        return cena;
    }

    public String getDestinacija() {
        return destinacija;
    }

    public List<Let> getList() {
        return setLet();
    }


    private LetBroj letBroj = new LetBroj();
    private LetCena letCena = new LetCena();
    private LetDestinacija letDestinacija = new LetDestinacija();

    private int[][] brojeviLeta = new int[3][7];
    private int[][] ceneLeta = new int[3][7];
    private String[][] destinacijeLeta = new String[3][7];

    // Posto ima par razlicitih kategorija letova, ovo mi je bio najlaksi nacin da ona tri niza pretvorim u 1 listu.
    // Ako znas bolji nacin, slobodno javi!
    private List<Let> setLet() {
        for (int i = 1; i < 4; i++) {
            int[] tempBrojevi = letBroj.getResults(i);
            int[] tempCene = letCena.getResults(i);
            String[] tempDestinacije = letDestinacija.getResults(i);

            for (int j = 0; j < tempBrojevi.length; j++) {
                lista.add(new Let(i-1, tempBrojevi[j], tempCene[j], tempDestinacije[j]));
            }
        }
        return lista;
    }

    public Let(int kat, int broj, int cena, String destinacija) {
        this.kat = kat;
        this.broj = broj;
        this.cena = cena;
        this.destinacija = destinacija;
    }

    public Let() {

    }

}
