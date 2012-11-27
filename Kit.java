/**
 *
 * @author Matthias
 */
public abstract class Kit {
    
    private String bez;
    private double leistung;
    private Security sec;
    private Integer snr;
    
    public Kit(String bez, double leistung){
        this.bez = bez;
        this.leistung = leistung;
    }
    
    public Security getSecurity() {
        return sec;
    }
    
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
    public String toString() {
        return bez + ": " + leistung + " KW";
    }
}
