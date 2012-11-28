
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
        
        System.out.println("---------------------------------------------------------\n"
                + "Wenn null unter den Androiden steht gibt es keine Fehler!\n"
                + "---------------------------------------------------------\n"
                + "\nTesten von korrekter Androiderzeugung und deren Parameter:\n"
                + "\nValid:\n");
        
        AndroidGesellschafter gVal = new AndroidGesellschafter(new SkinBeruehrungssensitiv(), new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidHilfskraft hVal = new AndroidHilfskraft(new SkinBeruehrungssensitiv(), new SoftwareHilfskraft(new Security2()), new KitHilfskraft());
        AndroidBauarbeiter bVal = new AndroidBauarbeiter(new SkinBeruehrungssensitiv(), new SoftwareBauarbeiter(new Security3()), new KitSchwerarbeiter());
        AndroidServicetechniker sVal = new AndroidServicetechniker(new SkinHochfest(), new SoftwareServicetechniker(new Security3()), new KitSchwerarbeiter());
        AndroidTransportarbeiter tVal = new AndroidTransportarbeiter(new SkinGepanzert(), new SoftwareTransportarbeiter(new Security4()), new KitSehrSchwerarbeiter());
        AndroidObjektbewacher oVal = new AndroidObjektbewacher(new SkinGepanzert(),new SoftwareObjektbewacher(new Security4()), new KitBeschuetzer());
        AndroidKaempfer kVal = new AndroidKaempfer(new SkinGepanzert(), new SoftwareKaempfer(new Security5()), new KitKaempfer());
        
        System.out.println(gVal + "\n" + gVal.isValid());
        System.out.println(hVal + "\n" + hVal.isValid());
        System.out.println(bVal + "\n" + bVal.isValid());
        System.out.println(sVal + "\n" + sVal.isValid());
        System.out.println(tVal + "\n" + tVal.isValid());
        System.out.println(oVal + "\n" + oVal.isValid());
        System.out.println(kVal + "\n" + kVal.isValid());

        
        System.out.println("\nInvalid:\n");
        
        AndroidGesellschafter gInval = new AndroidGesellschafter(new SkinHochfest(),new SoftwareBauarbeiter(new Security5()), new KitSehrSchwerarbeiter());
        AndroidHilfskraft hInval = new AndroidHilfskraft(new SkinBeruehrungssensitiv(), new SoftwareBauarbeiter(new Security1()), new KitHilfskraft());
        AndroidBauarbeiter bInval = new AndroidBauarbeiter(new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitKaempfer());
        AndroidServicetechniker sInval = new AndroidServicetechniker(new SkinGepanzert(), new SoftwareServicetechniker(new Security4()), new KitSchwerarbeiter());
        AndroidTransportarbeiter tInval = new AndroidTransportarbeiter(new SkinHochfest(), new SoftwareTransportarbeiter(new Security3()), new KitSehrSchwerarbeiter());
        AndroidObjektbewacher oInval = new AndroidObjektbewacher(new SkinGepanzert(),new SoftwareGesellschafter(new Security1()), new KitGesellschafter());
        AndroidKaempfer kInval = new AndroidKaempfer(new SkinBeruehrungssensitiv(), new SoftwareKaempfer(new Security5()), new KitKaempfer());
        
        System.out.println(gInval + "\n" + gInval.isValid());
        System.out.println(hInval + "\n" + hInval.isValid());
        System.out.println(bInval + "\n" + bInval.isValid());
        System.out.println(sInval + "\n" + sInval.isValid());
        System.out.println(tInval + "\n" + tInval.isValid());
        System.out.println(oInval + "\n" + oInval.isValid());
        System.out.println(kInval + "\n" + kInval.isValid());
        
        
        
        System.out.println("\nTesten von Multimethoden und mehrfachem dynamischen Binden:");
        
        System.out.println("\nErzeugen:\n"
                + "Security scA = new Security1();\n"
                + "Software swA = new SoftwareGesellschafter(scA);\n"
                + "Android genA mit diesen Objekten erzeugen und testen:");
        Security scA = new Security1();
        Software swA = new SoftwareGesellschafter(scA);
        Skin skA = new SkinBeruehrungssensitiv();
        Kit kitA = new KitGesellschafter();
        Android genA = new AndroidGesellschafter(skA, swA, kitA);
        System.out.println(genA + "\n" + genA.isValid());
        
        
        System.out.println("\nErzeugen:\n"
                + "Security scB = new Security4();\n"
                + "Software swB = new SoftwareBauarbeiter(scB);\n"
                + "Android genB mit diesen Objekten erzeugen und testen:");
        Security3 scB = new Security4();
        Software swB = new SoftwareBauarbeiter(scB);
        Skin skB = new SkinHochfest();
        Kit kitB = new KitSehrSchwerarbeiter();
        Android genB = new AndroidBauarbeiter(skB, swB, kitB);
        System.out.println(genB + "\n" + genB.isValid());
        
        
        System.out.println("\nErzeugen:\n"
                + "Security scC = new Security1();\n"
                + "Software swC = new SoftwareGesellschafter(scC);\n"
                + "Android genC mit diesen Objekten erzeugen und testen:");
        Security scC = new Security1();
        Software swC = new SoftwareGesellschafter(scC);
        Skin skC = new SkinBeruehrungssensitiv();
        Kit kitC = new KitSchwerarbeiter();
        Android genC = new AndroidTransportarbeiter(skC, swC, kitC);
        System.out.println(genC + "\n" + genC.isValid());
        
        
        
        System.out.println("\nTesten der Liste, Einfuegen 4 gueltige (2 davon zweimal) und 2 ungueltige"
                + "\n\nvollstaendige Liste mit 4 gueltigen Androiden:");
        
        list.insert(gVal);
        list.insert(hVal);
        list.insert(hVal);
        list.insert(kInval);
        list.insert(bVal);
        list.insert(bVal);
        list.insert(gInval);
        list.insert(kVal);
        
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
