
/**
 *
 * @author Matthias
 */
public class SkinBeruehrungssensitiv extends Skin{
    
    @Override
    public String fromSchwerarbeiter() {
        return null;
    }

    //NB: return "" wenn Skin mit Bediener kompatibel ist
    @Override
    public String fromBediener() {
        return "";
    }

    @Override
    public String fromBeschuetzer() {
        return null;
    }
    
}
