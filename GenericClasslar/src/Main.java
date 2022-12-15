public class Main {





    public static void main(String[] args ){


        Character[] char1 = {'J','A','V','A'};

        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","Phyton","Kotlin"};

        Ogrenci[] ogrencidizi = {new Ogrenci("Mustafa"), new  Ogrenci("Ahmet"), new Ogrenci("Selim")};

          //fff
            CharYazdir.yazdir(char1);
            IntYazdir.yazdir(integer_dizi);
            StringYazdir.yazdir(string_dizi);
            OgrenciYazdir.yazdir(ogrencidizi);

        System.out.println("*******************************************************************");


        //Oncesi Generic Class kullanmadigimiz hali.
        //Generic ile tek classta sorunu çözebiliyoruz.
        //Generic class Primitive value tutmaz!
        //Sadece GenericYazdir Class'ina bakman yeterli.


        GenericYazdir<Character> yazdir_char = new GenericYazdir<Character>();
        GenericYazdir<String> yazdir_string = new GenericYazdir<String>();
        GenericYazdir<Integer> yazdir_int = new GenericYazdir<Integer>();

        yazdir(char1);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrencidizi);
    }
    //main içinde Generic kullanımı
    public static <E> void yazdir ( E[] dizi){
        for (E e: dizi){

            System.out.println(e);
        }

    }
}
