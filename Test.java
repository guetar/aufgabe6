/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("Valid: ");
        
        AndroidGesellschafter g = new AndroidGesellschafter(1, new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidObjektbewacher o = new AndroidObjektbewacher(2, new SkinGepanzert(),new SoftwareObjektbewacher(new Security4()), new KitBeschuetzer());
        AndroidBauarbeiter b = new AndroidBauarbeiter(3, new SkinHochfest(), new SoftwareBauarbeiter(new Security3()), new KitSchwerarbeiter());
        
        System.out.println(g.isValid());
        System.out.println(o.isValid());
        System.out.println(b.isValid());
        
        System.out.println("Invalid: ");
        
        g = new AndroidGesellschafter(1, new SkinHochfest(),new SoftwareBauarbeiter(new Security1()), new KitSehrSchwerarbeiter());
        o = new AndroidObjektbewacher(2, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        b = new AndroidBauarbeiter(3, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitKaempfer());
        
        System.out.println(g.isValid() + o.isValid() + b.isValid());
    }
}
