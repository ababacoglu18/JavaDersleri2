import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {

    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){

            ogrenci ogrenci1 = (ogrenci) in.readObject();
            ogrenci ogrenci2 = (ogrenci) in.readObject();


            System.out.println("**********************");

            System.out.println(ogrenci1);
            System.out.println("**********************");
            System.out.println(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya Acilamadi.");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassBulunamadi");
        }
    }
}
