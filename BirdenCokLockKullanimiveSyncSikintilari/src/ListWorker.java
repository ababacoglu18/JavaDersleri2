import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

    Random rdm1 = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    private Object lock1 = new Object();  //list 1 e ozgu olmalı
    private Object lock2 = new Object();

    public  void list1DegerEkle(){

        synchronized (lock1) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(rdm1.nextInt(100));}}
    /*public void list2DegerEkle(){
        for(int i = 0; i<2000 ; i++){
            list2.add(i);
            try {                           //eski islem
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }*/
    public void list2DegerEkle(){
        synchronized (lock2){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(rdm1.nextInt(100));}}

    public void degerAta(){
        for (int i = 0 ; i< 1000 ; i++){  //2000 deger eklenmesi icin 2 thread cagirilmasi lazim.
            list2DegerEkle();
            list1DegerEkle();
        }
    }

    public void calistirThread(){

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        long baslangic = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.print("List1: " + list1.size());
        System.out.println(" List2: " + list2.size());

        long bitis = System.currentTimeMillis();

        System.out.println("Gecen Sure: " + (bitis-baslangic));

    }
}
