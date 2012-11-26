
/**
 *
 * @author guetar
 */
public class Security45 extends Security {
    
    @Override
    //NB: return null wenn Software vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Objektbewacher verwendet wird
    public String fromObjektbewacher() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software vom Leibwaechter verwendet wird
    public String fromLeibwaechter() {
        return null;
    }
}