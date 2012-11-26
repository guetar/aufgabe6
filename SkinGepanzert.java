
/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin {

    @Override
    // NB: return ERROR wenn SkinGepanzert vom Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return "ERROR: Die gepanzerte Skin darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    //NB: return ERROR wenn SkinGepanzert vom Bediener verwendet wird
    @Override
    public String fromBediener() {
        return "ERROR: Die gepanzerte Skin darf nicht vom Bediener verwendet werden!\n";
    }
}