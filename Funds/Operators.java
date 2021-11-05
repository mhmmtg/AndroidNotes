package com.mguler.mylogjava;

public class Operators {
    public static void main(String[] args){
        int x = 5;
        System.out.println(x);

        x = x+1;
        x++;
        x--;
        System.out.println(x);

        int y = 6;
        System.out.println(x<y); //true sonucu dondurur
        System.out.println(x<=y);
        System.out.println(x==y); //x=y xi yeye esitle demek olurmus
        System.out.println(x!=y);

        int z = 4;
        //and && or ||
        System.out.println(x<y && z>x);
        System.out.println(x<y || z>x);

    }
}
