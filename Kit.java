/**
 *
 * @author Matthias
 */
public abstract class Kit {
    // Kit als Ueberklasse fuer alle folgenden Kits
    // Das Kit beinhaltet das entsprechende Objekt Security in welchen
    // per visitor-Methodenaufrufen die Korrektheit ueberprueft wird
    
    private String bez;
    private double leistung;
    private Security sec;
    private Integer snr;
    
    // NB: Dieses Objekt korrekt instanziert
    public Kit(String bez, double leistung){
        this.bez = bez;
        this.leistung = leistung;
    }
    
    // NB: Retournieren des Security-Objekts, soll nicht NULL sein
    public Security getSecurity() {
        return sec;
    }
    
    // VB: Darf nicht NULL sein
    // NB: Instanziertes security-Objekt hier gespeichert
    void install(Security security) {
        this.sec = security;
    }

    //VB: snr ist Seriennummer des Androiden zu dem dieses Teil gehoert
    //NB: this.snr==snr
    public final void setSnr(int snr){
        this.snr=snr;
    }
    
    public abstract String checkSecurity();
    
    
    @Override
    //VB: Variablen sollten nicht null sein
    //NB: Retournieren eines sinnvollen Strings
    public String toString() {
        return bez + ": " + leistung + " KW";
    }
}
