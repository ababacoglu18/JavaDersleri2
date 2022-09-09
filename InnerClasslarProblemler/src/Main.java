import sun.dc.pr.PRError;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik problemleri programına hoş geldiniz");
        String islemler = " İslemler: \n" +
                "  1. Daire alan hesaplam \n" +
                "  2. Ucgen Cevresi Hesaplama \n" +
                "  3. 2 Vektörün Ic carpımını Hesaplama";


        while   ( true ){

            System.out.println(islemler);


            System.out.println( "Islemi seciniz.");
            String islem = scanner.nextLine();

            if(islem.equals("q")){

                System.out.println("Programdan Çıkılıyor");
                break;
            }
            if(islem.equals("1")){
                System.out.println("Dairenin Yarıçapı giriniz.");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlan(yaricap);
            }
            if(islem.equals("2")){

                System.out.println("Kenar 1 i giriniz. ");
                int kena1 = scanner.nextInt();



                System.out.println("kenar 2 giriniz");
                int kena2 = scanner.nextInt();

                System.out.println("kenar 3 giriniz");
                int kena3 = scanner.nextInt();


                Problem.Matematik.ucgenCevresi(kena1,kena2,kena3);
            }
            if(islem.equals("3")){
                Vector vec1 = new Vector("Vektör 1");
                Vector vec2 = new Vector("Vektör 2");

                Problem.Fizik.icCarpim(vec1,vec2);
            }
            else{
                System.out.println("Geçersiz işlem.");

            }

        }



    }
}
