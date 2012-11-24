/**
 *
 * @author Matthias
 */
public class SoftwareGesellschafter extends Software{
    
    public SoftwareGesellschafter(byte sicherheitsstufe){
    super(sicherheitsstufe);
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Gesellschafter kompatibel ist
    @Override
    public String fromGesellschafter(){
    return "";
    }
}
