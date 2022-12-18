import java.io.*;
import java.util.Scanner;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1,int vize2,int final1){

        String cikti = "";
        double toplam_not = (vize1*3/10.0) + (vize2*3/10.0) +(final1 * 4/10.0);
        if (toplam_not >= 90 ){
           cikti = isim + " Bu dersen AA Aldi \n";
        }  else if (toplam_not >= 85 ){
            cikti = isim + " Bu dersen BA Aldi \n";
        }else if (toplam_not >= 80 ){
            cikti = isim + " Bu dersen BB Aldi \n";
        }else if (toplam_not >= 75 ){
            cikti = isim + " Bu dersen CB Aldi \n";
        }else if (toplam_not >= 70 ){
            cikti = isim + " Bu dersen CC Aldi \n";
        }else if (toplam_not >= 65 ){
            cikti = isim + " Bu dersen DC Aldi \n";
        }else if (toplam_not >= 60 ){
            cikti = isim + " Bu dersen DD Aldi \n";
        }else if (toplam_not >= 55 ){
            cikti = isim + " Bu dersen FD Aldi \n";
        }else  {
            cikti = isim + " Bu dersen FF Aldi \n";
        }
        return cikti;


    }
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))  ;
           FileWriter writer = new FileWriter("harfnotlari.txt")){          //TrywithResourcesCiftYapi

            while (scanner.hasNextLine()){
            String ogrenciBilgileri = scanner.nextLine();

            String[] ogrenciArray = ogrenciBilgileri.split(",");  //0. index ismi 1 2 3 vize1 2 ve finali verecek.

                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int final1 = Integer.valueOf(ogrenciArray[3]);
             String cikti =    harfNotuHesapla(ogrenciArray[0],vize1,vize2,final1 );
             writer.write(cikti + "\n");


            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya Açılırken Hata Oluştu.");
        }

    }
}