package com.softcod.pesquisacorona;

import android.os.Bundle;
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

        pergunta = findViewById(R.id.btnFl);

        pergunta.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                inserirPaginaCorpo("http://softcod.host/corona");
           }
        });
    }

}