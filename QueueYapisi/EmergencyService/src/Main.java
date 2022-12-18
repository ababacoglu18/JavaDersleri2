import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Apandisit -> yuksek oncelik
        * Yanık -----> Orta Oncelik
        * Bas Agrisi-> Dusuk Oncelik vererek acil servis programi olustur.
        * Priority Queue Kullan.
       */

        Queue<Hasta> acilServis= new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Murat", "Bas Agrisi"));
        acilServis.offer(new Hasta("Ayse", "Apandisit"));
        acilServis.offer(new Hasta("Selami", "Yanik"));
        acilServis.offer(new Hasta("Oguz", "Yanik"));
        acilServis.offer(new Hasta("Cengiz", "Apandisit"));
        acilServis.offer(new Hasta("Mehmet", "Çıkık"));
        acilServis.offer(new Hasta("Cengiz", "Bas Donmesi"));
        acilServis.offer(new Hasta("Cengiz", "Apandisit"));
        acilServis.offer(new Hasta("Cengiz", "Yüksek Ateş"));


        int i = 1;
        while (!acilServis.isEmpty()){
            System.out.println("***********************************");
            System.out.println(i + ". sirada ");
            System.out.println( acilServis.poll());
            System.out.println("***********************************");
            i++;
            Thread.sleep(1000);
        }

    }
}