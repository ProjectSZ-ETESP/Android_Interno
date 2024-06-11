package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



        findViewById(R.id.btnAgendar).setOnClickListener((v)->{
            //out of work
            //          Intent it = new Intent(getBaseContext(), CalendarioConsulta.class);
//            startActivity(it);
        });

        findViewById(R.id.btnSettings).setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), settings.class);
            startActivity(it);
        });
        findViewById(R.id.btnNotification).setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), notifications.class);
            startActivity(it);
        });


        findViewById(R.id.imgForum).setOnClickListener((v)->{
            Toast.makeText(getBaseContext(), "Abrir Forum", Toast.LENGTH_SHORT).show();
        });


    }
}