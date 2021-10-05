package com.example.tokozakaria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Penjualan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjualan);

        /*Set ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Kasir");

    }
}