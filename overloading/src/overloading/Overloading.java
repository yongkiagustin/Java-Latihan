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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anak x = new Anak();
        x.setUmur(11);
        x.setUmur2(40);
        x.tampilUmur();
        x.tampilUmur(2);
    }
    
}
