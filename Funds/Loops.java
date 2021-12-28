package com.mguler.mylogjava;

public class Loops {
    public static void main(String[] args){

        int[] myNumbers = {10,20,30,40,50};
        for (int i=0; i< myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }
        for (int number : myNumbers) { //short version of for for arrays
            System.out.println(number/5);
        }

        int c = 1;
        while (c<=10) {
            System.out.println("test" + c);
            c++;
        }
        
        int start=1;
        int stop=5;
        int sum = 0;
        
        for (int i=start; i<stop; i++) {
            sum = sum + i;
        }
        
    }
}
