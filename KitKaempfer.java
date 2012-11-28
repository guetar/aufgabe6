/**
 *
 * @author steff
 */
public class KitKaempfer extends Kit {
    
    // NB: Dieses Objekt korrekt instanziert
    public KitKaempfer() {
        super("Kaempferkit", 50);
    }
    
    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().fromKitKaempfer();
    }
}
