import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {


    public static void islemleri_bastir(){

        System.out.println("0 - Islemleri Görüntüle.");
        System.out.println("1 - Bir sonraki Şehre Git");
        System.out.println("2 - Bir önceki şehre git.");
        System.out.println("3 - Uygulamadan çık.");
    }
    public static void sehirleri_turla(LinkedList<String> sehirler){


        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleri_bastir();

       Scanner scanner = new Scanner(System.in);

       if(!iterator.hasNext()){

           System.out.println("Herhangi bir şehir bulunmuyor");

       }else{

           System.out.println("Sehir var");
       }
       boolean cikis = false;
       boolean ileri = true;



       while(!cikis){;

           System.out.println("Bir işlem seçiniz.");

           islem = scanner.nextInt();

           switch (islem) {
               case 0:
                   islemleri_bastir();
                   break;
               case 1:
                   if(!ileri){
                       if ( iterator.hasNext()){
                           iterator.next();
                       }
                       ileri = true;
                   }
                   if (iterator.hasNext()) {
                       System.out.println("Sonraki sehre gidiliyor " + iterator.next());
                   } else {
                       System.out.println("Gidilecek bir şehir yok.");
                   }
                   break;

               case 2:
                   if(ileri){

                     if (iterator.hasPrevious()){
                         iterator.previous();
                     }
                     ileri = false;
                   }
                   if (iterator.hasPrevious()) {
                       System.out.println("Sehre gidiliyor. " + iterator.previous());
                   } else {
                       System.out.println("Gidilecek şehir yok.");
                       ileri = true;
                   }
                   break;


               case 3:
                   cikis = true;
                   System.out.println("Uygulamadan Çıkılıyor.");
                   break;

           }
       }

       }




    public static void main(String[] args){



        LinkedList<String> sehirler = new  LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        sehirler.add("Denizli");
        sehirler.add("Istanbul");

        sehirleri_turla(sehirler);

    }
}
