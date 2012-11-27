
/**
 *
 * @author Matthias
 */
public class AndroidObjektbewacher extends AndroidBeschuetzer {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidObjektbewacher(Skin sk, Software sw, Kit kit) {
        super("Objektbewacher", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromObjektbewacher();
    }
}
