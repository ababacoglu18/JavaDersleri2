public class KapsamSinifi {


    private int privateDegisken = 30;

    public KapsamSinifi() {
        this.privateDegisken = privateDegisken;
        System.out.println("Private degisken = " + privateDegisken);
    }


    public void onileCarp(){
        int privateDegisken = 10;

        for(int i = 1 ; i < 5; i++){
 
            System.out.println(i + "*" + this.privateDegisken + " = " + (i*this.privateDegisken));
        }
        //Kapsam sinifi en lokal olan degiskeni 10 u kullanacak.
    }
}
