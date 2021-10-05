package com.example.tokozakaria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Keuntungan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keuntungan);

        /*Set ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Keuntungan");

    }
}