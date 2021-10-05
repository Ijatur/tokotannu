package com.example.tokozakaria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CardView barang,penjualan,keuntungan;
    public View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barang = findViewById(R.id.barang);
        penjualan = findViewById(R.id.penjualan);
        keuntungan = findViewById(R.id.keuntungan);


        /*Lebih baik pake switch case???*/
        barang.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Barang.class);
            startActivity(intent);
        });

        penjualan.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Penjualan.class);
            startActivity(intent);
        });

        keuntungan.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Keuntungan.class);
            startActivity(intent);
        });

    }

    /*coba appbar*/
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.barang_appbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.asd:
                Toast.makeText(this,"asd pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.dsa:
                Toast.makeText(this,"dsa pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sad:
                Toast.makeText(this,"sad pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sda:
                Toast.makeText(this,"sda pencet", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }*/
}