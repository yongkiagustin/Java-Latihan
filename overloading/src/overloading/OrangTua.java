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
public class OrangTua {
    private int umur;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur orang tua : "+umur);
    }
}
