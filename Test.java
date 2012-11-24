/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Valid: ");
        Gesellschafter g = new Gesellschafter(1, new SkinBeruehrungssensitiv());
        Beschuetzer b=new Beschuetzer(2, new SkinGepanzert());
        Schwerarbeiter s=new Schwerarbeiter(3, new SkinHochfest());
        System.out.println(g.isValid()+b.isValid()+s.isValid());        
        System.out.println("Invalid: ");
        g = new Gesellschafter(1, new SkinHochfest());
        //b=new Beschuetzer(2, new SkinGepanzert()); kann nur mit skin nicht invalid werden
        s=new Schwerarbeiter(3, new SkinGepanzert());       
        System.out.println(g.isValid()+s.isValid());
    }
}