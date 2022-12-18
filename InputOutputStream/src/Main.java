import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fl1 = null;
        File file = new File("dosya.txt");


        try {
            fl1 = new FileOutputStream(file,true); //True üzerine appendle yazmaya devam et.
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı");

            try {

                String s = "Altan B";

                byte[] s_byte = s.getBytes();

                fl1.write(65);
                fl1.write(65);
                fl1.write(65);
                fl1.write(65);
                fl1.write(65);
                fl1.write(65);
                fl1.write(s_byte);

            } catch (IOException ex) {
                System.out.println("dosyaya yazilmadi.");
            }

            throw new RuntimeException(e);
        }

        finally {

            try {
                fl1.close();
            } catch (IOException e) {
                System.out.println("Dosya Kapatılırken Hata oluştu.");;
            }
        }
    }
}