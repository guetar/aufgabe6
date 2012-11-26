
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
    //NB: return empty string if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBediener() + getSoftware().fromBediener();
    }
}