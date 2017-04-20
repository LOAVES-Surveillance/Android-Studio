package com.example.deverl.loaves_surveillance;

import android.util.Log;
import android.webkit.WebSettings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Method;


public class RecordedVideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recorded_video_activity);

        String videoURL = getIntent().getStringExtra("Video_URL");

        WebView webView = (WebView) findViewById(R.id.recorded_videos);
        webView.setWebViewClient(new WebViewClient());


        try {
            Method m = WebSettings.class.getMethod("setMixedContentMode", int.class);
            if (m == null) {
                Log.e("WebSettings", "Error getting setMixedContentMode method");
            } else {
                m.invoke(webView.getSettings(), 2); // 2 = MIXED_CONTENT_COMPATIBILITY_MODE
                Log.i("WebSettings", "Successfully set MIXED_CONTENT_COMPATIBILITY_MODE");
            }
        } catch (Exception ex) {
            Log.e("WebSettings", "Error calling setMixedContentMode: " + ex.getMessage(), ex);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        webView.loadUrl(videoURL);
    }

    protected void onStop() {
        Log.w("RecordedVideoView", "here");
        super.onStop();
        finish();
    }
}