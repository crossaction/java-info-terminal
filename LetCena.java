
package infoterminal;

/**
 *
 * @author Aleksandar Jovanović K1021/12 IKC Jagodina
 */
public class LetCena {
    
    // Klasa sadrži podatke o cenama za određene destinacije
    
    final double[][] iznos;

    public double[][] getIznos() {
        return iznos;
    }
    
    public LetCena() {
        this.iznos = new double[][] {
            { 20.00, 21.00, 22.50, 35.10, 47.10, 55.00 },
            { 100.52, 101.00, 200.50, 800.00, 1999.99, 600.00 }
        };
    }
}
