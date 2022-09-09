public class Drayga extends Beybladeci{


    private String KutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();

        System.out.println(getBeybladeci() + " " + KutsalCanavar + " Adlı canavarı ortaya çıkarıyor");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: "  + KutsalCanavar);
        System.out.println(getBeybladeci() +" Adlı Canavarın Saldırısı: Kaplan Pençesi" );
    }
}
