
/**
 *
 * @author Matthias
 */
public class SoftwareTransportarbeiter extends Software {

    public SoftwareTransportarbeiter(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software von Transportarbeiter verwendet wird
    @Override
    public String fromTransportarbeiter() {
        return null;
    }
}
