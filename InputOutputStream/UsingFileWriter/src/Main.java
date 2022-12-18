import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        FileWriter writer = null;


        try {
            writer = new FileWriter("dosya.txt",true);
            writer.write("AltanBBB\n");
            writer.write("MehmetGenc\n");



        } catch (IOException e) {
            System.out.println("Dosya Açılırken Hata Oluştu.");;
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya Kapatılırken Hata Olustu.");
                }
            }
        }
    }
}