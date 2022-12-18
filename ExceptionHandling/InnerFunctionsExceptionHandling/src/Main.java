public class Main {


    public static void UcuncuFonksiyon(){
        int a;

              System.out.println(a=12/0);

    }
    public static void IkinciFonksiyon(){
       try{ UcuncuFonksiyon();}
       catch (ArithmeticException e){

               System.out.println("Bir sayi 0'a bolunemez.");  //Stack içinde herhangi bir yerde Exception yakalanmak zorundadır. 

       }
    }
    public static void BirinciFonksiyon(){
        IkinciFonksiyon();
    }

    //**************************************************************************\\
    public static void main(String[] args) {
        BirinciFonksiyon();

    }
}