public class Main {


        public static <A extends Aday> A birinci(A a1, A a2){  //Yazim Metodu Onemli.


            if( a1.puanHesapla() > a2.puanHesapla()){

                return a1;
            }else {
                return a2;
            }
        }
    public static void main(String[] args){


        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(25,45,17,35);

        Sayisal birinci = birinci(sayisal1,sayisal2);
        System.out.println("Birinci sayisal ogrencinin puani: " +  birinci.puanHesapla());

        EsitAgirlik esit1 = new EsitAgirlik(40,10,50,0);
        EsitAgirlik esit2 = new EsitAgirlik(35,10,55,0);
        EsitAgirlik birinci2 = birinci(esit1, esit2);

        System.out.println("Birinci EA Ogrenci Puani: " + birinci2.puanHesapla());

    }


}
