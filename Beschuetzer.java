
/**
 *
 * @author Matthias
 */
public abstract class Beschuetzer extends Android{

    //VB: snr>0, skin!=null
    public Beschuetzer(int snr, Skin skin, Software sw, double kit) {
        super(snr, skin, sw, kit);
    }  

    @Override
    //NB: return empty string if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBeschuetzer() + getSoftware().fromBeschuetzer();
    }
}
