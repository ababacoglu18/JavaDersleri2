import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){


        /*for ( String a: gidilecek_yerler) {
            System.out.println(  (gidilecek_yerler.indexOf(a)+1) +". "+a);
        }*/

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

    }
    public static void main(String[] args){


        LinkedList<String> gidilecek_yerler = new LinkedList<>();

        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Sinema");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Starbucks");
        gidilecek_yerler.add("Ev");

        listeyi_bastir(gidilecek_yerler);

    }
}
