package pre.kuis;


import pre.kuis.Karyawan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yongki
 */
public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGol, tunjanganJab, tunjanganHadir;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int hadir) {
        this.kehadiran = hadir;
    }

    public float tunjanganHadir(int hadir) {
        return tunjanganHadir = hadir * 10000;
    }

    public float tunjanganJab(String jabatan) {
        if (jabatan.equalsIgnoreCase("manager")) {
            return this.tunjanganJab = 2000000;
        } else if (jabatan.equalsIgnoreCase("kabag")) {
            return this.tunjanganJab = 1000000;

        } else {
            return this.tunjanganJab = 0;
        }
    }

    public float tunjanganGol(int golongan) {
        if (golongan == 1) {
            return this.tunjanganGol = 500000;
        } else if (golongan == 2) {
            return this.tunjanganGol = 1000000;

        } else if (golongan == 3) {
            return this.tunjanganGol = 1500000;
        }
        else{
            return this.tunjanganGol = 0;
        }
    }
    public float gajiTotal(){
        return tunjanganGol+tunjanganHadir+tunjanganJab;
    }

}

