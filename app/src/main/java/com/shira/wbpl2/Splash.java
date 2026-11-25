package com.shira.wbpl2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private ImageView myImageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        myImageview2 = findViewById(R.id.imageView2);

        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.tween);

        myImageview2.startAnimation(animation);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            Intent intent = new Intent(Splash.this, MainActivity.class);
            startActivity(intent);
            finish();

        }, 4000);
    }
}