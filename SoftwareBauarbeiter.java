
/**
 *
 * @author Matthias
 */
public class SoftwareBauarbeiter extends Software {

    public SoftwareBauarbeiter(Security sc) {
        super("SW: Bauarbeiter", sc);
    }

    //NB: return null wenn Software von Bauarbeiter verwendet wird
    @Override
    public String fromBauarbeiter() {
        return null;
    }
}