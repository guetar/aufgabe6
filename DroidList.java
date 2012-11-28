import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author steff
 */
public class DroidList {
    // Diese Liste verwendet eine HashMap zum Speichern der Androiden
    // Der Key ist die Seriennummer

    HashMap<Integer, Android> droids;

    public DroidList() {
        droids = new HashMap<Integer, Android>();
    }

    // VB: a != null
    // NB: a in HashMap eingefuegt
    public void insert(Android a) {
        if (a.isValid() == null) {
            droids.put(a.getSNR(), a);
        }
    }
    
    // NB: Return des Andrids wenn in HashMap vorhanden
    public Android find(int snr) {
        return droids.get(snr);
    }
    
    // NB: Return des Iterators
    public Iterator getIter() {
        return droids.entrySet().iterator();
    }
}
