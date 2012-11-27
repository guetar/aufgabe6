
/**
 *
 * @author guetar
 */
public class Security5 extends Security {
    
    @Override
    //NB: return null wenn Software vom Kaempfer verwendet wird
    public String fromKaempfer() {
        return null;
    }
    
    
    
    //----Kit-Check:
    
    public String fromKitGefechtsSet() {
        return null;
    }

    public String toString() {
        return "Securitylevel: 5";
    }    
}