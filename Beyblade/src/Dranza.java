public class Dranza extends Beybladeci{



    private String kutsalCanavar;

    @Override
    public void kutsalCanavarOrtayaCikar() {


        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar Adı: "  + kutsalCanavar);
        System.out.println(getBeybladeci() +" Adlı Canavarın Saldırısı: Alev Kılıcı" );
    }

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
}
