package com.softcod.pesquisacorona;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class JavaConection {
    Context mContext;
    JavaConection(Context c){mContext = c;}

    @JavascriptInterface
    public void troca(String pergunta, String resposta){

    }

    public void getReferencia(){

    }

}
