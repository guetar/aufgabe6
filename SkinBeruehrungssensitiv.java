
/**
 *
 * @author Matthias
 */
public class SkinBeruehrungssensitiv extends Skin{
    
    //VB: b!=null
    //NB: return "" wenn Skin mit b kompatibel ist
    public String fromBediener(){
    return "";
    }

    @Override
    public String fromSchwerarbeiter(Schwerarbeiter s) {
        return null;
    }

    @Override
    public String fromBediener(Bediener b) {
        return null;
    }

    @Override
    public String fromBeschuetzer(Beschuetzer b) {
        return null;
    }
    
}
