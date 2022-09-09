
    class Hayvan{
    //*******************************************************************************************
        public Hayvan(String isim) {
            this.isim = isim;
        }

        private String isim;


        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public String konus(){
            return "Hayvan konuşuyor. ";
        }
    }

    //*********************************************************************************
    class kedi extends Hayvan{

        public kedi(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " miyavlıyor";
        }
    }

    class kopke extends Hayvan{
    public  kopke(String isim){
        super(isim);}

        @Override
        public String konus() {
            return this.getIsim() + " Havlıyor.";
        }
    }
    class At extends Hayvan{


        @Override
        public String konus() {
            return this.getIsim() + " Kişniyor.";
        }

        public At(String isim) {
            super(isim);

        }
    }


public class Main {
    public static void main(String[] args){


        Hayvan hayvan1 = new kedi( "Limon");
        System.out.println(hayvan1.konus());





    }
}
