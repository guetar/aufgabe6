
/**
 *
 * @author Matthias
 */
public class Bauarbeiter extends Schwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Bauarbeiter(int snr, Skin sk, Software sw) {
        super(snr, sk, sw);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromBauarbeiter();
    }
}
