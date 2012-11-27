import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author steff
 */
public class DroidList {

    HashMap<Integer, Android> droids;

    public DroidList() {
        droids = new HashMap<Integer, Android>();
    }

    public void insert(Android a) {
        if (a.isValid() == null) {
            droids.put(a.getSNR(), a);
        }
    }
    
    public Android find(int snr) {
        return droids.get(snr);
    }
    
    public Iterator getIter() {
        return droids.entrySet().iterator();
    }
}
