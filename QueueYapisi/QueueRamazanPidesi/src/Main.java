import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Task: Fırından 1 ila 10 arasi pide cikacak (1 10 dahil al patlamasin)

        System.out.println("Ramazan Pidesi Uygulaması xd");
        Queue<String> pideKuyrugu = new LinkedList<>();
        Random random = new Random();
        pideKuyrugu.offer("Erkut");
        pideKuyrugu.offer("Ahmet");
        pideKuyrugu.offer("Alto");
        pideKuyrugu.offer("Melek");
        pideKuyrugu.offer("Cengiz");
        pideKuyrugu.offer("Beyza");
        pideKuyrugu.offer("Ilke");
        pideKuyrugu.offer("Yigit");
        pideKuyrugu.offer("Onur");
        pideKuyrugu.offer("Oguz");

        int pide_sayisi = random.nextInt(10) +1;
        System.out.println("Pideler Cikiyor.");
        Thread.sleep(3000);
        System.out.println("Cikan pide sayisi= " + pide_sayisi);

        while(pide_sayisi >0){
            System.out.println(pideKuyrugu.poll() + " Pideyi aldi.");
             pide_sayisi = pide_sayisi -1;
             Thread.sleep(1000);
        }


     while (pideKuyrugu.size() >0){
         System.out.println("Pide Alamadı: " + pideKuyrugu.poll());
     }




    }
}