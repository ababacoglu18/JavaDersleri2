public class Draciel extends Beybladeci{


    private String kutsalCanavar;
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {



        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar Adı: "  + kutsalCanavar);
        System.out.println(getBeybladeci() +" Adlı Canavarın Saldırısı: Kale Savunması" );
    }
}
