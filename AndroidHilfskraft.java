
/**
 *
 * @author Matthias
 */
public class AndroidHilfskraft extends AndroidBediener {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidHilfskraft(int snr, Skin sk, Software sw, Kit kit) {
        super("Hilfskraft", snr, sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromHilfskraft();
    }
}