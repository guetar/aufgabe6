/**
 *
 * @author steff
 */
public class KitGesellschafter extends Kit {
    
    public KitGesellschafter() {
        super("Gesellschafterkit", 0.3);
    }
    
    @Override
    public String checkSecurity() {
        return getSecurity().fromKitGesellschafter();
    }
}
