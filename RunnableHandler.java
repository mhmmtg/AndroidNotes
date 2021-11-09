import android.os.CountDownTimer;
import android.os.Handler;

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
