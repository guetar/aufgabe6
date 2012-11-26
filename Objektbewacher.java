/**
 *
 * @author Matthias
 */
public class Objektbewacher extends Beschuetzer{
    
    public Objektbewacher(int snr, Skin skin, Software sw, double kit) {
        super(snr, skin, sw, kit);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromObjektbewacher();
    }
    
    
}
