
/**
 *
 * @author Matthias
 */
public class SoftwareKaempfer extends Software {

    public SoftwareKaempfer(Security sc) {
        super("SW: Kaempfer", sc);
    }

    //NB: return null wenn Software von Kaempfer verwendet wird
    @Override
    public String fromKaempfer() {
        return null;
    }
}
