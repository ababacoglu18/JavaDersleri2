import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   try(FileWriter writer = new FileWriter("dosya.txt") ; //Daha fazla dosya için ; operatoru kullan.
            FileWriter writer1 = new FileWriter("dosya2.txt")){  //Closable Interface'in altında olmalı FileWriter Bunlardan bir tanesidir @Closable @Flushable

            writer.write(" TRY WITH RESOURCES TRY ");
        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu.");
        }*/

        //********************************************


        Scanner scanner = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("languages.txt",true)){ //Appended with write before.

            int i = 1;                                             //Project: Create a HashSet and append print with it
            while(true) {                                             //And Check each other whether it's same or not.
                System.out.println("Enter your Languages. ");
                String userLanguage = scanner.nextLine();


                if (!userLanguage.equals("q")) {
                    writer.write(i +". "+userLanguage + "\n");
                    i++;
                }
                else {
                    break;
                }


            }

        } catch (IOException e) {
            System.out.println("Cannot Read the File Exception Error No: 522/800");
        }


    }
}