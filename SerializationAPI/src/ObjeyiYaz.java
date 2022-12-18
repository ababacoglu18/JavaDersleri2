import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

    public static void main(String[] args) {

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {

            ogrenci ogrenci1 = new ogrenci("Ahmet", 1234,"Makine Mühendisliği");
            ogrenci ogrenci2 = new ogrenci("Mehmet",4321, "Bilgisayar Mühendisliği");


            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya Acilamadi.");
        }

    }
}
