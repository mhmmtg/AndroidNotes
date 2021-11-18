package com.mguler.storedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entText1;
    TextView resultText1;
    SharedPreferences sharedPreferences;
    int storedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entText1 = findViewById(R.id.editText1);
        resultText1 = findViewById(R.id.resText1);

        //sp stores simple datas
        //private means this app only
       sharedPreferences = this.getSharedPreferences("com.mguler.storedata", Context.MODE_PRIVATE);
       storedNumber = sharedPreferences.getInt("storedNumber", 0);

       if (storedNumber==0){
           resultText1.setText("First Use");
       }
       else {
           resultText1.setText("Stored Number:" + storedNumber);
       }
    }

    public void getNumber(View view){
        String gettedText = entText1.getText().toString();
        if (gettedText.matches("")) {
            resultText1.setText("No Number Entered");
        } else {
            int gettedNumber = Integer.parseInt(gettedText);
            resultText1.setText("Entered Number:" + gettedNumber);
            sharedPreferences.edit().putInt("storedNumber", gettedNumber).apply();
        }
    }
    public void reset(View view){
        if (storedNumber != 0){
            sharedPreferences.edit().remove("storedNumber").apply();
            resultText1.setText("Resetted");
        }
    }
}
