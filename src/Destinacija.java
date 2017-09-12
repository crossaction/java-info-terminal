import Let.Let;
import Poruka.Poruka;

import java.util.HashMap;
import java.util.List;

class Destinacija extends Let implements DestinacijaInterfejs {

    // Realno nepotrebna klasa. Zapravo, mnoge stvari su ovde nepotrebne i sluze samo da popune mesto za projekat. Ova
    // mu dodje i najjednostavnija od svih.
    private Let let = new Let();
    private Poruka poruka = new Poruka();

    public List<Let> setLetove() {
        return let.getList();
    }

    public HashMap setPoruke() {
        return poruka.getPoruke();
    }

    List<Let> getLet() {
        return setLetove();
    }

    HashMap getPoruke() {
        return setPoruke();
    }

}