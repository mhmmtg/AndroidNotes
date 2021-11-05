package com.mguler.mylogjava;

public class Statements {
    public static void main(String[] args){
        int x = 3;
        int y = 4;

        if (x<y){
            System.out.println("y is bigger");
        } else if (x>y){
            System.out.println("x is bigger");
        } else {
            System.out.println("anything else");
        }

        int day = 1;
        String dayString = "";

        switch (day){
            case 1: dayString = "Pts";
                break;
            case 2: dayString = "Sal";
                break;
            default: dayString = "Paz";
        }
        System.out.println(dayString);

    }
}
