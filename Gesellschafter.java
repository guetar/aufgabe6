
/**
 *
 * @author guetar
 */
public class Gesellschafter extends Bediener {
    
    public Gesellschafter(int snr, Skin skin, Software sw) {
        super(snr, skin, sw);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromGesellschafter();
    }

}