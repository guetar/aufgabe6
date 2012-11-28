/**
 *
 * @author Matthias
 */
public abstract class Skin {
    // Standardmaessig sollen alle visitor-Methoden Fehler ausgeben
    // Nur in den Erweiterungen werden die korrekten Faelle durch 
    // null-Rueckgaben behandelt
    
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
    
    // NB: return ERROR wenn Skin von Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return "ERROR in Skin: Diese Skin darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    // NB: return ERROR wenn Skin von Bediener verwendet wird
    public String fromBediener() {
        return "ERROR in Skin: Diese Skin darf nicht vom Bediener verwendet werden!\n";
    }

    // NB: return ERROR wenn Skin von Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return "ERROR in Skin: Diese Skin darf nicht vom Beschuetzer verwendet werden!\n";
    }
    
    //NB: retournieren einer String-Repraesantition dieses Objekts
    public String toString() {
        return bez;
    }
}
