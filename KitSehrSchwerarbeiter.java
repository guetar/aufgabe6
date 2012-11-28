/**
 *
 * @author steff
 */
public class KitSehrSchwerarbeiter extends Kit{
    
    // NB: Dieses Objekt korrekt instanziert
    public KitSehrSchwerarbeiter() {
        super("SehrSchwerarbeiterkit", 7);
    }
    
    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().fromKitSehrSchwerarbeiter();
    }
}
