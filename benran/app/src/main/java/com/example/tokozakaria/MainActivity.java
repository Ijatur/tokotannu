package com.example.tokozakaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public CardView barang,penjualan,keuntungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barang = findViewById(R.id.barang);
        penjualan = findViewById(R.id.penjualan);
        keuntungan = findViewById(R.id.keuntungan);

    }

}