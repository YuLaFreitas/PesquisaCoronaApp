package com.softcod.pesquisacorona;

import android.content.Context;
import android.webkit.WebView;


public class ConeccaoWeb extends WebView {

        WebView webView;

    public ConeccaoWeb(Context context) {
        super(context);
        webView = new WebView(context);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setBlockNetworkLoads(true);
        webView.getSettings().setDefaultFontSize(40);
    }

    @Override
    public void loadUrl(String url) {
        super.loadUrl(url);
    }


}
