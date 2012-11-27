
/**
 *
 * @author Matthias
 */
public abstract class AndroidSchwerarbeiter extends Android{
    
    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidSchwerarbeiter(String bez, int snr, Skin sk, Software sw, Kit kit) {
        super(bez, snr, sk, sw, kit);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromSchwerarbeiter();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromSchwerarbeiter();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromSchwerarbeiter();
    }
}
