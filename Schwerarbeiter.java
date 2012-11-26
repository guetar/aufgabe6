
/**
 *
 * @author Matthias
 */
public abstract class Schwerarbeiter extends Android{
    
    public Schwerarbeiter(int snr, Skin skin, Software sw, Kit kit) {
        super(snr, skin, sw, kit);
    }  
    
    @Override
    public String validateSkin() {
        return getSkin().fromSchwerarbeiter();
    }
    
    @Override
    //NB: return empty string if valid, ERRORS otherwise
    public String validateSkin() {
        return getSkin().fromSchwerarbeiter() + getSoftware().fromSchwerarbeiter();
    }
}
