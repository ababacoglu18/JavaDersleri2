import java.util.*;

public class Main {
    public static void main(String[] args) {


        Vector<String> vec1 = new Vector<String>();
        ArrayList<String> list1 = new ArrayList<>();

        vec1.add("Java");
        vec1.add("C++");
        vec1.add("Go");
        vec1.add("Php");



       /* ListIterator<String> iterator = vec1.listIterator();  //Onemli

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }*/

        Enumeration<String> enumeration = vec1.elements();  //Vectore ozel fakat ListIterator daha kolay.
        while (enumeration.hasMoreElements()){
            enumeration.nextElement();

        }

        System.out.println("Ilk eleman " + vec1.firstElement() );
        System.out.println("Son eleman " + vec1.lastElement() );




        //STACK = LIFO LAST IN FIRST OUT

        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("Ahmet");
        stack.push("Mehmet");
        stack.push("Selami");

        /*Enumeration<String> enumeration1 = stack.elements();
        while (enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }*/

        System.out.println(stack.peek()); //Peek son elemani alir fakat cikarmaz.


        System.out.println("************************ Stack Degismez");
        for (String s: stack){
            System.out.println(s);
        }

        System.out.println("************************ Stack degisecek ");

        System.out.println( stack.pop());
        for (String s: stack){
            System.out.println(s);
        }

    }
}