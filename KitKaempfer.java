/**
 *
 * @author steff
 */
public class KitKaempfer extends Kit {
    
    public KitKaempfer() {
        super("Kaempferkit", 50);
    }
    
    @Override
    public String checkSecurity() {
        return getSecurity().fromKitKaempfer();
    }
}
