package com.cerdas_tangkas_sejarah.cts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new android.os.Handler().postDelayed(new Runnable() {
                                                 @Override
                                                 public void run() {
                                                     Intent i = new Intent(splash_screen.this, MainActivity.class);
                                                     startActivity(i);
                                                     finish();
                                                 }
                                             }
                ,3000);
    }
}
