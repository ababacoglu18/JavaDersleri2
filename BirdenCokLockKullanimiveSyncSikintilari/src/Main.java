import java.util.List;

public class Main {
    public static void main(String[] args) {


        ListWorker worker = new ListWorker();

        worker.calistirThread(); //sure yariya indi fakat listeye eklenen deger 2000 tane degil!
            //Threadler Senkron calismiyorlar.
            //Synchronized kullandik dogru degerler eklendi fakat sure bu sefer 2x katina cikti.
            //Synchronized bize tek lock verdigi icin thread 2'nin metoda girebilmesi icin 2 kere beklemis gibi oluyor ve sure 2 katına cikiyor.
            //nasil cozulur? (2 Key lazim) 2 lock lazım
            //Synchronized metodu degil, synchronized kod blogu yazmalisin.


       /* long baslangic  = System.currentTimeMillis();

        worker.degerAta();

        long bitis = System.currentTimeMillis();

        System.out.println("Gecen Sure: " + (bitis - baslangic));

        //Gecen sure list 1 ve list 2 icin 4000ms ve 2448ms degerlerin eklenme sureleri. (Main Thread ile)*/




    }
}