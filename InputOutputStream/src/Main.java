import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        //File file =  new File("dosya.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Loglara hangi bilgi eklensin?");

        String a  = scanner.nextLine();

        try {
            fos = new FileOutputStream("dosya.txt"); //True Uzerine yazmaya devam etmesini saglar.

            //byte[] array = {101,75,66,68};
            String s = "AltanB";
            if (a.equals("q")){
                fos.flush();

            } else {


               for(int i = 0 ; i<1;i++)
               {byte[] s_array = a.getBytes();


                fos.write(s_array);}

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File Not found exception oluştu....");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu...");
        }
        finally{

            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }

        }

        // File Input Stream
            FileInputStream fis  = null;

        try {
         fis   = new FileInputStream("dosya.txt");    ///OKUMA ALGORITMASI ONEMLI

         int deger;
         String s = "";
         while ((deger=fis.read()) != -1){
             s += (char)deger;
         }
            System.out.println("Dosya Icerigi: " + s );

            //System.out.println(  "Okunan Karakter: " +(char)(fis.read()));



        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadi.");;
        } catch (IOException e) {
            System.out.println("Dosya Okunamadı.");
        } finally {
            if(fis != null){
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Dosya Kapatilamadi.");;
            }}
        }


    }
}