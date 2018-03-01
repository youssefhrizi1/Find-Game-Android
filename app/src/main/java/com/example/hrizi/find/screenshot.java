package com.example.hrizi.find;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class screenshot extends AppCompatActivity {
private  static int SPLASH_TIME_OUT =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenshot);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent= new Intent(screenshot.this,Home.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
