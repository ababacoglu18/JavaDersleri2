public class Main {





    public static void main(String[] args ){


        Character[] char1 = {'J','A','V','A'};

        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","Phyton","Kotlin"};

        Ogrenci[] ogrencidizi = {new Ogrenci("Mustafa"), new  Ogrenci("Ahmet"), new Ogrenci("Selim")};


            CharYazdir.yazdir(char1);
            IntYazdir.yazdir(integer_dizi);
            StringYazdir.yazdir(string_dizi);
            OgrenciYazdir.yazdir(ogrencidizi);


    }
}
