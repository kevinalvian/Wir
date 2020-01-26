package com.example.wirwirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Button Tambah = (Button)
                findViewById(R.id.btnon);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, Timer2.class);
                startActivity(i);
            }
        });

        Button Tamba = (Button)
                findViewById(R.id.btnsetting);

        Tamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, Setting.class);
                startActivity(i);
            }
        });

        Button Tamb = (Button)
                findViewById(R.id.btngame);

        Tamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}
