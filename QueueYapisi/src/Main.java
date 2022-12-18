import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Php");
        queue.offer("Cpp");
        queue.offer("Rust");

       // System.out.println(queue.peek());


        System.out.println("*****************************");
        System.out.println("Eleman Cikariliyor: " + queue.poll());


        for(int i = 0; i<=queue.size()+1;i++){
            System.out.println(queue.remove()); //Queue bosaltildi.   DAHA SONRA WHILE ILE YAP.

        }
        System.out.println(queue.isEmpty());
    }
}