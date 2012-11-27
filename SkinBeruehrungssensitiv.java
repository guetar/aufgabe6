/**
 *
 * @author Matthias
 */
public class SkinBeruehrungssensitiv extends Skin{

    public SkinBeruehrungssensitiv() {
        super("Beruehrungssensitive Skin");
    }
    
    //Diese Skin koennen Bediener oder Schwerarbeiter tragen
    //Nur Beschuetzer nicht, da diese eine gepanzerte tragen muessen.
    
    @Override
    //NB: Fehlermeldung wenn von Beschuetzer aufgerufen
    public String fromBediener() {
        return null;
    }
    
    @Override
    public String fromSchwerarbeiter() {
        return null;
    }
}
