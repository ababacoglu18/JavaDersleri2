public class Printer extends  Thread{

    @Override
    public void run() {


        System.out.println(isim + " Calisiyor.");

        for (int i = 1 ; i <11 ; i++){
            System.out.println( isim  + " Yaziyor " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread isini bitiremedi");
            }
        }
        System.out.println(isim + " isini bitirdi");
    }

    public Printer(String isim) {
        this.isim = isim;
    }

    private   String isim;
}

