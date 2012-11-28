
/**
 *
 * @author guetar
 */
public class Security2 extends Security1 {

    @Override
    //NB: return ERROR wenn Security von Hilfskraft verwendet wird
    public String fromHilfskraft() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht von Hilfskraft verwendet werden!\n";
    }

    

    
    //----Kit-Check:
    
    @Override
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitGesellschafter verwendet wird
    public String fromKitHilfskraft() {
        return null;
    }
        
    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return "Securitylevel: 2";
    }
}