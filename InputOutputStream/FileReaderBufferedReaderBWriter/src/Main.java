import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(    new FileReader("dosya1.txt"))){ //Konsoldan Okumuyoruz. Dosyadan Okuyoruz.

          while ( scanner.hasNextLine()){  //okuyacak baska satir kaldi mi?
           String ogrenci_bilgisi = scanner.nextLine();
          String[] array=  ogrenci_bilgisi.split(",");
          if(array[1].equals("Bilgisayar Mühendisliği")){                      //0 dan sonra 1 bolumlerin kontrol blogu.

              System.out.println("Ogrenci bilgisi: " + ogrenci_bilgisi);
          }

          }                                                             //Buffered Reader daha az erisim sagladigi icin daha optimize calisir.



       } catch (FileNotFoundException e) {
           System.out.println("File not Found. Err 532");
       }
    }
}