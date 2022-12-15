import javax.lang.model.element.NestingKind;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Set Generic Interface Collectiondan extends List Interface ile aynı.
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
        System.out.println(set1.isEmpty());

        //HashSet
        set1.add("Java");
        set1.add("Pyhton");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Css");
        //LinkedH
        set2.add("Java");
        set2.add("Pyhton");
        set2.add("C++");
        set2.add("JavaScript");
        //TreeSet
        set3.add("Java");
        set3.add("Pyhton");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Java"); //IKINCI KEZ EKLEMEYE IZIN VERMEZ.

        //---------------------------
        System.out.println("Olmasi Gereken Java,Python,Cpp,JS \n");
        System.out.println("HashSet-Dagitik----------------------------------------------");

        for(String s: set1);{
            System.out.println(set1);
        }

        System.out.println("LinkedSet-Sirali----------------------------------------------");

        for(String a: set2);{
            System.out.println(set2);
        }

        System.out.println("TreeSet-Alfabetik----------------------------------------------");

        for(String a: set3);{
            System.out.println(set3);
        }


        System.out.println(set1.contains("Java")); //java varsa true
        System.out.println(set1.isEmpty()); //Set1 e eklemeden once sorarsan 13. satira bak. true donecektir.
        set1.remove("Java");  //Elemani kaldirabiliriz. Listler gibi calisiyor.
        for(String s: set1);{
            System.out.println(set1);
        }



        Set<String> set4 = new HashSet<String>();
        Set<String> set5 = new HashSet<String>();

        set4.add("Java");
        set4.add("Pyhton");
        set4.add("C++");
        set4.add("JavaScript");
        set4.add("Php");

        set5.add("Java");
        set5.add("Go");
        set5.add("Css");
        set5.add("JavaScript");

        System.out.println("Fark Kumesi = ");

        Set<String> fark = new HashSet<String>(set5);

        System.out.println(fark.removeAll(set1));
        System.out.println(fark);

        System.out.println("Kesisim Kumesi");

        Set<String> kesisim = new HashSet<String>();
        System.out.println(kesisim.retainAll(set4));
        System.out.println(kesisim);





    }}