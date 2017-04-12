package com.example.christopher.openbrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickster(View v){
        Uri uriUrl = Uri.parse("http://drive.google.com/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToOtherPage(View v){
        String btnText;
        btnText = ((Button) v) .getText().toString();
        if(btnText.equals("Other Activity")){
            Intent intent = new Intent(this, OtherActivity.class);
            startActivity(intent);
            //finish();
        }
    }
}
