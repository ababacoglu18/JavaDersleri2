import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("dosya1.txt")))){ //Konsoldan Okumuyoruz. Dosyadan Okuyoruz.
                                                                                                    //Buffered Içine Reader Yolla.

          while ( scanner.hasNextLine()){  //okuyacak baska satir kaldi mi?
           String ogrenci_bilgisi = scanner.nextLine();
          String[] array=  ogrenci_bilgisi.split(",");
          if(array[1].equals("Bilgisayar Mühendisliği")){                      //0 dan sonra 1 bolumlerin kontrol blogu.

              System.out.println("Ogrenci bilgisi: " + ogrenci_bilgisi);
          }

          }                                                             //Buffered Reader daha az erisim sagladigi icin daha optimize calisir.
                                                                            //Buffer Youtube'da vardi.
                                                                                //Doldur kullan, doldur kullan mantigi :)
       } catch (FileNotFoundException e) {
           System.out.println("File not Found. Err 532");
       }


       //Buffered Writer
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("dosya.txt",true))){
            writer.write("Mehmet Cinkaya,Bilgisayar Mühendisliğ\n");


        } catch (IOException e) {
            System.out.println("Dosya Acilamadi.");
        }

    }
}