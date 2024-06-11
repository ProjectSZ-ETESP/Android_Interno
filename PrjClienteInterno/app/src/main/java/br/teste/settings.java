package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Switch;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);




        Switch switchTema = findViewById(R.id.switchTema);

        switchTema.setOnClickListener((v)->{
            if(switchTema.isChecked()){
                switchTema.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.buttonPurple)));
            }else{
                switchTema.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.buttonPurpleBlack)));
            }
        });

        findViewById(R.id.btnLogout).setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), MainActivity.class);
            startActivity(it);
            finish();
        });

        findViewById(R.id.imgBack).setOnClickListener((v)->{
            finish();
        });

        findViewById(R.id.llNotifications).setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), notifications.class);
            startActivity(it);
        });

    }
}