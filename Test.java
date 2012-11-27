
import java.util.Iterator;

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
        
        System.out.println("Testen von korrekter Androiderzeugung und deren Parameter\n(Wenn null unter den Androiden steht gibt es keine Fehler!)\n\nValid:\n");
        
        AndroidGesellschafter gVal = new AndroidGesellschafter(new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidObjektbewacher oVal = new AndroidObjektbewacher(new SkinGepanzert(),new SoftwareObjektbewacher(new Security4()), new KitBeschuetzer());
        AndroidBauarbeiter bVal = new AndroidBauarbeiter(new SkinHochfest(), new SoftwareBauarbeiter(new Security3()), new KitSchwerarbeiter());
        System.out.println(gVal + "\n" + gVal.isValid());
        System.out.println(oVal + "\n" + oVal.isValid());
        System.out.println(bVal + "\n" + bVal.isValid());

        
        System.out.println("\nInvalid:\n");
        
        AndroidGesellschafter gInval = new AndroidGesellschafter(new SkinHochfest(),new SoftwareBauarbeiter(new Security1()), new KitSehrSchwerarbeiter());
        AndroidObjektbewacher oInval = new AndroidObjektbewacher(new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidBauarbeiter bInval = new AndroidBauarbeiter(new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitKaempfer());
        System.out.println(gInval + "\n" + gInval.isValid());
        System.out.println(oInval + "\n" + oInval.isValid());
        System.out.println(bInval + "\n" + bInval.isValid());
        
        
        System.out.println("\nTesten von Multimethoden und mehrfachem dynamischen Binden:\n");

        Security scA = new Security1();
        Software swA = new SoftwareGesellschafter(scA);
        Skin skA = new SkinBeruehrungssensitiv();
        Kit kitA = new KitGesellschafter();
        Android genA = new AndroidGesellschafter(skA, swA, kitA);
        System.out.println(genA + "\n" + genA.isValid());
        
        
        Security3 scB = new Security4();
        Software swB = new SoftwareBauarbeiter(scB);
        Skin skB = new SkinHochfest();
        Kit kitB = new KitSehrSchwerarbeiter();
        AndroidSchwerarbeiter genB = new AndroidBauarbeiter(skB, swB, kitB);
        System.out.println(genB + "\n" + genB.isValid());
        
        Security scC = new Security5();
        Software swC = new SoftwareKaempfer(scC);
        Skin skC = new SkinBeruehrungssensitiv();
        Kit kitC = new KitGesellschafter();
        AndroidKaempfer genC = new AndroidKaempfer(skC, swC, kitC);
        System.out.println(genC + "\n" + genC.isValid());
        
        
        System.out.println("\nTesten der Liste, 4 gueltige (2 davon zweimal), 2 ungueltige werden hinzugefeugt\n\nvollstaendige Liste mit 4 gueltigen Androiden:");
        
        list.insert(gVal);
        list.insert(oVal);
        list.insert(oVal);
        list.insert(genA);
        list.insert(genB);
        list.insert(genB);
        list.insert(gInval);
        list.insert(genC);
        
        Iterator it = list.getIter();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("\nSuchen in Liste nach Android mit Seriennummer 1, 2 & 9:");
        System.out.println("These are the droids we're looking for:");
        System.out.println(list.find(1));
        System.out.println(list.find(2));
        System.out.println("9?:");
        System.out.println(list.find(9));
    }
}
