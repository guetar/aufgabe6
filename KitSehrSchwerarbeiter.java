/**
 *
 * @author steff
 */
public class KitSehrSchwerarbeiter extends Kit{
    
    public KitSehrSchwerarbeiter() {
        super("SehrSchwerarbeiterkit", 7);
    }
    
    @Override
    public String checkSecurity() {
        return getSecurity().fromKitSehrSchwerarbeiter();
    }
}
