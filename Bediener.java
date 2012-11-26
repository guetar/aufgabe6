
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    public Bediener(int snr, Skin skin, Software sw, Kit kit) {
        super(snr, skin, sw, kit);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBediener();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromBediener();
    }
}
