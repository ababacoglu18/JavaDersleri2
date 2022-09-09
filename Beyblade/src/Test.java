import java.util.Scanner;

public class Test {




    public static void main(String[] args){


        System.out.println("Beyblade Oyununa Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basınız. ");


        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println(" \n Hangi Beyblade'i uretmek istiyorsunuz?");
            String islem = scanner.nextLine();


            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor.");
                break;
            }else{
                BeybladeFabrikasi beybladeFabrikasi1 = new BeybladeFabrikasi();
                Beybladeci beybladeci1 = beybladeFabrikasi1.beybladeUret(islem);
            if(beybladeci1 == null){
                System.out.println("Lütfen Geçerli bir Beyblade ismi girin!");
            }else {

                beybladeci1.bilgileriGoster();
                beybladeci1.saldir();
                beybladeci1.kutsalCanavarOrtayaCikar();
            }}





        }

    }
}
