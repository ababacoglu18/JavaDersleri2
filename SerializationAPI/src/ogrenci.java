import java.io.Serializable;

public class ogrenci implements Serializable {  // Herhangi bir metodu yok sadece belirtmek zorundasın.

        private static final long serialVersionUID = 1000;   //Update sonrası patlamanı önler.

    private String isim ;
    private int id;
    private String bolum;

    @Override
    public String toString() {
        String bilgiler = "Ogrenci Ismi: "  + isim +
                "\nOgrenci Numarasi: " + id +
                "\nOgrencinin Bolumu: " + bolum;

        return bilgiler;
    }

    public ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }
}
