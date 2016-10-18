package com.example.shanesescott.segway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay) {
            Intent i = new Intent(MainActivity.this, rent.class);
            startActivity(i);
        }

    }
}