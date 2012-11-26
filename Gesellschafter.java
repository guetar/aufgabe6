
/**
 *
 * @author guetar
 */
public class Gesellschafter extends Bediener {
    
    public Gesellschafter(int snr, Skin skin, Software sw, double kit) {
        super(snr, skin, sw, kit);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromGesellschafter();
    }

}