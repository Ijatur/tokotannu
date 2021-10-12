package com.example.tokozakaria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;




public class Tambah_Barang extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText nama,harga,stock,sold,supplier,email;
    Spinner kategori;
    DatabaseReference reference;

    Requests req = new Requests();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_barang);

        /*Set ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tambah Barang");

        /*Mencari Id di layout tambah barang*/
        nama =(EditText) findViewById(R.id.nama_barang);
        harga =(EditText) findViewById(R.id.harga_barang);
        stock =(EditText) findViewById(R.id.stok_barang);
        /*sold =(EditText) findViewById(R.id.sold_barang);*/
        supplier =(EditText) findViewById(R.id.supplier);
        email =(EditText) findViewById(R.id.email_address);
        kategori = (Spinner) findViewById(R.id.spinner_kategori);
        final Button submit = (Button) findViewById(R.id.submit);

        /*Set Spinner*/
        kategori.setOnItemSelectedListener(this);
        // Buat ArrayAdapter make string array sama default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this,R.array.kategori,R.layout.support_simple_spinner_dropdown_item);
        // Specify layout yang digunakan ketika list pilihan muncul
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply adapter ke spinner
        kategori.setAdapter(adapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNama = nama.getText().toString();
                String sHarga = harga.getText().toString();
                String sStock = stock.getText().toString();
                /*String sSold = sold.getText().toString();*/
                String sSupplier = supplier.getText().toString();
                String sEmail = email.getText().toString();
                String sKategori = kategori.getSelectedItem().toString();

                reference = FirebaseDatabase.getInstance(
                        "https://toko-zakaria-5ecd7-default-rtdb.asia-southeast1.firebasedatabase.app")
                        .getReference();

                getValue();

                if (sNama.equals("") || sHarga.equals("") || /*sStock.equals("") ||*/
                        sSupplier.equals("") || sEmail.equals("") || sKategori.equals("Pilih Kategori")) {
                    Toast.makeText(Tambah_Barang.this, "Data Tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                } else {
                    reference.child("RequestData3").push().setValue(req);
                    nama.setText("");
                    harga.setText("");
                    stock.setText("");
                    /*sold.setText("");*/
                    supplier.setText("");
                    email.setText("");
                    kategori.setSelection(adapter.getPosition("Pilih Kategori"));
                    Toast.makeText(Tambah_Barang.this, "Data Tersimpan", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    private void getValue()
    {
        req.setNama(nama.getText().toString());
        req.setHarga(harga.getText().toString().replaceFirst("^0+(?!$)", ""));
        req.setStock(stock.getText().toString().replaceFirst("^0+(?!$)", ""));
        /*req.setSold(sold.getText().toString());*/
        req.setSupplier(supplier.getText().toString());
        req.setEmail(email.getText().toString());
        req.setKategori(kategori.getSelectedItem().toString());
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        /*kalo spinner gabisa kita make textview invisible*/
        /*isiSpinner = kategori.getSelectedItem().toString();
        invkategori.setText(isiSpinner);*/

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}


