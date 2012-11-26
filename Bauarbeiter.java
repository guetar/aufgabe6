
/**
 *
 * @author Matthias
 */
public class Bauarbeiter extends Schwerarbeiter {

    //VB: snr>0, skin!=null, software!=null, security!=null
    public Bauarbeiter(int snr, Skin sk, Software sw, Security sc) {
        super(snr, sk, sw, sc);
    }

    @Override
    public String validateSoftware() {
        return getSoftware().fromBauarbeiter();
    }
}