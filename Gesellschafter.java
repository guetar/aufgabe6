
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
    public String validateSoftware() {
        return getSoftware().fromGesellschafter();
    }

}