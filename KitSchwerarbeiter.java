/**
 *
 * @author steff
 */
public class KitSchwerarbeiter extends Kit{
    
    // NB: Dieses Objekt korrekt instanziert
    public KitSchwerarbeiter() {
        super("Schwerarbeiterkit", 4);
    }

    @Override
    // VB: security != NULL
    // NB: retournieren des Strings aus der visitor-Methode
    public String checkSecurity() {
        return getSecurity().KitSchwerarbeiter();
    }
}
