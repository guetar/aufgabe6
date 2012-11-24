
/**
 *
 * @author Matthias
 */
public abstract class Schwerarbeiter extends Android{
    
    public Schwerarbeiter(int snr, Skin skin, Software sw) {
        super(snr, skin, sw);
    }  
    
    @Override
    public String validateSkin() {
        return getSkin().fromSchwerarbeiter();
    }
    
}
