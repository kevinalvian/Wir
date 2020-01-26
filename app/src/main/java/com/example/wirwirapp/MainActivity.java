package com.example.wirwirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Tambah = (Button)
                findViewById(R.id.btntmr);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MainActivity.this, Timer.class);
                startActivity(i);
            }
        });

        Button Tamba = (Button)
                findViewById(R.id.btnset);

        Tamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MainActivity.this, Setting.class);
                startActivity(i);
            }
        });
    }
}
