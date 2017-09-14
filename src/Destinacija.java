import Let.Let;
import Poruka.Poruka;

import java.util.HashMap;
import java.util.List;

public class Destinacija extends Let implements DestinacijaInterfejs {

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