/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author yongki
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen1;
        Dosen dosen2;
        
        dosen1 = new DosenTetap();
        dosen1.setNama("Mira Kania");
        System.out.println("Dosen Tetap : "+dosen1.getNama());
        dosen1.absen();
        
        dosen2 = new DosenLB();
        dosen2.setNama("Mira Kania");
        System.out.println("Dosen LB : "+dosen2.getNama());
        dosen2.absen();
    }
    
}
