/**
 *
 * @author Matthias
 */
public class Bauarbeiter extends Schwerarbeiter{
    
    public Bauarbeiter(int snr, Skin skin, Software sw, double kit) {
        super(snr, skin, sw);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromBauarbeiter();
    }
    
}
