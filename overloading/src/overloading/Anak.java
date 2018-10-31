/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author yongki
 */
public class Anak extends OrangTua{
    private int umur2;

    public int getUmur2() {
        return umur2;
    }

    public void setUmur2(int umur2) {
        this.umur2 = umur2;
    }

    public void tampilUmur(int a){
        
        System.out.println("Umur anak : "+umur2);
    }
}
