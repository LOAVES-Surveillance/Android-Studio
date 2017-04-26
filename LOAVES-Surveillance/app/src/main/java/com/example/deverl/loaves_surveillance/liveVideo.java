package com.example.deverl.loaves_surveillance;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.Button;

public class liveVideo extends Fragment implements View.OnClickListener {

    String IPAddress = "144.39.222.13"; //10.68.5.132
    String myurl = "http:"+IPAddress+"/html/min.php";
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

    @Override
    public void onClick(View v) {
        settings fragment = new settings();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);  // if written, this transaction will be added to backstack
        fragmentTransaction.commit();
    }
}
