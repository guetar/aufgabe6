
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    //VB: snr>0, skin!=null, software!=null;
    public Bediener(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBediener();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromBediener();
    }
}