
/**
 *
 * @author guetar
 */
public class Security4 extends Security3 {
    
    @Override
    //NB: return null wenn Software vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Objektbewacher verwendet wird
    public String fromObjektbewacher() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Leibwaechter verwendet wird
    public String fromLeibwaechter() {
        return null;
    }
    
    
    
    //----Kit-Check:
    
    @Override
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitSehrSchwerarbeiter verwendet wird
    public String fromKitSehrSchwerarbeiter() {
        return null;
    }

    @Override
    //NB: return null (Kein Fehler) wenn dieses Security 
    //    in KitBeschuetzer verwendet wird
    public String fromKitBeschuetzer() {
        return null;
    }   
    
    @Override
    //NB: return ERROR wenn dieses Security 
    //    in KitSchwerarbeiter verwendet wird
    public String KitSchwerarbeiter() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }
    
    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return "Securitylevel: 4";
    }    
}