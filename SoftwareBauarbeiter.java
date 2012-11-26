
/**
 *
 * @author Matthias
 */
public class SoftwareBauarbeiter extends Software {

    public SoftwareBauarbeiter(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software von Bauarbeiter verwendet wird
    @Override
    public String fromBauarbeiter() {
        return null;
    }
}