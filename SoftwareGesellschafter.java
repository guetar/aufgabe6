
/**
 *
 * @author Matthias
 */
public class SoftwareGesellschafter extends Software {

    public SoftwareGesellschafter(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software mit Gesellschafter kompatibel ist
    @Override
    public String fromGesellschafter() {
        return null;
    }
}
