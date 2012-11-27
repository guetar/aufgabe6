
/**
 *
 * @author Matthias
 */
public class AndroidServicetechniker extends AndroidSchwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidServicetechniker(int snr, Skin sk, Software sw, Kit kit) {
        super("Servicetechniker", snr, sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromServicetechniker();
    }
}