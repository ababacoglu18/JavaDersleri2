public class Main {



    public static void main(String[] args){


        /*PcMuhendisi muhendis1= new PcMuhendisi(true,false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube1 = {"Vestel","Havelsan","Turksat"};

        muhendis1.is_tecrubesi(tecrube1);*/


        MakineMuhendisi muhendis2 = new MakineMuhendisi(false,true);
        String[] tecrube = {};
        String[] referans = {"Mustafa" , "Ahmet"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(4));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referansGetir(referans);
        muhendis2.calis();
    }
}
