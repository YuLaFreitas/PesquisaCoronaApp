package com.softcod.pesquisacorona;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton pergunta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inserirRodape();
        }

    public void inserirPaginaCorpo(String url){
        CardView web = findViewById(R.id.corpo);

        ConeccaoWeb cw = new ConeccaoWeb(this);

        cw.loadUrl(url);
        web.addView(cw);
    }

    public void inserirRodape(){
        CardView rodape = findViewById(R.id.rodape);
        pergunta = new FloatingActionButton(this);

        pergunta.setImageResource(android.R.drawable.btn_dialog);
        pergunta.setTranslationX(900);
        pergunta.setPadding(10,10,10,10);
        pergunta.setLayoutDirection(Gravity.CENTER);
        pergunta.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        pergunta.setRippleColor(Color.RED);
        pergunta.setRight(100);pergunta.setLeft(100);


        pergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inserirPaginaCorpo("http://softcod.host/corona");
            }
        });

        rodape.addView(pergunta);
    }

}