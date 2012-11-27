
/**
 *
 * @author Matthias
 */
public class AndroidKaempfer extends AndroidBeschuetzer {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidKaempfer(Skin sk, Software sw, Kit kit) {
        super("Kaempfer", sk, sw, kit);
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromKaempfer();
    }

    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromKaempfer();
    }
    
}