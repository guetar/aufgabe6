/**
 *
 * @author Matthias
 */
public class Objektbewacher extends Beschuetzer{
    
    public Objektbewacher(int snr, Skin skin, Software sw) {
        super(snr, skin, sw);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromObjektbewacher();
    }
    
    
}
