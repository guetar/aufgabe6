
/**
 *
 * @author Matthias
 */
public abstract class Skin {

    //VB: s!=null
    //NB: return "" wenn Skin mit Schwerarbeiter kompatibel ist
    public String fromSchwerarbeiter(){
    return "";
    }
    
    //VB: b!=null
    //NB: return "" wenn Skin mit Bediener kompatibel ist
    public String fromBediener(){
    return "";
    }
  
    //VB: b!=null
    //NB: return "" wenn Skin mit Beschuetzer kompatibel ist
    public String fromBeschuetzer(){
    return "";
    }
}
