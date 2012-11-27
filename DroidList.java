
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
