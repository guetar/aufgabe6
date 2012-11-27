
/**
 *
 * @author guetar
 */
public class Security3 extends Security {
    
    @Override
    //NB: return null wenn Software vom Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Schwerarbeiter verwendet wird
    public String fromBauarbeiter() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Servicetechniker verwendet wird
    public String fromServicetechniker() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Transportarbeiter verwendet wird
    public String fromTransportarbeiter() {
        return null;
    }
    
        
    
    //----Kit-Check:

    @Override
    public String KitSchwerarbeiter() {
        return null;
    }
    
    public String toString() {
        return "Securitylevel: 3";
    }
}