package com.example.loveotudor.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.loveotudor.MainActivity;
import com.example.loveotudor.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Handler splashHandler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                launchApp();
            }
        };

        splashHandler.postDelayed(runnable, 3000);
    }

    private void launchApp() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        finish();
    }

}