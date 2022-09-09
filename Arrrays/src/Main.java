import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static int[] arrayi_doldur(int sayi){

        System.out.println("E o zmn sayılarını gir.");
        Scanner scanner = new Scanner(System.in);

        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi ; i++){

            cikti[i] = scanner.nextInt();
        }
            return  cikti;

    }

    public static void arrayi_bastir(int[] array){

        for(int i = 0 ;  i< array.length; i++){

            System.out.println("Element: "  + (i+1) + ":" + array[i]);
        }
    }

    public static void array_sort(int[] array){

        //arrays sınıfı

        Arrays.sort(array);
        arrayi_bastir(array);
    }


    //-------------------------------------------------------------------------------------
    public static void main(String[] args){



        Scanner scanner = new Scanner(System.in);



       /* System.out.println("**************************sorttan sonra");
         System.out.println("Sa kardo arrayin kaç elementli olsun?");
        int b = scanner.nextInt();
        int[] a =  arrayi_doldur(b);
        arrayi_bastir(a);

         array_sort(a);
         */

        int [] [] array3 = new int[2][2];

        for (int i = 0; i<2 ;i++){

            for (int j =0 ; j<2; j++){

                array3[i][j] = scanner.nextInt();
            }
        }
        System.out.println("******************************");

        for (int i = 0; i<2 ;i++){

            for (int j =0 ; j<2; j++){
                System.out.println(array3[i][j] + " ");


            }
            System.out.println("");
        }

    }
}
