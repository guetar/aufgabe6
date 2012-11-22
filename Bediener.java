
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    public Bediener(int snr, Skin skin) {
        super(snr, skin);
    }
    
    public String validateSkin(Skin s) {
        return s.fromBediener(this);
    }
}