
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
    
    @Override
    //NB: return null wenn Software von Bediener verwendet wird
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
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitGesellschafter verwendet wird
    public String fromKitGesellschafter() {
        return null;
    }
    
    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return "Securitylevel: 1";
    }
}