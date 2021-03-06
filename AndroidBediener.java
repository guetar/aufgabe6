
/**
 *
 * @author guetar
 */
public abstract class AndroidBediener extends Android {
    
    public AndroidBediener(String bez, Skin skin, Software sw, Kit kit) {
        super(bez, skin, sw, kit);
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromBediener();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSoftware() {
        return getSoftware().fromBediener();
    }
    
    @Override
    //NB: return null if valid, ERRORS otherwise
    public String validateSecurity() {
        return getSoftware().getSecurity().fromBediener();
    }
    
}
