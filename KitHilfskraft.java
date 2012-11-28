/**
 *
 * @author steff
 */
public class KitHilfskraft extends Kit{
    
    // NB: Dieses Objekt korrekt instanziert
    public KitHilfskraft() {
        super("Hilfskraftkit", 1.6);
    }

    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().fromKitHilfskraft();
    }
}
