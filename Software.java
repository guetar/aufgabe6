/**
 *
 * @author Matthias
 */
public abstract class Software {
    
    private final byte sicherheitsstufe;
    
    public Software(byte sicherheitsstufe){
    this.sicherheitsstufe=sicherheitsstufe;
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Hilfskraft kompatibel ist
    public abstract String fromHilfskraft();
    
    //VB: b!=null
    //NB: return "" wenn Software mit Gesellschafter kompatibel ist
    public abstract String fromGesellschafter();
  
    //VB: b!=null
    //NB: return "" wenn Software mit Bauarbeiter kompatibel ist
    public abstract String fromBauarbeiter(); 

    //VB: b!=null
    //NB: return "" wenn Software mit ServiceTechniker kompatibel ist
    public abstract String fromServiceTechniker(); 
    
    //VB: b!=null
    //NB: return "" wenn Software mit Transportarbeiter kompatibel ist
    public abstract String fromTransportarbeiter(); 
    
    //VB: b!=null
    //NB: return "" wenn Software mit Objektbewacher kompatibel ist
    public abstract String fromObjektbewacher();     
    
    //VB: b!=null
    //NB: return "" wenn Software mit Leibwaechter kompatibel ist
    public abstract String fromLeibwaechter(); 
    
    //VB: b!=null
    //NB: return "" wenn Software mit Kaempfer kompatibel ist
    public abstract String fromKaempfer(); 
}
