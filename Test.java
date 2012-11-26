/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("Valid: ");
        
        Gesellschafter g = new Gesellschafter(1, new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(new Security1()));
        Objektbewacher o = new Objektbewacher(2, new SkinGepanzert(),new SoftwareObjektbewacher(new Security45()));
        Bauarbeiter b = new Bauarbeiter(3, new SkinHochfest(), new SoftwareBauarbeiter(new Security34()));
        
        System.out.println(g.isValid() + o.isValid() + b.isValid());
        
        System.out.println("Invalid: ");
        
        g = new Gesellschafter(1, new SkinHochfest(),new SoftwareBauarbeiter(new Security1()));
        o = new Objektbewacher(2, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()));
        b = new Bauarbeiter(3, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()));
        
        System.out.println(g.isValid() + o.isValid() + b.isValid());
    }
}