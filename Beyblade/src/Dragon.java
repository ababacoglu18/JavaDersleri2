public class Dragon extends Beybladeci{


    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }


    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: "  + kutsalCanavar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
        System.out.println(getBeybladeci() +" Adlı Canavarın Saldırısı: Hayalet Kasırga" );

    }
}
