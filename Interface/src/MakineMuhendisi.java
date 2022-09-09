public class MakineMuhendisi implements Imuhendis, Calisma{


    private  boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerliğimi Yaptım.");
        }else {
            System.out.println("Askerliğimi Yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return   "Ortalamam: " + derece ;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil){

            System.out.println("Adli Sicil Kaydım Bulunuyor");
        }else {
            System.out.println("Adli Sicil Bulunamadı.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        if (array.length == 0){

            System.out.println("Herhangi bir tecrübe yok.");
        }else {
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım. ");
            for(int i = 0; i < array.length; i++){

                System.out.println(array[i]);
            }
        }
    }
    public  void referansGetir(String[] array2){
            if(array2.length == 0){

                System.out.println("Referans Bulunamadı. ");
            }else {
                System.out.println("Referanslarım... ");
                for(int i = 0; i < array2.length; i++){

                    System.out.println(array2[i]);}

            }
    }

    @Override
    public void calis() {
        System.out.println("Mühendis çalışıyor");
    }
}


