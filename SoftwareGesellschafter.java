
/**
 *
 * @author Matthias
 */
public class SoftwareGesellschafter extends Software {

    public SoftwareGesellschafter(Security sc) {
        super("SW: Gesellschafter", sc);
    }

    //NB: return null wenn Software von Gesellschafter verwendet wird
    @Override
    public String fromGesellschafter() {
        return null;
    }
}
