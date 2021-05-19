package com.softcod.pesquisacorona;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton pergunta;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pergunta = findViewById(R.id.btnFl);

        pergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarUrl("http://softcod.host/corona");
            }
        });
        }

    public void inserirPaginaCorpo(String url){
        //CardView cardCorpo = findViewById(R.id.corpo);
        //ConeccaoWeb cw = new ConeccaoWeb(this);
        //cw.loadUrl(url);
        //cardCorpo.addView(cw);
    }

    public void inserirRodape() {


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        webView.clearCache(true);

    }

    @SuppressLint("SetJavaScriptEnabled")
    public void carregarUrl(String url) {

     webView = findViewById(R.id.web);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setBlockNetworkLoads(false);
        webView.getSettings().getBlockNetworkLoads();
        webView.getSettings().setDomStorageEnabled(true);

        webView.setTouchscreenBlocksFocus(true);
        webView.getTouchscreenBlocksFocus();

        webView.setKeepScreenOn(true);
         /*
        webView.getKeepScreenOn();

        webView.getSettings().setDefaultFontSize(40);
        webView.setContextClickable(true);
        webView.getSettings().setSupportZoom(true);
        webView.showContextMenu();

        webView.getSettings().getTextZoom();
        webView.getSettings().setTextZoom(webView.getSettings().getTextZoom());
        webView.getSettings().setBuiltInZoomControls(true);
         */
        webView.loadUrl(url);

        try {
            webView.saveWebArchive(String.valueOf(File.createTempFile("perguntas", ".html")));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}