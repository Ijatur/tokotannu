package com.example.tokozakaria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;




public class Tambah_Barang extends AppCompatActivity {
    EditText nama,harga,stock,sold,supplier,email;
    DatabaseReference reference;

    Requests req = new Requests();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_barang);

        /*Set ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tambah Barang");

        nama =(EditText) findViewById(R.id.nama_barang);
        harga =(EditText) findViewById(R.id.harga_barang);
        stock =(EditText) findViewById(R.id.stok_barang);
        /*sold =(EditText) findViewById(R.id.sold_barang);*/
        supplier =(EditText) findViewById(R.id.supplier);
        email =(EditText) findViewById(R.id.email_address);
        final Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNama = nama.getText().toString();
                String sHarga = harga.getText().toString();
                String sStock = stock.getText().toString();
                /*String sSold = sold.getText().toString();*/
                String sSupplier = supplier.getText().toString();
                String sEmail = email.getText().toString();

                reference = FirebaseDatabase.getInstance().getReference().child("Request");

                getValue();

                if (sNama.equals("") || sHarga.equals("") || sStock.equals("") || sSupplier.equals("") || sEmail.equals("")) {
                    Toast.makeText(Tambah_Barang.this, "Data Tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                } else {
                    reference.child("RequestData").push().setValue(req);
                    nama.setText("");
                    harga.setText("");
                    stock.setText("");
                    sold.setText("");
                    supplier.setText("");
                    email.setText("");
                    Toast.makeText(Tambah_Barang.this, "Data Tersimpan", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    private void getValue()
    {
        req.setNama(nama.getText().toString());
        req.setHarga(harga.getText().toString());
        req.setStock(stock.getText().toString());
        req.setSold(sold.getText().toString());
        req.setSupplier(supplier.getText().toString());
        req.setEmail(email.getText().toString());
    }
}


