
/**
 *
 * @author Matthias
 */
public abstract class AndroidBeschuetzer extends Android{

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidBeschuetzer(String bez, int snr, Skin sk, Software sw, Kit kit) {
        super(bez, snr, sk, sw, kit);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBeschuetzer();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromBeschuetzer();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromBeschuetzer();
    }
}
