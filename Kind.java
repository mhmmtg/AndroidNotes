package com.example.absinter;
//Abstract siniflar diger siniflara extend etmesi amaciyle olusturulur
//buyuk projelerde cok sayida sinif oldugunda metotlar ve propertyler-
// ayni isimlerle tekrarlanmak yerine bir soyut sinifta toplanabilir
//bu siniflarda override etmeden nesne olusturulamaz

public abstract class Kind {
    public String information(){
       return  "People and Animals Info";
    }

}
