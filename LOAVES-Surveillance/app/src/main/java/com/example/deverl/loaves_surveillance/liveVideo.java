package com.example.deverl.loaves_surveillance;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class liveVideo extends Fragment {

    String IPAddress = "10.68.5.132"; //144.39.222.67
    String myurl = "http://"+IPAddress+"/html/min.php";
    private WebView myWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_live_video, container, false);
        myWebView = (WebView) v.findViewById(R.id.myWebView);
        myWebView.loadUrl(myurl);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return v;
    }
}
