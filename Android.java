
/**
 *
 * @author guetar
 */
public abstract class Android {
    
    private final int snr;
    private String[] available_skins = { "beruehrungssensitiv", "hochfest", "gepanzert" };
    private String[] available_software  = { "hilfskraft", "bauarbeiter", "gesellschafter" };
    
    public Android(int snr) {
        this.snr = snr;
    }
    
    protected void log() {
        
    }
    
    //NB: snr!=null;
    public int getSnr() {
        return snr;
    }
}