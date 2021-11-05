package com.mguler.mylogjava;

public class Loops {
    public static void main(String[] args){

        int[] myNumbers = {10,20,30,40,50};
        for (int i=0; i< myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }
        for (int numara : myNumbers) { //yukaridaki islemin dizilerle calisan kisayolu
            System.out.println(numara/5);
        }

        int c = 1;
        while (c<=10) {
            System.out.println("test" + c);
            c++;
        }
    }
}
