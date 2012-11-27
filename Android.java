
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private String bez;
    private final int snr;
    private Skin skin;
    private Software software;
    private Kit kit;
    
    public Android(String bez, int snr, Skin skin, Software software, Kit kit) {
        this.bez = bez;
        this.snr = snr;
        this.skin = skin;
        this.software = software;
        this.kit = kit;
        kit.install(software.getSecurity());
//        this.security = security;

    }
    
    //NB: return empty string if valid, ERRORS otherwise
    public String isValid() {
        String ret = toString() + "\n";
        String tmp = "";
        
        tmp = validateSkin();
        if (tmp != null)    ret += tmp;
        
        tmp = validateSoftware();
        if (tmp != null)    ret += tmp;
        
        tmp = validateSecurity();
        if (tmp != null)    ret += tmp;
        
        tmp = validateKit();
        if (tmp != null)    ret += tmp;
        
        return ret;
    }
    
    public abstract String validateSkin();
    
    public abstract String validateSoftware();
    
    public abstract String validateSecurity();
    
    public String validateKit() {
        return kit.checkSecurity();
    }
    
    protected void log() {}
    
    //NB: snr!=null;
    public int getSnr() {
        return snr;
    }
    
    
    
    
    // Gibts nen Grund warum diese Methoden protected sind??
    
    //NB: skin!=null;
    protected Skin getSkin(){
        return skin;
    }
    
    //NB: software!=null;
    protected Software getSoftware(){
        return software;
    }
    
    protected Kit getKit() {
        return kit;
    }
    
    @Override
    public String toString() {
        return bez + ",  " +  software + ",  " + skin + ",  " + kit + ",  " + software.getSecurity();
    }
}
