package com.example.android.hooniganquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class CoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public void startButtonCover(View view){
        Intent intent = new Intent(CoverActivity.this, MainActivity.class);
        startActivity(intent);
    }
}