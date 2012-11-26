/**
 *
 * @author Matthias
 */
public class SkinHochfest extends Skin{
    // Diese Skin koennen nur Schwerarbeiter tragen
    // Bediener und Beschuetzer nicht, da sie sensitive oder gepanzerte tragen muessen

    @Override
    // NB: return ERROR wenn SkinHochfest vom Bediener verwendet wird
    public String fromBediener() {
        return "ERROR in Skin: Die hochfeste Skin darf nicht vom Bediener verwendet werden!\n";
    }
    
    @Override
    // NB: return ERROR wenn SkinHochfest vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return "ERROR in Skin: Die hochfeste Skin darf nicht vom Beschuetzer verwendet werden!\n";
    }
}