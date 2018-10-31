/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author yongki
 */
public class Inventory {
    private int stock;
    private String nama_barang,id_barang;

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
    public void tampilBarang(){
        System.out.println("Nama Barang \t: ".concat(getNama_barang()));
        System.out.println("ID Barang \t: ".concat(String.valueOf(getId_barang())));
        System.out.println("Stock Barang \t: ".concat(String.valueOf(getStock())));
    }
}
