
/**
 *
 * @author Matthias
 */
public abstract class Kit {
    private double leistung;
    
    //VB: leistung>0
    public Kit(double leistung){
        this.leistung=leistung;
    }
    
    //VB: s!=null
    //NB: return "" wenn Software mit Hilfskraft kompatibel ist
    public abstract String fromHilfskraft();
    public abstract String fromGesellschafter();
    public abstract String fromBauarbeiter();
    public abstract String fromServiceTechniker();
    public abstract String fromTransportarbeiter();
    public abstract String fromObjektbewacher();
    public abstract String fromLeibwaechter();
    public abstract String fromKaempfer();
}
