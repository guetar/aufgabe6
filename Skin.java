/**
 *
 * @author Matthias
 */
public abstract class Skin {
    private String bez;
    
    public Skin(String bez) {
        this.bez = bez;
    }
    
    public String fromSchwerarbeiter() {
        return "ERROR in Skin: Diese Skin darf nicht vom Schwerarbeiter verwendet werden!\n";
    }

    public String fromBediener() {
        return "ERROR in Skin: Diese Skin darf nicht vom Bediener verwendet werden!\n";
    }

    public String fromBeschuetzer() {
        return "ERROR in Skin: Diese Skin darf nicht vom Bediener verwendet werden!\n";
    }
    
    public String toString() {
        return bez;
    }
}
