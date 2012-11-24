
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    public Bediener(int snr, Skin skin, Software sw) {
        super(snr, skin, sw);
    }
    
    @Override
    public String validateSkin() {
        return getSkin().fromBediener();
    }
}