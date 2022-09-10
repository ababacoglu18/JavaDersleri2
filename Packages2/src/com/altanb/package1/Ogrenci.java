package com.altanb.package1;

import com.altanb.package2.IAdayOgrenci;

public class Ogrenci implements IAdayOgrenci {

    @Override
    public void ders_calis() {
        System.out.println("Ders calisiyorum.");
    }


}

