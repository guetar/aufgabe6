
/**
 *
 * @author guetar
 */
public class Security1 extends Security {
    
    @Override
    //NB: return null wenn Software von Gesellschafter verwendet wird
    public String fromGesellschafter() {
        return null;
    }
    
    
    
    //----Kit-Check:

    @Override
    public String fromKitGesellschafter() {
        return null;
    }
    
    public String toString() {
        return "Securitylevel: 1";
    }
}