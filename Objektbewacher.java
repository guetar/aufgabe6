
/**
 *
 * @author Matthias
 */
public class Objektbewacher extends Beschuetzer {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Objektbewacher(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromObjektbewacher();
    }
}