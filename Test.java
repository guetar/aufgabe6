/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Valid: ");
        Gesellschafter g = new Gesellschafter(1, new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(Byte.parseByte("1")), 0.7);
        Objektbewacher o=new Objektbewacher(2, new SkinGepanzert(),new SoftwareObjektbewacher(Byte.parseByte("1")), 7);
        Bauarbeiter ba=new Bauarbeiter(3, new SkinHochfest(), new SoftwareBauarbeiter(Byte.parseByte("1")), 4);
        System.out.println(g.isValid()+o.isValid()+ba.isValid());        
        System.out.println("Invalid: ");
        g = new Gesellschafter(1, new SkinHochfest(),new SoftwareBauarbeiter(Byte.parseByte("1")), 0.7);
        o=new Objektbewacher(2, new SkinGepanzert(),new SoftwareGesellschafter(Byte.parseByte("1")), 7); 
        ba=new Bauarbeiter(3, new SkinGepanzert(),new SoftwareGesellschafter(Byte.parseByte("1")), 4);       
        System.out.println(g.isValid()+o.isValid()+ba.isValid());
    }
}