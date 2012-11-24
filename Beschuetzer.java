
/**
 *
 * @author Matthias
 */
class Beschuetzer extends Android{

    //VB: snr>0, skin!=null
    public Beschuetzer(int snr, Skin skin) {
        super(snr, skin);
    }  

    @Override
    public String validateSkin() {
        return getSkin().fromBeschuetzer();
    }
    
}
