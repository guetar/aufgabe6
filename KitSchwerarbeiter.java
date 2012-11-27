/**
 *
 * @author steff
 */
public class KitSchwerarbeiter extends Kit{
    
    public KitSchwerarbeiter() {
        super("Schwerarbeiterkit", 4);
    }

    @Override
    public String checkSecurity() {
        return getSecurity().KitSchwerarbeiter();
    }
}
