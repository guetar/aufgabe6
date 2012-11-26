
/**
 *
 * @author Matthias
 */
public class Hilfskraft extends Bediener {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Hilfskraft(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromHilfskraft();
    }
}