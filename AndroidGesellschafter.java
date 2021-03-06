
/**
 *
 * @author guetar
 */
public class AndroidGesellschafter extends AndroidBediener {
    
    //VB: snr>0, skin!=null, software!=null, security!=null
    public AndroidGesellschafter(Skin sk, Software sw, Kit kit) {
        super("Gesellschafter", sk, sw, kit);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromGesellschafter();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromGesellschafter();
    }
}
