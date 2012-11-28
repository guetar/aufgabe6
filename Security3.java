
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
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitSchwerarbeiter verwendet wird
    public String KitSchwerarbeiter() {
        return null;
    }
    
    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return "Securitylevel: 3";
    }
}