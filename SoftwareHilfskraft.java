
/**
 *
 * @author Matthias
 */
public class SoftwareHilfskraft extends Software {

    public SoftwareHilfskraft(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software mit Hilfskraft kompatibel ist
    @Override
    public String fromHilfskraft() {
        return null;
    }
}
