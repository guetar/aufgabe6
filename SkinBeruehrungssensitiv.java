/**
 *
 * @author Matthias
 */
public class SkinBeruehrungssensitiv extends Skin{
    // Diese Skin koennen von Schwerarbeiter oder Bediener verwendet werden
    // Nur von Schwerarbeiter nicht, da diese eine gepanzerter tragen muessen

    public SkinBeruehrungssensitiv() {
        super("Beruehrungssensitive Skin");
    }
    
    //Diese Skin koennen Bediener oder Schwerarbeiter tragen
    //Nur Beschuetzer nicht, da diese eine gepanzerte tragen muessen.
    
    @Override
    //NB: return null (kein Fehler) wenn Skin von Bediener verwendet wird
    public String fromBediener() {
        return null;
    }
    
    @Override
    //NB: return null (kein Fehler) wenn Skin von Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return null;
    }
}
