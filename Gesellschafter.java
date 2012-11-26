
/**
 *
 * @author guetar
 */
public class Gesellschafter extends Bediener {
    
    //VB: snr>0, skin!=null, software!=null, security!=null
    public Gesellschafter(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromGesellschafter();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromGesellschafter();
    }
}