
/**
 *
 * @author Matthias
 */
public class SoftwareHilfskraft extends Software {

    public SoftwareHilfskraft(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software von Hilfskraft verwendet wird
    @Override
    public String fromHilfskraft() {
        return null;
    }
}
