package com.altanb.package1;

public class Matematik implements IMatematik{






    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplam Sonuc: " + (a+b) );
    }

    @Override
    public void fark(int a, int b) {
        System.out.println("Fark Sonuc: " + (a-b) );
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Carpim Sonuc: " + (a*b) );
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bolum Sonuc: " + ((double)a/b) );
    }
}
