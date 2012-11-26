/**
 *
 * @author Matthias
 */
public class SkinBeruehrungssensitiv extends Skin{
    //Diese Skin koennen Bediener oder Schwerarbeiter tragen
    //Nur Beschuetzer nicht, da diese eine gepanzerte tragen muessen.
    
    @Override
    //NB: Fehlermeldung wenn von Beschuetzer aufgerufen
    public String fromBeschuetzer() {
        return "ERROR: Die beruehrungssensitive Skin darf nicht vom Beschuetzer verwendet werden!\n";
    }
}
