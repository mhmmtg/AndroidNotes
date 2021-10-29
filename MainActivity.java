package com.example.absinter;

import static com.example.absinter.FirstNames.person1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kirk kirk = new Kirk("Kirk", "Captain");
        System.out.println(kirk.information()); //Kind class infoya ulasabiliyorum

        kirk.name = "Tiberius";
        System.out.println(kirk.name);
        kirk.info();


        //her yerden ulasilabilen static degisken
        System.out.println(person1);
    }


}