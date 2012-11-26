
/**
 *
 * @author Matthias
 */
public class Objektbewacher extends Beschuetzer {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Objektbewacher(int snr, Skin sk, Software sw, Security sc) {
        super(snr, sk, sw, sc);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromObjektbewacher();
    }
}