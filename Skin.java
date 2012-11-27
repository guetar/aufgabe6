/**
 *
 * @author Matthias
 */
public abstract class Skin {
    private String bez;
    private Integer snr;
    
    public Skin(String bez) {
        this.bez = bez;
    }
    
    //VB: snr ist Seriennummer des Androiden zu dem dieses Teil gehoert
    //NB: this.snr==snr
    public final void setSnr(int snr){
    this.snr=snr;
    }
    
    public String fromSchwerarbeiter() {
        return "ERROR in Skin: Diese Skin darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    public String fromBediener() {
        return "ERROR in Skin: Diese Skin darf nicht vom Bediener verwendet werden!\n";
    }

    public String fromBeschuetzer() {
        return "ERROR in Skin: Diese Skin darf nicht vom Bediener verwendet werden!\n";
    }
    
    public String toString() {
        return bez;
    }
}
