
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private final int snr;
    private Skin skin;
    private Software software;
//    private SensorenAktorenKit sensoren;
    
    // VB: snr!=null, skin!=null, software!=null
    public Android(int snr, Skin sk, Software sw) { //SensorenAktorenKit sensoren) {
        this.snr = snr;
        this.skin = sk;
        this.software = sw;

    }
    
    //NB: return empty string if valid, ERRORS otherwise
    public String isValid() {
        String ret = "";
        
        if(this.validateSkin() != null) ret += this.validateSkin();
        if(this.validateSoftware() != null) ret += this.validateSoftware();
        
        return ret;
    }
    
    public abstract String validateSkin();
    
    public abstract String validateSoftware();
    
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