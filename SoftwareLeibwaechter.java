
/**
 *
 * @author Matthias
 */
public class SoftwareLeibwaechter extends Software {

    public SoftwareLeibwaechter(Security sc) {
        super("SW: Leibwaechter", sc);
    }

    //NB: return null wenn Software von Leibwaechter verwendet wird
    @Override
    public String fromLeibwaechter() {
        return null;
    }
}
