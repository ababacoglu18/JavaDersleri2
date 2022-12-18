public class Hasta implements Comparable<Hasta>{

    @java.lang.Override
    public String toString() {
        String bilgiler = "Hasta adi: " + isim +
                "\n Sikayeti: " + sikayet +
                "\nOncelik: " + oncelik;

        return bilgiler;
    }

    private String isim;
    private String sikayet;

    private int oncelik;

    public Hasta(String isim, String sikayet){
        this.isim = isim;
        this.sikayet = sikayet;
        if(sikayet.equals("Apandisit")){
            this.oncelik = 3;
        } else if (sikayet.equals("Yanik")) {
            this.oncelik = 2;
        } else  {
            this.oncelik = 1;
        }
    }

    @Override
    public int compareTo(Hasta hasta1) {
        if(this.oncelik > hasta1.oncelik){
            return -1;
        } else if (this.oncelik < hasta1.oncelik) {
            return 1;
        }else {return 0;}
    }
}
