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
public class DosenLB extends Dosen{

    @Override
    public void absen() {
        System.out.println("Absen Tanda Tangan");
    }
    
}
