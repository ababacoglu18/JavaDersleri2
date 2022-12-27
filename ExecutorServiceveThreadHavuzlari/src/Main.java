import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0 ; i <= 5; i ++){
            executor.submit(new Worker(String.valueOf(i),i));


        }

        executor.shutdown();                                //Shutdown komutu yazmazsan program calismaya devam eder.
        System.out.println("Butun isler Teslim edildi.");


        try {
            executor.awaitTermination(1,DAYS);   //1 günü aştıktan sonra işlem bitmese bile işlemi sonlandır.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Butun isler bitti.");

      /*  Thread t1 = new Thread(new Worker("1", 1));           //5 task için 50 satir kod yazdik bunun olmamasi icin ExService e Thread Havuzu baglamamiz lazim.
        Thread t2 = new Thread(new Worker("2", 2));
        Thread t3 = new Thread(new Worker("3", 3));
        Thread t4 = new Thread(new Worker("4", 4));
        Thread t5 = new Thread(new Worker("5", 5));
        System.out.println("Butun isler teslim edildi. ");
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t3.start();
        t4.start();

        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Butun isler tamamlandi.");*/



    }
}