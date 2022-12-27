public class Main {

    private static int count = 0;


public synchronized void artir (){
    count++;

}
    public void ThreadCalistir(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i <5000 ; i++){
                    artir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i <5000 ; i++){
                   artir();

                }
            }
        });


        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static void main(String[] args) {

        Main threadSafe = new Main();
        threadSafe.ThreadCalistir();
        System.out.println("Count degiskeninin degeri: " + count);



    }
}