
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    public Bediener(int snr, Skin skin, Software sw, double kit) {
        super(snr, skin, sw, kit);
    }
    
    @Override
    public String validateSkin() {
        return getSkin().fromBediener();
    }
}