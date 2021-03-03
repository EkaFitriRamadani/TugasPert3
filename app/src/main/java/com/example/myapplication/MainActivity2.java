package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void backToBeranda(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);
    }

    public void goToBiodata(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(a);
    }
}