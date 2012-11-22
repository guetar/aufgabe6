
/**
 *
 * @author guetar
 */
public abstract class Bediener{
    
    public String validateSkin(Skin s) {
        s.usedByBediener(this);
        return "placeholder";
    }
}