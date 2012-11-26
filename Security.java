
/**
 *
 * @author guetar
 */
public class Security {

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
}