public class GelismisAbone {

    private String isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir){

        this.setIsim(isim);
        if (bakiye >= 0 && bakiye <= 120){
            this.setBakiye(bakiye);
        }
        this.setSehir(sehir);
    }

    public void dogalgaz_kullan(int miktar){

        if((this.getBakiye() - miktar)<0){

            System.out.println("Yeterli bakiye yok. ");
        }
        else {
            this.setBakiye(this.getBakiye() - miktar);

            if (this.getBakiye() - miktar < 0){

                System.out.println("Bakiyeniz bitmiştir. Lütfen En Yakın Merkeze Giderek Bakiye Yükleyiniz."
                        + " Kredi limiti  = 120TL.");
            }else {
                System.out.println("Yeni bakiye = " + getBakiye());
            }
        }
    }

    public void bakiye_ogren(){

        System.out.println(" Bakiye = " + getBakiye());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
