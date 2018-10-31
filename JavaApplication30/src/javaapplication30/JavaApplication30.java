/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner innama = new Scanner(System.in);
        Scanner inid = new Scanner(System.in);
        Scanner instock = new Scanner(System.in);

        Inventory inv = new Inventory();
        System.out.print("Masukkan Nama Barang : ");
        inv.setNama_barang(innama.nextLine());
        System.out.print("Masukkan ID Barang : ");
        inv.setId_barang(inid.nextLine());
        System.out.print("Masukkan Stock : ");
        inv.setStock(instock.nextInt());
        System.out.println("");
        inv.tampilBarang();

    }

}
