
/**
 *
 * @author Matthias
 */
public class SoftwareObjektbewacher extends Software {

    public SoftwareObjektbewacher(Security sc) {
        super(sc);
    }

    //NB: return null wenn Software mit Objektbewacher kompatibel ist
    @Override
    public String fromObjektbewacher() {
        return null;
    }
}
