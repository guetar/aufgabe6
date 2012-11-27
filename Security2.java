
/**
 *
 * @author guetar
 */
public class Security2 extends Security1 {

    @Override
    //NB: return null wenn Software vom Bediener verwendet wird
    public String fromBediener() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software von Hilfskraft verwendet wird
    public String fromHilfskraft() {
        return null;
    }
    

    
    //----Kit-Check:
    
    @Override
    public String fromKitHilfskraft() {
        return null;
    }
        
    public String toString() {
        return "Securitylevel: 2";
    }
}