package com.cerdas_tangkas_sejarah.cts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pertanyaan_5 extends AppCompatActivity {
    AlertDialog.Builder builder;
    RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_5);
        getSupportActionBar().setTitle("Cerdas Tangkas Sejarah");
        getSupportActionBar().setSubtitle("Pertanyaan 5");
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
    }
    public void onRadioButton(View view) {
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    tampilDialog();
                break;
            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }
    public void tampilDialog() {
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat!!");
        builder.setMessage("Jawaban kamu benar!");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();
    }
    public void jawabanSalah() {
        Toast.makeText(this, "Jawaban kamu salah!", Toast.LENGTH_SHORT).show();
    }
    public void selanjutnya(View view){
        Intent i = new Intent(Pertanyaan_5.this, closepage.class);
        startActivity(i);
    }
    public void penjelasan(View view){
        Intent i = new Intent(Pertanyaan_5.this, Penjelasan_5.class);
        startActivity(i);
    }
}
