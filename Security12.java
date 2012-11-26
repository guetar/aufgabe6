
/**
 *
 * @author guetar
 */
public class Security12 extends Security {

    @Override
    //NB: return null wenn Software vom Bediener verwendet wird
    public String fromBediener() {
        return null;
    }
    
    @Override
    //NB: return null wenn Software von Hilfskraft verwendet wird
    public String fromHilfskraft() {
        return null;
    }
}