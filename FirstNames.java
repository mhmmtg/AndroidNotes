package com.example.absinter;
//siniflar sadece bir siniftan extend edilebilirken
//birden fazla implement kullanilabilir

//interface %100 absctract


public interface FirstNames {
    //Olusturulan degiskenler final (degistirilemez) ve static olur.
    //Static degiskenler italik gorunur ve her yerden ulasilabilir
    //Properties must be initialized, bos olamaz
    String person1 = "James";
    String person2 = "Leonard";

    //interface inindeki metotlar body iceremez
    // override ettirilir
    //Instance olusturulamaz
    public void info();

}
