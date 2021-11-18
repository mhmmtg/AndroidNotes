package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText1);
    }
    public void btnChange(View view){
        //intent context ve class istiyor
        //farkli aktiviteye veriyi intent ile yolluyoruz
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        name = editText.getText().toString();
        intent.putExtra("personName", name); //gonderirken put ile degisken ekleyebiliyoruz
        startActivity(intent);
        finish();
        
        //startActivity(new Intent(this, FlashCard.class));
    }
}
