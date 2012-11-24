
/**
 *
 * @author Matthias
 */
public abstract class Skin {

    //VB: s!=null
    //NB: return "" wenn Skin mit Schwerarbeiter kompatibel ist
    public abstract String fromSchwerarbeiter();
    
    //VB: b!=null
    //NB: return "" wenn Skin mit Bediener kompatibel ist
    public abstract String fromBediener();
  
    //VB: b!=null
    //NB: return "" wenn Skin mit Beschuetzer kompatibel ist
    public abstract String fromBeschuetzer(); 
}
