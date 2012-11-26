
/**
 *
 * @author Matthias
 */
public abstract class Skin {

    //NB: return null wenn die Skin vom Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return null;
    }

    //NB: return null wenn die Skin vom Schwerarbeiter verwendet wird
    public String fromBediener() {
        return null;
    }

    //NB: return null wenn die Skin vom Beschuetzer verwendet wird
    public String fromBeschuetzer() {
        return null;
    }
}
