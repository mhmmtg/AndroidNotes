package com.mguler.mylogjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        //string dizisi tipinde mystring isimli 3 elemanli yeni bir obje olustur
        String[] myString = new String[2];
        myString[0] = "Ayse";
        myString[1] = "Fatma";

        //boyle de dizi degisken olusturulabilir
        int[] myInt = {25,35};

        System.out.println(myString[0]+" "+myInt[0]);

        //arraylist dizinin daha esnek halidir
        ArrayList<String> diziListe = new ArrayList<String>(); //newden sonraki string eskiden zorunluydu
        diziListe.add("At");
        diziListe.add("Esek");
        diziListe.add(0,"Kedi"); //indisi belirtmek de mumkun

        System.out.println(diziListe.get(0));
        System.out.println(diziListe.size()); //indis sayisi

        //hashset dizide her degerden bir tane olan dizilerdir tekrarlanan elemanlar tek sayilir
        HashSet<String> diziSet = new HashSet<>();
        diziSet.add("ali");
        diziSet.add("ali");
        System.out.println(diziSet.size());

        //hashmap diziye eleman eklerken key ve value belirtilir
        HashMap<String, Integer> diziMap = new HashMap<>(); //buraya kisaltma int degil sinif adini yazmak gerekli
        diziMap.put("yasi", 49);
        diziMap.put("boyu", 175);
        System.out.println(diziMap.get("yasi"));
        System.out.println(diziMap.get("boyu"));

    }
}
