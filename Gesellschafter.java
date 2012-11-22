
/**
 *
 * @author guetar
 */
public class Gesellschafter extends Bediener {
    
    public Gesellschafter(int snr, Skin skin) {
        super(snr, skin);
    }
    
    public String validateSkin(Skin skin) {
        return skin.fromGesellschafter();
    }
}