/**
 *
 * @author Matthias
 */
public class SoftwareObjektbewacher extends Software{
    
    public SoftwareObjektbewacher(byte sicherheitsstufe){
    super(sicherheitsstufe);
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Objektbewacher kompatibel ist
    @Override
    public String fromObjektbewacher(){
    return "";
    }
}
