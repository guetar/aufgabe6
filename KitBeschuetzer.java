/**
 *
 * @author steff
 */
public class KitBeschuetzer extends Kit {
 
    // NB: Dieses Objekt korrekt instanziert
    public KitBeschuetzer() {
        super("Beschuetzerkit", 9);
    }

    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().fromKitBeschuetzer();
    }
}
