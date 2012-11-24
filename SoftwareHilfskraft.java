/**
 *
 * @author Matthias
 */
public class SoftwareHilfskraft extends Software{
    
    public SoftwareHilfskraft(byte sicherheitsstufe){
    super(sicherheitsstufe);
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Hilfskraft kompatibel ist
    @Override
    public String fromHilfskraft(){
    return "";
    }
    
}
