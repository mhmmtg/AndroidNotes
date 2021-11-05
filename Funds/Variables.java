package com.mguler.mylogjava;

//degiskenler
public class Variables {
    public static void main(String[] args){
        int age1 = 20;
        int age2 = 25;
        double boy1 = 1.73;
        double boy2 = 1.83;
        long boy3 = 191; //long int in 64 bit olani daha buyuk tamsayilar icin
        long boy4 = 165;
        float age3 = 45.8f; //float doublenin 64 bit olani Float contains only decimal numbers
        float age4 = 55;
        age4 = 56; //tipi ayni kalmak sartiyla degiskene yeni deger atanabilir

        System.out.println(age2/age1); // int tamsayi demektir sonuc tamsayi cikar
        System.out.println(boy2*boy1);
        System.out.println(boy3*boy4);
        System.out.println(age3/age4);

        double pi = 3.14;
        int yaricap = 4;
        System.out.println(2*pi*yaricap);

        String adi = "Ali";
        String soyadi = "Veli";
        System.out.println(adi + " " + soyadi);

        //boolean sadece dogru veya yanlis degerini alir
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        final int degisken = 6;
        //final degiskeni sabit hale getirir ve yeni deger atanamaz


    }
}
