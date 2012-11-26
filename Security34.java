
/**
 *
 * @author guetar
 */
public class Security34 extends Security {
    
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
}