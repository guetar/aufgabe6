
/**
 *
 * @author Matthias
 */
public class SoftwareBauarbeiter extends Software {

    public SoftwareBauarbeiter(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software mit Bauarbeiter kompatibel ist
    @Override
    public String fromBauarbeiter() {
        return null;
    }
}