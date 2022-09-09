import java.util.ArrayList;
import java.util.Scanner;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new ArrayList<String>();


    public void sarkicilari_bastir() {

        System.out.println("Sanatçılar Listesinde " + sarkici_listesi.size() + " tane müzisyen bulundu.");

        for (int i = 0; i < sarkici_listesi.size(); i++) {

            System.out.println((i + 1) + ". Müzisyen " + sarkici_listesi.get(i));
        }

    }

    public void sarkici_ekle(String isim){

        sarkici_listesi.add(isim);
        System.out.println("Müzisyen listesi güncellendi. ");
    }
    public void sarkici_guncelle(String yeniIsim,int pozisyon){

        sarkici_listesi.set(pozisyon, yeniIsim);
        System.out.println("Müzisyen Listesi Guncellendi");
    }
    public void sarkici_sil(int pozisyonSil){

        String isim = sarkici_listesi.get(pozisyonSil);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şarkıcıyı gerçekten silmek istiyor musunuz? E/H?");
        String a = scanner.nextLine();

        if(a.equals("E")){
            sarkici_listesi.remove(pozisyonSil);
            System.out.println(isim + " İsimli şarkıcı listeden silindi. ");
        }
    }

    public void sarkici_ara(String sarkici_ismi){

        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);

        if(pozisyon >= 0){

            System.out.println("Şarkıcı bulundu. ");
            System.out.println(sarkici_ismi + " isimli müzisyen " + (pozisyon+1) + ". Pozisyonda.");
        }else {

            System.out.println("Şarkıcı bulunamadı. ");
        }
    }


}
