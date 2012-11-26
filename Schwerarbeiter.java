
/**
 *
 * @author Matthias
 */
public abstract class Schwerarbeiter extends Android{
    
    //VB: snr>0, skin!=null, software!=null, security!=null
    public Schwerarbeiter(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
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