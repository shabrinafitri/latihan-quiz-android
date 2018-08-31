package com.cerdas_tangkas_sejarah.cts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Penjelasan_1 extends AppCompatActivity {
    Button share;
    TextView judul, isi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_1);
        getSupportActionBar().setTitle("Cerdas Tangkas Sejarah");
        getSupportActionBar().setSubtitle("Penjelasan");
        share = (Button) findViewById(R.id.share);
        judul = (TextView) findViewById(R.id.judul);
        isi = (TextView) findViewById(R.id.isi);

        share.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,judul.getText().toString() + "\n" + isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
