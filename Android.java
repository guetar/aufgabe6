
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private final int snr;
    private Skin skin;
    private Software software;
//    private SensorenAktorenKit sensoren;
    
    public Android(int snr, Skin skin, Software software) { //SensorenAktorenKit sensoren) {
        this.snr = snr;
        this.skin = skin;
        this.software = software;
//        this.security = security;

    }
    
    public String isValid() {
        String ret;
        ret=this.validateSkin();
        if(ret!=null)
            ret=this.validateSoftware();
        return ret;
//        a.validateSoftware(software);
//        a.validateSecurity(security);
    }
    
    public abstract String validateSkin();
    
    public abstract String validateSoftware();
    
    protected void log() {
        
    }
    
    //NB: snr!=null;
    public int getSnr() {
        return snr;
    }
    
    protected Skin getSkin(){
    return skin;
    }
    
    protected Software getSoftware(){
    return software;
    }
}