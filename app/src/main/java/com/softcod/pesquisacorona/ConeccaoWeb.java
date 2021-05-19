package com.softcod.pesquisacorona;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;


public class ConeccaoWeb extends WebView {
    WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    public ConeccaoWeb(Context context) {
        super(context);


    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void loadUrl(String url) {
        super.loadUrl(url);
        webView = findViewById(R.id.web);
        //webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        //webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setBlockNetworkLoads(false);
        webView.getSettings().getBlockNetworkLoads();
        webView.getSettings().setDomStorageEnabled(true);

        //webView.setTouchscreenBlocksFocus(true);
        //webView.getTouchscreenBlocksFocus();

        //webView.getKeepScreenOn();
        //webView.setKeepScreenOn(true);

        //webView.getSettings().setDefaultFontSize(40);
        //webView.setContextClickable(true);
        //webView.getSettings().setSupportZoom(true);
        //webView.showContextMenu();
        /*
         *webView.getSettings().getTextZoom();
         *webView.getSettings().setTextZoom(webView.getSettings().getTextZoom());
         *webView.getSettings().setBuiltInZoomControls(true);
         */

        /*try {
            webView.saveWebArchive(String.valueOf(File.createTempFile("teste", ".html")));
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }



}
