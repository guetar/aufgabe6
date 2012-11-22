
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private final int snr;
    private Skin skin;
//    private Software software;
//    private Security security;
    
    public Android(int snr, Skin skin) { //, Software software, Security security) {
        this.snr = snr;
        this.skin = skin;
//        this.software = software;
//        this.security = security;
        System.out.println(isValid());
    }
    
    public String isValid() {
        return this.validateSkin(skin);
//        a.validateSoftware(software);
//        a.validateSecurity(security);
    }
    
    public abstract String validateSkin(Skin skin);
    
    protected void log() {
        
    }
    
    //NB: snr!=null;
    public int getSnr() {
        return snr;
    }
}