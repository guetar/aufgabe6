/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin {
    
    public SkinGepanzert() {
        super("gepanzerte Skin");
    }
    // Diese Skin koennen Schwerarbeiter oder Beschuetzer tragen
    // Nur Bediener nicht, da diese eine beruehrungssensitive tragen muessen

    @Override
    public String fromBeschuetzer() {
        return null;
    }
    
    @Override
    public String fromSchwerarbeiter() {
        return null;
    }
}
