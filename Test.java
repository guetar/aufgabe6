/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Valid: ");
        Gesellschafter g = new Gesellschafter(1, new SkinBeruehrungssensitiv());
        System.out.println(g.isValid());        
        System.out.println("Invalid: ");
        Gesellschafter g1 = new Gesellschafter(1, new SkinGepanzert());
        System.out.println(g1.isValid());
    }
}