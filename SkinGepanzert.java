/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin {
    // Diese Skin koennen von Schwerarbeiter oder Beschuetzer werden
    // Nur Bediener nicht, da diese eine beruehrungssensitive tragen muessen
    
    public SkinGepanzert() {
        super("gepanzerte Skin");
    }

    @Override
    //NB: return null (kein Fehler) wenn Skin von Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return null;
    }
    
    @Override
    //NB: return null (kein Fehler) wenn Skin von Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return null;
    }
}
