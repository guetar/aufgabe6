
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
    
    @Override
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitKaempfer verwendet wird
    public String fromKitKaempfer() {
        return null;
    }

    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return "Securitylevel: 5";
    }    
}