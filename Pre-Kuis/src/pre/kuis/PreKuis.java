/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pre.kuis;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class PreKuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat dff = new DecimalFormat("#.#####");
        int gaji = 3000000;
        double phi = 33.1451221;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();
        System.out.println(df.format(d));
        System.out.print("Gaji :");
        System.out.println(NumberFormat.getInstance(Locale.US).format(gaji));
        System.out.print("Phi : ");
        System.out.println(dff.format(phi));
        Scanner innik = new Scanner(System.in);
        Scanner innama = new Scanner(System.in);
        Scanner ingol = new Scanner(System.in);
        Scanner injab = new Scanner(System.in);
        Scanner inhadir = new Scanner(System.in);
        Manager man = new Manager();
        System.out.println("Program Perhitungan gaji Karyawan");
        System.out.println("");
        System.out.print("masukkan nik : ");
        man.setNik(innik.nextLine());
        System.out.print("Masukkan Nama : ");
        man.setNama(innama.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        man.setGolongan(ingol.nextInt());
        System.out.print("Masukkan Jabatan : ");
        man.setJabatan(injab.nextLine());
        System.out.print("Masukkan Jumlah hadir : ");
        man.setKehadiran(inhadir.nextInt());
        
        System.out.println("");
        System.out.println("NIK "+man.getNik());
        System.out.println("Nama "+man.getNama());
        System.out.println("Golongan : "+man.getGolongan());
        System.out.println("Jabatan : "+man.getJabatan());
        System.out.println("Kehadiran :"+man.getKehadiran());
        System.out.println("");
        System.out.print("Tunjangan Golongan : ");
        System.out.println(NumberFormat.getInstance(Locale.US).format(man.tunjanganGol(man.golongan)));
        System.out.print("Tunjangan Jabatan : ");
        System.out.println(NumberFormat.getInstance(Locale.US).format(man.tunjanganJab(man.jabatan)));
        System.out.print("Tunjangan Kehadiran :");
        System.out.println(NumberFormat.getInstance(Locale.US).format(man.tunjanganHadir(man.getKehadiran())));
        System.out.println("Total gaji : ");
        System.out.println(NumberFormat.getInstance(Locale.US).format(man.gajiTotal()));
    }

}
