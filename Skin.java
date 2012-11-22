
/**
 *
 * @author Matthias
 */
public abstract class Skin {

    //VB: s!=null
    //NB: return "" wenn Skin mit s kompatibel ist
    public abstract String fromSchwerarbeiter();
    
    //VB: b!=null
    //NB: return "" wenn Skin mit b kompatibel ist
    public abstract String fromBediener();
  
    //VB: b!=null
    //NB: return "" wenn Skin mit b kompatibel ist
    public abstract String fromBeschuetzer(); 
}
