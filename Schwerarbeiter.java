
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
    
}
