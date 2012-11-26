
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private final int snr;
    private Skin skin;
    private Software software;
    private Kit kit;
    
    public Android(int snr, Skin skin, Software software, Kit kit) {
        this.snr = snr;
        this.skin = skin;
        this.software = software;
        this.kit = kit;
//        this.security = security;

    }
    
    //NB: return empty string if valid, ERRORS otherwise
    public String isValid() {
        String ret = "";
        
        if(this.validateSkin() != null) ret += this.validateSkin();
        if(this.validateSoftware() != null) ret += this.validateSoftware();
        if(this.validateSecurity() != null) ret += this.validateSecurity();
        
        return ret;
    }
    
    public abstract String validateSkin();
    
    public abstract String validateSoftware();
    
    public abstract String validateSecurity();
    
    protected void log() {}
    
    //NB: snr!=null;
    public int getSnr() {
        return snr;
    }
    
    //NB: skin!=null;
    protected Skin getSkin(){
        return skin;
    }
    
    //NB: software!=null;
    protected Software getSoftware(){
        return software;
    }
}
