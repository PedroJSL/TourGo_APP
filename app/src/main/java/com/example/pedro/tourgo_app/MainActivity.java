package com.example.pedro.tourgo_app;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher_round);

        TextView tv = findViewById(R.id.tv);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/eurof55.ttf");
        tv.setTypeface(face);
    }
}
