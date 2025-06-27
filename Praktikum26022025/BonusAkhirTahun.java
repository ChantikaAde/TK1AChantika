/*
Program: BonusAkhirTahun.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: menentukan besar bonus akhir tahun
 */
package Praktikum26022025;

import java.util.Scanner;

public class BonusAkhirTahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gol, masakerja, umur;
        long bonus = 0;
        System.out.println("===Program Bonus Akhir Tahun===");
        System.out.println("Golongan Karyawan: \n 1. Staf\n 2. Non-Staf");
        System.out.println("===============================");
        System.out.print("Golongan anda (1/2)\t: ");
        gol = input.nextInt();
        System.out.print("Lama Kerja\t\t: ");
        masakerja = input.nextInt();
        System.out.print("Usia\t\t\t: ");
        umur = input.nextInt();
        switch (gol){
            case 1: //staf
                if (masakerja>=5 && umur>=45)
                    bonus = 10000000;
                else if (masakerja>=5 && umur<45)
                    bonus = 7000000;
                else //masa kerja kurang dari 5 berapapun umurnya
                    bonus = 5000000;
            break;
            case 2: //non-staf
                if (masakerja>5 && umur>45)
                    bonus = 6000000;
                else //selain kategori di atas
                    bonus = 2500000;
            break;
            default: {
                System.out.println("Golongan Anda Salah");
                bonus = 0;
            break;
            }
        }
        System.out.println("Bonus akhir tahun anda\t: Rp."+bonus+",-"); 
    }  
}