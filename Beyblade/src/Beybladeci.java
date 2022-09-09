public class Beybladeci {

    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;


    public void saldir(){

        System.out.println(getBeybladeci() + " " + saldiriGucu + " ve " + donusHizi + " ile saldiriyor." );
    }
    public void kutsalCanavarOrtayaCikar(){

        System.out.println("Bu beyblade'in kutsal canavarı yok.");
    }
    public void bilgileriGoster(){

        System.out.println("Beybladeci ismi: " + beybladeci);
        System.out.println("Saldiri Gucu: " + saldiriGucu);
        System.out.println("Donus hizi: " + donusHizi);
    }






    //***********************************************************************************************
    public Beybladeci(String beybladeci, int donusHizi, int saldiriGucu) {
        this.setBeybladeci(beybladeci);
        this.setDonusHizi(donusHizi);
        this.setSaldiriGucu(saldiriGucu);
    }


    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
}
