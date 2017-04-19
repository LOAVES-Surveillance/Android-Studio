package com.example.christopher.openbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by christopher on 4/11/17.
 */

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void goHome(View v){
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        finish();
    }
}
