
/**
 *
 * @author Matthias
 */
public class Transportarbeiter extends Schwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Transportarbeiter(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromTransportarbeiter();
    }
}