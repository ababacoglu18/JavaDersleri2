import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
        private static Sarkicilar sarkicilar = new Sarkicilar();


        public static void islemleri_bastir(){

            System.out.println("\t 0-Islemleri Goruntule");
            System.out.println("\t 1-Sanatçıları Goruntule");
            System.out.println("\t 2-Şarkıcı Ekle");
            System.out.println("\t 3-Şarkıcı Güncelle");
            System.out.println("\t 4-Şarkıcı Sil");
            System.out.println("\t 5-Şarkıcı Ara");
            System.out.println("\t 6-Uygulamadan Çık");
        }
        public static void goruntule(){
            sarkicilar.sarkicilari_bastir();
        }
        public static void sarkici_ekle(){
            System.out.println("Eklemek istediğiniz şarkıcının ismi?");
            String isim = scanner.nextLine();
            sarkicilar.sarkici_ekle(isim);
        }
        public static void sarkici_guncelle(){

            System.out.println("Hangi pozisyondaki şarkıcı güncellenecek?(1,2,3)");
            int pozisyon = scanner.nextInt();
            scanner.nextLine();

            String yeni_isim = scanner.nextLine();
            sarkicilar.sarkici_guncelle(yeni_isim,(pozisyon-1));
        }
        public static void sil(){
            System.out.println("Silmek istediğiniz poziyon (1,2,3)");
            int pozisyon = scanner.nextInt();
            sarkicilar.sarkici_sil((pozisyon-1));
        }
        public static void ara(){
            System.out.println("Hangi Şarkıcıyı Aramak İstiyorsunuz?");
            String isim = scanner.nextLine();

            sarkicilar.sarkici_ara(isim);
        }


    public static void main(String[] args){
        System.out.println("\t Müzisyen Listesine Hoş geldiniz. \n");

        islemleri_bastir();
            boolean cikis = false;
            int islem ;


            while (!cikis){

                System.out.println("Bir işlem Seçiniz. \n");
                islem = scanner.nextInt();
                scanner.nextLine();

                switch (islem){
                    case 0:
                        islemleri_bastir();
                        break;
                    case 1:
                        goruntule();
                        break;
                    case 2:
                        sarkici_ekle();
                        break;
                    case 3:
                        sarkici_guncelle();
                        break;
                    case 4:
                        sil();
                        break;
                    case 5:
                        ara();
                        break;
                    case 6:
                        cikis = true;
                        System.out.println("Uygulamadan Çıkılıyor. ");
                        break;
                }
            }


    }
}
