
package infoterminal;

/**
 *
 * @author Aleksandar Jovanović K1021/12 IKC Jagodina
 */
public class PodaciDestinacije {
    
    // Klasa sadrži podatke o destinacijama
    
    final String[][] abDestinacija;

    public String[][] getAbDestinacija() {
        return abDestinacija;
    }
    
    public PodaciDestinacije() {
        this.abDestinacija = new String[][] {
            {
                "Destinacija regionalnog saobraćaja_1",
                "Destinacija regionalnog saobraćaja_2",
                "Destinacija regionalnog saobraćaja_3",
                "Destinacija regionalnog saobraćaja_4",
                "Destinacija regionalnog saobraćaja_5",
                "Destinacija regionalnog saobraćaja_6"
            },
            {
                "Destinacija međunarodnog saobraćaja_1",
                "Destinacija međunarodnog saobraćaja_2",
                "Destinacija međunarodnog saobraćaja_3",
                "Destinacija međunarodnog saobraćaja_4",
                "Destinacija međunarodnog saobraćaja_5",
                "Destinacija međunarodnog saobraćaja_6"
            }
        };
    }
}
