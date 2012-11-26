
/**
 *
 * @author Matthias
 */
public class SoftwareServicetechniker extends Software {

    public SoftwareServicetechniker(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software von Servicetechniker verwendet wird
    @Override
    public String fromServicetechniker() {
        return null;
    }
}
