package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        findViewById(R.id.imgBack).setOnClickListener((v)->{
            finish();
        });

    }
}