/**
 *
 * @author steff
 */
public class KitGesellschafter extends Kit {
    
    // NB: Dieses Objekt korrekt instanziert
    public KitGesellschafter() {
        super("Gesellschafterkit", 0.3);
    }
    
    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().fromKitGesellschafter();
    }
}
