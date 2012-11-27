
/**
 *
 * @author Matthias
 */
public class SoftwareObjektbewacher extends Software {

    public SoftwareObjektbewacher(Security sc) {
        super("SW: Objektbewacher", sc);
    }

    //NB: return null wenn Software von Objektbewacher verwendet wird
    @Override
    public String fromObjektbewacher() {
        return null;
    }
}
