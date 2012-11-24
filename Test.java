/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Valid: ");
        Gesellschafter g = new Gesellschafter(1, new SkinBeruehrungssensitiv());
        Objektbewacher o=new Objektbewacher(2, new SkinGepanzert());
        Bauarbeiter ba=new Bauarbeiter(3, new SkinHochfest());
        System.out.println(g.isValid()+o.isValid()+ba.isValid());        
        System.out.println("Invalid: ");
        g = new Gesellschafter(1, new SkinHochfest());
        //o=new Objektbewacher(2, new SkinGepanzert()); kann nur mit skin nicht invalid werden
        ba=new Bauarbeiter(3, new SkinGepanzert());       
        System.out.println(g.isValid()+ba.isValid());
    }
}