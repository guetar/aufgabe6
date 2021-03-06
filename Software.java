
/**
 *
 * @author Matthias
 */
public abstract class Software {

    private String bez;
    protected final Security security;
    private Integer snr;

    public Software(String bez, Security sc) {
        this.bez = bez;
        this.security = sc;
    }
    
    //NB: security!=null
    public Security getSecurity() {
        return security;
    }
    
    //VB: snr ist Seriennummer des Androiden zu dem dieses Teil gehoert
    //NB: this.snr==snr
    public final void setSnr(int snr){
    this.snr=snr;
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
    public String fromServicetechniker() {
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
    
    @Override
    public String toString() {
        return bez;
    }
}
