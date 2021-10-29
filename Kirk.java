package com.example.absinter;

public class Kirk extends Kind implements FirstNames, LastNames{
    String name;
    String label;

    public Kirk(String name, String label) {
        this.name = name;
        this.label = label;
    }

    //Interfaceler implement edildikten sonra icindeki metotlar override edilmelidir
    @Override
    public void info() {
        System.out.println("FirstNames Interface Info");
    }
}
