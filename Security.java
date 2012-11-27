/**
 *
 * @author guetar
 * 
 * ToDo: Implement three Laws of Robotics!!!
 */
public class Security {

    //----Androidtyp-Check:
    
    //NB: return ERROR wenn Security vom Bediener verwendet wird
    public String fromBediener() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Bediener verwendet werden!\n";
    }

    //NB: return ERROR wenn Security vom Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    //NB: return ERROR wenn Security vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Beschuetzer verwendet werden!\n";
    }

    //NB: return ERROR wenn Security von Hilfskraft verwendet wird
    public String fromHilfskraft() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht von Hilfskraft verwendet werden!\n";
    }

    //NB: return ERROR wenn Security vom Gesellschafter verwendet wird
    public String fromGesellschafter() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Gesellschafter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom Bauarbeiter verwendet wird
    public String fromBauarbeiter() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Bauarbeiter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom Servicetechniker verwendet wird
    public String fromServicetechniker() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Techniker verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom Transportarbeiter verwendet wird
    public String fromTransportarbeiter() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Transportarbeiter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom mit Objektbewacher verwendet wird
    public String fromObjektbewacher() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Objektbewacher verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom Leibwaechter verwendet wird
    public String fromLeibwaechter() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Leibwaechter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Security vom Sicherheitsstufe verwendet wird
    public String fromKaempfer() {
        return "ERROR in Security: Diese Sicherheitsstufe darf nicht vom Kaempfer verwendet werden!\n";
    }
    
    
    
    //----Kit-Check:
    
    public String fromKitHilfskraft() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }

    public String fromKitGesellschafter() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }

    public String KitSchwerarbeiter() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }

    public String fromKitSehrSchwerarbeiter() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }

    public String fromKitBeschuetzer() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }    
    
    public String fromKitKaempfer() {
        return "ERROR in Kit: Dieses Kit darf nicht mit dieser Sicherheitsstufe verwendet werden!\n";
    }
}