package com.example.tokozakaria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Barang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        /*Set ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Barang");

        /*floating action button*/
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Tambah_Barang.class);
            startActivity(intent);
        });

    }

    /*coba appbar*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.barang_appbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.minyak:
                Toast.makeText(this,"minyak pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.gula:
                Toast.makeText(this,"gula pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sagu:
                Toast.makeText(this,"sagu pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.beras:
                Toast.makeText(this,"beras pencet", Toast.LENGTH_SHORT).show();
                break;

            case R.id.terigu:
                Toast.makeText(this,"terigu pencet", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}