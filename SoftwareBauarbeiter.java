/**
 *
 * @author Matthias
 */
public class SoftwareBauarbeiter extends Software{
    
    public SoftwareBauarbeiter(byte sicherheitsstufe){
    super(sicherheitsstufe);
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Bauarbeiter kompatibel ist
    @Override
    public String fromBauarbeiter(){
    return "";
    }
    
}
