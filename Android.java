
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private String bez;
    private static int snrCount;
    private final int snr;
    private final Software software;
    private Skin skin;
    private Kit kit;
    
    public Android(String bez, Skin skin, Software software, Kit kit) {
        snr = ++snrCount;
        this.bez = bez;
        this.skin = skin;
        this.skin.setSnr(this.snr);
        this.software = software;
        this.software.setSnr(this.snr);
        this.kit = kit;
        this.kit.setSnr(this.snr);
        kit.install(software.getSecurity());
    }
    
    //NB: return empty string if valid, ERRORS otherwise
    public String isValid() {
        String ret = null;
        String tmp = "";
        
        tmp = validateSoftware();
        ret = formatString(ret, tmp);

        tmp = validateSkin();
        ret = formatString(ret, tmp);

        tmp = validateKit();
        ret = formatString(ret, tmp);
        
        tmp = validateSecurity();
        ret = formatString(ret, tmp);
        
        return ret;
    }
    
    public String formatString(String ret, String tmp) {
        if (tmp != null) {
            if (ret != null) {
                ret += tmp;
            } else {
                ret = tmp;
            }
        }
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
