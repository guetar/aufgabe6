
/**
 *
 * @author Matthias
 */
public class SoftwareKaempfer extends Software {

    public SoftwareKaempfer(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software von Kaempfer verwendet wird
    @Override
    public String fromKaempfer() {
        return null;
    }
}
