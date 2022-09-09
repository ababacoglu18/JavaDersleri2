import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Metallica");
        arrayList.add("Trash");
        arrayList.add("Tesla");
        arrayList.add("Iron Maiden");

        System.out.println(arrayList.get(0));

        System.out.println(arrayList.size());


        arrayList.remove(0);
        System.out.println(arrayList.get(0));


        System.out.println(arrayList.indexOf("Tesla"));

        arrayList.set(4,"Selam");

    }
}
