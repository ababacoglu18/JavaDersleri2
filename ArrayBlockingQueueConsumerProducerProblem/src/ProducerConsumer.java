import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random(100);

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);  //Queue icinde max 10 deger olacak.

    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = random.nextInt();
                System.out.println("Producer Uretiyor " + value);
                queue.put(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void consume(){

        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer value = queue.take(); //take kendi icinde threadlerle yazilmistir.
                System.out.println("Consumer Tuketiyor.: " + value);
                System.out.println( " Queue Size: "+queue.size());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
