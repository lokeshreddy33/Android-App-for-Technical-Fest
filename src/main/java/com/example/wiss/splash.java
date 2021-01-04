package com.example.wiss;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private static int time=3500;
    Animation rotateanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        findViewById(R.id.img).animate()
                .setStartDelay(2500)
                .setDuration(1000)
                .scaleX(20)
                .scaleY(20)
                .alpha(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent=new Intent(splash.this,MainActivity.class);
                startActivity(homeintent);
                finish();

            }
        },time);

    }


}
