/**
 *
 * @author Matthias
 */
public class SkinHochfest extends Skin{

    @Override
    // NB: return ERROR wenn SkinHochfest vom Schwerarbeiter verwendet wird
    public String fromBediener() {
        return "ERROR in Skin: Die hochfeste Skin darf nicht vom Bediener verwendet werden!\n";
    }
}