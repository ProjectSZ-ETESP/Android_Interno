package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CalendarioConsulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendaria_consulta);

        findViewById(R.id.imgX).setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), Principal.class);
            startActivity(it);

        });
    }
}