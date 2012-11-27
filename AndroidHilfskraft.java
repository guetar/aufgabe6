
/**
 *
 * @author Matthias
 */
public class AndroidHilfskraft extends AndroidBediener {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidHilfskraft(Skin sk, Software sw, Kit kit) {
        super("Hilfskraft", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromHilfskraft();
    }
}