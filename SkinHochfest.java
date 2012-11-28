/**
 *
 * @author Matthias
 */
public class SkinHochfest extends Skin{
    // Diese Skin koennen nur von Schwerarbeiter verwendet werden

    public SkinHochfest() {
        super("hochfeste Skin");
    }
    
    @Override
    //NB: return null (kein Fehler) wenn Skin von Schwerarbeiter verwendet wird
    public String fromSchwerarbeiter() {
        return null;
    }
}