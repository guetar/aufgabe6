/**
 *
 * @author Matthias
 */
public abstract class Kit {
    
    private String bez;
    private double leistung;
    private Security sec;
    
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
    
    public abstract String checkSecurity();
    
    
    @Override
    public String toString() {
        return bez + ": " + leistung + " KW";
    }
}
