/**
 *
 * @author steff
 */
public class KitBeschuetzer extends Kit {
 
    public KitBeschuetzer() {
        super("Beschuetzerkit", 9);
    }

    @Override
    public String checkSecurity() {
        return getSecurity().fromKitBeschuetzer();
    }
}
