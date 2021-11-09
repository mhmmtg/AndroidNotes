package com.mguler.catchthefish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.mguler.catchthefish.databinding.ActivityGameBinding;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private ActivityGameBinding binding;
    Handler handler;
    Runnable runnable;
    Random random;
    ImageView[] points;
    int textScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        points = new ImageView[] {binding.imageView1, binding.imageView2, binding.imageView3, binding.imageView4, binding.imageView5, binding.imageView6, binding.imageView7, binding.imageView8, binding.imageView9};

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.textTime.setText("Time Left: " + String.valueOf(millisUntilFinished/1000));
            }
            @Override
            public void onFinish() {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("score", String.valueOf(textScore));
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                handler.removeCallbacks(runnable);
                startActivity(intent);
            }
        }.start();

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                for (ImageView points : points) { points.setVisibility(View.INVISIBLE); }
                random = new Random();
                int randNumber = random.nextInt(9);
                handler.postDelayed(this, 1000);
                points[randNumber].setVisibility(View.VISIBLE);
            }
        };
        handler.post(runnable);
    }


    public void imgClick(View view) {
        textScore++;
        binding.textScore.setText("Score: " + textScore);
    }
}