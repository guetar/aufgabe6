
/**
 *
 * @author Matthias
 */
public abstract class Beschuetzer extends Android{

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Beschuetzer(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }

    @Override
    //NB: return empty string if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBeschuetzer() + getSoftware().fromBeschuetzer();
    }
}