
/**
 *
 * @author Matthias
 */
public abstract class Software {

    protected final Security security;

    public Software(Security sc) {
        this.security = sc;
    }

    //NB: return ERROR wenn Software vom Bediener verwendet wird
    public String fromBediener() {
        return "ERROR in Software: Diese Software darf nicht vom Bediener verwendet werden!\n";
    }

    //NB: return ERROR wenn Software vom Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return "ERROR in Software: Diese Software darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    //NB: return ERROR wenn Software vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return "ERROR in Software: Diese Software darf nicht vom Beschuetzer verwendet werden!\n";
    }

    //NB: return ERROR wenn Software von Hilfskraft verwendet wird
    public String fromHilfskraft() {
        return "ERROR in Software: Diese Software darf nicht von Hilfskraft verwendet werden!\n";
    }

    //NB: return ERROR wenn Software vom Gesellschafter verwendet wird
    public String fromGesellschafter() {
        return "ERROR in Software: Diese Software darf nicht vom Gesellschafter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom Bauarbeiter verwendet wird
    public String fromBauarbeiter() {
        return "ERROR in Software: Diese Software darf nicht vom Bauarbeiter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom ServiceTechniker verwendet wird
    public String fromServiceTechniker() {
        return "ERROR in Software: Diese Software darf nicht vom Techniker verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom Transportarbeiter verwendet wird
    public String fromTransportarbeiter() {
        return "ERROR in Software: Diese Software darf nicht vom Transportarbeiter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom mit Objektbewacher verwendet wird
    public String fromObjektbewacher() {
        return "ERROR in Software: Diese Software darf nicht vom Objektbewacher verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom Leibwaechter verwendet wird
    public String fromLeibwaechter() {
        return "ERROR in Software: Diese Software darf nicht vom Leibwaechter verwendet werden!\n";
    }
    
    //NB: return ERROR wenn Software vom Kaempfer verwendet wird
    public String fromKaempfer() {
        return "ERROR in Software: Diese Software darf nicht vom Kaempfer verwendet werden!\n";
    }
}
