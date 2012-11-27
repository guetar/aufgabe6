/**
 *
 * @author steff
 */
public class KitHilfskraft extends Kit{
    
    public KitHilfskraft() {
        super("Hilfskraftkit", 1.6);
    }

    @Override
    public String checkSecurity() {
        return getSecurity().fromKitHilfskraft();
    }
}
