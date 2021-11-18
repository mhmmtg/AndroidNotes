package com.example.flashcards.views;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.DialogInterface;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import android.widget.ImageView;
import android.widget.Toast;

import com.example.flashcards.adapter.SetsAdapter;
import com.example.flashcards.databinding.ActivitySetsBinding;

import com.example.flashcards.model.SetsModel;

import java.util.ArrayList;
import java.util.List;


public class SetsActivity extends AppCompatActivity {
    private ActivitySetsBinding binding;
    SQLiteDatabase db;
    ArrayList<SetsModel> setsArraylist;
    SetsAdapter setsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setsArraylist = new ArrayList<>();

        db = this.openOrCreateDatabase("Flashcards", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS sets (id INTEGER PRIMARY KEY, name VARCHAR)");

        Cursor cursor = db.rawQuery("SELECT * FROM sets", null);
        int idIx = cursor.getColumnIndex("id");
        int nameIx = cursor.getColumnIndex("name");

        while (cursor.moveToNext()){
            String name = cursor.getString(nameIx);
            int id = cursor.getInt(idIx);
            SetsModel sets = new SetsModel(id, name);
            setsArraylist.add(sets);
        }
        cursor.close();

        binding.recylerViewSets.setLayoutManager(new GridLayoutManager(SetsActivity.this, 2));
        setsAdapter = new SetsAdapter(setsArraylist);
        binding.recylerViewSets.setAdapter(setsAdapter);

    }

    public void btnNewSet(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Add New Set");
        EditText input = new EditText(SetsActivity.this);
        alert.setView(input);
        input.setHint("Enter Set Name");
        input.setEms(10);

        alert.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(SetsActivity.this, "Message Saved", Toast.LENGTH_LONG).show();
                SQLiteStatement sqLiteStatement = db.compileStatement("INSERT INTO sets(name) VALUES (?)");
                sqLiteStatement.bindString(1, input.getText().toString());
                sqLiteStatement.execute();
                startActivity(new Intent(getIntent().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)));
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Set NOT Added!", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}
