
/**
 *
 * @author Matthias
 */
public class AndroidTransportarbeiter extends AndroidSchwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidTransportarbeiter(Skin sk, Software sw, Kit kit) {
        super("Transportarbeiter", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromTransportarbeiter();
    }
}