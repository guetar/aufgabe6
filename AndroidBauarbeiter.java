
/**
 *
 * @author Matthias
 */
public class AndroidBauarbeiter extends AndroidSchwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidBauarbeiter(Skin sk, Software sw, Kit kit) {
        super("Bauarbeiter", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromBauarbeiter();
    }

    @Override
    public String validateKit() {
        return getKit().checkSecurity();
    }
}
