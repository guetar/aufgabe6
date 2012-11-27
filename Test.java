/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        DroidList list = new DroidList();
        
        /**
         * ToDo:
         * -Seriennummern der Androiden mit ihren Teilen verknuepfen
         * -Seriennummer automatisch fortlaufend machen
         * 
         * -Liste:  Einfuegen   (Bei gleicher Seriennummer > Aenderung des vorhandenen Android)
         *          Suchen 
         *          Iterator
         * 
         */
        
        System.out.println("Testen von korrekter Androiderzeugung und deren Parameter\n\nValid:\n");
        
        AndroidGesellschafter g = new AndroidGesellschafter(1, new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidObjektbewacher o = new AndroidObjektbewacher(2, new SkinGepanzert(),new SoftwareObjektbewacher(new Security4()), new KitBeschuetzer());
        AndroidBauarbeiter b = new AndroidBauarbeiter(3, new SkinHochfest(), new SoftwareBauarbeiter(new Security3()), new KitSchwerarbeiter());
        System.out.println(g.isValid());
        System.out.println(o.isValid());
        System.out.println(b.isValid());
        
        list.insert(g);
        list.insert(o);
        list.insert(b);
        
        System.out.println(list.find(2));
        System.out.println(list.find(6));

        
        System.out.println("\nInvalid:\n");
        
        g = new AndroidGesellschafter(1, new SkinHochfest(),new SoftwareBauarbeiter(new Security1()), new KitSehrSchwerarbeiter());
        o = new AndroidObjektbewacher(2, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        b = new AndroidBauarbeiter(3, new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitKaempfer());
        System.out.println(g.isValid());
        System.out.println(o.isValid());
        System.out.println(b.isValid());
        
        list.insert(g);
        list.insert(o);
        list.insert(b);        
        
        
        System.out.println("\nTesten von Multimethoden und mehrfachem dynamischen Binden:\n");

        Security scA = new Security1();
        Software swA = new SoftwareGesellschafter(scA);
        Skin skA = new SkinBeruehrungssensitiv();
        Kit kitA = new KitGesellschafter();
        Android genA = new AndroidGesellschafter(4, skA, swA, kitA);
        System.out.println(genA.isValid());
        
        
        Security3 scB = new Security4();
        Software swB = new SoftwareBauarbeiter(scB);
        Skin skB = new SkinHochfest();
        Kit kitB = new KitSehrSchwerarbeiter();
        AndroidSchwerarbeiter genB = new AndroidBauarbeiter(5, skB, swB, kitB);
        System.out.println(genB.isValid());
        
        Security scC = new Security5();
        Software swC = new SoftwareKaempfer(scC);
        Skin skC = new SkinBeruehrungssensitiv();
        Kit kitC = new KitGesellschafter();
        AndroidKaempfer genC = new AndroidKaempfer(6, skC, swC, kitC);
        System.out.println(genC.isValid());
        
        
        System.out.println("\nTesten der Liste\n");
        
       
    }
}
