/**
 *
 * @author Matthias
 */
public abstract class Software {
    
    protected final byte sicherheitsstufe;
    
    public Software(byte sicherheitsstufe){
    this.sicherheitsstufe=sicherheitsstufe;
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Hilfskraft kompatibel ist
    public String fromHilfskraft(){
    return null;
    }
    
    //VB: b!=null
    //NB: return "" wenn Software mit Gesellschafter kompatibel ist
    public String fromGesellschafter(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit Bauarbeiter kompatibel ist
    public String fromBauarbeiter(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit ServiceTechniker kompatibel ist
    public String fromServiceTechniker(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit Transportarbeiter kompatibel ist
    public String fromTransportarbeiter(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit Objektbewacher kompatibel ist
    public String fromObjektbewacher(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit Leibwaechter kompatibel ist
    public String fromLeibwaechter(){
    return null;
    }
    //VB: b!=null
    //NB: return "" wenn Software mit Kaempfer kompatibel ist
    public String fromKaempfer(){
    return null;
    }
}
