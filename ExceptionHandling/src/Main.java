import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void MekanKontrol(int yas) throws IOException { //Runtime Exceptionlar throws ile yazilmak zorunda.


        if(yas<18){
            throw new IOException();
        }else {
            System.out.println("Mekana Hos Geldiniz. ");
        }

    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizizi giriniz. ");
        int yas = scanner.nextInt();

        try {
            MekanKontrol(yas);


        }catch (ArithmeticException a){
            System.out.println("Yasiniz 18 den kucuk.");
        } catch (IOException e) {
            System.out.println("Malesef");;
        } finally {
            System.out.println("Seneye tekrar dene evlat. ");
        }




        try {

          int a=  120/0;
        }catch (ArithmeticException e){

            System.out.println("Bir sayi 0 ile bolunemez");
        }finally {
            System.out.println("Finally is working... :@"); //Her durumda finally calisir. Exception olmasi gerekmiyor. 
        }


        try {
            int[] b = {1,2,3,4,5};
            System.out.println(b[9]);
        }
        catch (ArrayIndexOutOfBoundsException s){
            System.out.println("Array'in disinda bir deger istendi.");
        }


        System.out.println("Burasi calisiyor"); //Exception Atlandi.



    }
}