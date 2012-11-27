
/**
 *
 * @author Matthias
 */
public class AndroidLeibwaechter extends AndroidBeschuetzer {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidLeibwaechter(Skin sk, Software sw, Kit kit) {
        super("Leibwaechter", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromLeibwaechter();
    }
}