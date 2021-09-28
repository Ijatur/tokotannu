package com.example.tokozakaria;

public class Requests {
    public String ID;
    public String nama;
    public String harga;
    public String stock;
    public String sold;
    public String supplier;
    public String email;


    public Requests(){}
    public Requests(String nama, String harga, String stock, String supplier, String email){
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
        this.supplier = supplier;
        this.email = email;

    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString()
    {
        return ""+nama+"\n"+
                ""+harga+"\n"+
                ""+stock+"\n"+
                ""+supplier+"\n"+
                ""+email+"\n";
    }

}
