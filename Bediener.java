
/**
 *
 * @author guetar
 */
public abstract class Bediener extends Android {
    
    public String validateSkin(Skin s) {
        return s.fromBediener(this);
    }
}