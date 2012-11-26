/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin {
    // Diese Skin koennen Schwerarbeiter oder Beschuetzer tragen
    // Nur Bediener nicht, da diese eine beruehrungssensitive tragen muessen

    @Override
    //NB: Fehlermeldung wenn von Bediener aufgerufen
    public String fromBediener() {
        return "ERROR: Die gepanzerte Skin darf nicht vom Bediener verwendet werden!\n";
    }
}
