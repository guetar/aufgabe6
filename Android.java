
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
    
    //NB: return empty string wenn valid, sonst ERRORS 
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
    
    // NB: Im Falle eines augetretenen Fehlers sollen diese im String ret
    // zurueckgegeben werden, Ansonsten null 
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
    
    //NB: snr!=null
    public int getSnr() {
        return snr;
    }
    
    //NB: skin!=null
    public Skin getSkin(){
        return skin;
    }
    
    //NB: software!=null
    public Software getSoftware(){
        return software;
    }
    
    // NB: kit != null
    public Kit getKit() {
        return kit;
    }
    
    @Override
    // VB: Die Variablen duerfen nicht null sein
    // NB: Rueckgabe einer String-Repraesentation dieses Androids
    public String toString() {
        return bez + ",  " +  software + ",  " + skin + ",  " + kit + ",  " + software.getSecurity();
    }
    
    // NB: snr != null
    public int getSNR() {
        return snr;
    }
}
