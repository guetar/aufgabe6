
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private String bez;
    private final int snr;
    private final Software software;
    private Skin skin;
    private Kit kit;
    
    public Android(String bez, int snr, Skin skin, Software software, Kit kit) {
        this.bez = bez;
        this.snr = snr;
        this.skin = skin;
        this.skin.setSnr(this.snr);
        this.software = software;
        this.software.setSnr(this.snr);
        this.kit = kit;
        this.kit.setSnr(this.snr);
        kit.install(software.getSecurity());
//        this.security = security;

    }
    
    //NB: return empty string if valid, ERRORS otherwise
    public String isValid() {
        String ret = toString() + "\n";
        String tmp = "";
        
        tmp = validateSoftware();
        if (tmp != null)    ret += tmp;
        
        tmp = validateSkin();
        if (tmp != null)    ret += tmp;
        
        tmp = validateKit();
        if (tmp != null)    ret += tmp;
        
        tmp = validateSecurity();
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
    
    public int getSNR() {
        return snr;
    }
}
