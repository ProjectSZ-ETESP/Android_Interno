package br.teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout clLayout;
    LinearLayout llItens;
    TextView lblSafeZone;
    EditText txtSenha;
    TextView lblLogin, lblSenha;
    Button btnEntrar;
    ImageView imgSenha;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llItens = findViewById(R.id.llItens);
        clLayout = findViewById(R.id.clLayout);
        lblSafeZone = findViewById(R.id.lblSafeZone);
        lblLogin = findViewById(R.id.lblLogin);
        txtSenha = findViewById(R.id.txtSenha);
        imgSenha = findViewById(R.id.imgSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        lblSenha = findViewById(R.id.lblSenha);

        findViewById(R.id.lblSenha).setOnClickListener((v)-> {

           Uri link = Uri.parse("https://www.google.com/");
           Intent it = new Intent(Intent.ACTION_VIEW, link);
           // startActivity(it);
        });

        btnEntrar.setOnClickListener((v)->{
            Intent it = new Intent(getBaseContext(), Principal.class);
            startActivity(it);




        });

        imgSenha.setOnClickListener((v)->{

//Toast.makeText(getBaseContext(),imgSenha.getBackground()+"",Toast.LENGTH_SHORT/2).show();
            if((txtSenha.getInputType()==129)){
                txtSenha.setInputType(10);
                imgSenha.setImageResource(R.drawable.eyeopen);

            }else{
                txtSenha.setInputType(129);
                imgSenha.setImageResource(R.drawable.eyeclosed);
            }




        });



        llItens.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float xAtual = 0, yAtual = 0;

                switch(event.getActionMasked()){
                    case MotionEvent.ACTION_DOWN:
                        yAtual = event.getY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        float yMove = event.getY();
                        float ydesl =  yMove - yAtual;





                        if(Math.round(llItens.getY()+ydesl)>clLayout.getHeight()-300){
                            llItens.setY(clLayout.getHeight()-300);
                        }else if(Math.round(llItens.getY()+ydesl+llItens.getHeight()) < clLayout.getHeight()){
                            llItens.setY(clLayout.getHeight()-llItens.getHeight());
                        }else{
                            llItens.setY(llItens.getY()+ydesl);

                        }



                        double padd;

                        padd = Float.parseFloat(Math.floor(llItens.getY()-(clLayout.getHeight()-llItens.getHeight()))/(llItens.getHeight()-300)+"");
                        padd = padd* (float)(lblLogin.getWidth()*(0.27))+lblLogin.getWidth()*0.08;

                        lblLogin.setPadding((int)padd,0,0,0);
                        break;

                }


              //  Toast.makeText(getBaseContext(),"A", Toast.LENGTH_SHORT).show();
                return true;

            }
        });


    }
}