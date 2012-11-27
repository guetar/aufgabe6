
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
    public String fromKitSehrSchwerarbeiter() {
        return null;
    }

    @Override
    public String fromKitBeschuetzer() {
        return null;
    }   
    
    @Override
    public String KitSchwerarbeiter() {
        return "ERROR in Kit: Sicherheitsstufe fuer dieses Kit ist zu niedrig!\n";
    }
    
    public String toString() {
        return "Securitylevel: 4";
    }    
}