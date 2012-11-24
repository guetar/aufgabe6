
/**
 *
 * @author Matthias
 */
class Schwerarbeiter extends Android{
    
    public Schwerarbeiter(int snr, Skin skin) {
        super(snr, skin);
    }  
    
    @Override
    public String validateSkin() {
        return getSkin().fromSchwerarbeiter();
    }
    
}
