
package infoterminal;

/**
 *
 * @author Aleksandar Jovanović K1021/12 IKC Jagodina
 */
public class Poruke {
    
    private String poruka;
    
    public Poruke() {
        this.poruka = poruka;
    }
    
    public void ispisiDobrodoslicu() {
        System.out.println("Dobrodošli!");
    }
    
    public void ispisiOpis() {
        System.out.println(
                "Možete saznati informacije leta i cenu");
    }
    
    public void ispisiDestinacije() {
        System.out.println("\n"+"REGIONALNI LETOVI:\n"+
                " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n" +
                "|110001 Destinacija regionalnog saobraćaja_1    110002 Destinacija regionalnog saobraćaja_2 |\n" +
                "|110003 Destinacija regionalnog saobraćaja_3    110004 Destinacija regionalnog saobraćaja_4 |\n" +
                "|110005 Destinacija regionalnog saobraćaja_5    110006 Destinacija regionalnog saobraćaja_6 |\n" + 
                " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                "\n" +
                "MEĐUNDRODNI LETOVI: \n" +
                " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n" +
                "|220001 Destinacija međunarodnog saobraćaja_1   220002 Destinacija međunarodnog saobraćaja_2|\n" +
                "|220003 Destinacija međunarodnog saobraćaja_3   220004 Destinacija međunarodnog saobraćaja_4|\n" +
                "|220005 Destinacija međunarodnog saobraćaja_5   220006 Destinacija međunarodnog saobraćaja_5|\n" +
                " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    };
    
    public void ispisiPozdrav() {
        System.out.println(
                "Hvala na korišćenju Info-terminala");
    }
}
