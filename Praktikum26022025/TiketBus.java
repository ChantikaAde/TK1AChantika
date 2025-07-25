/*
Program: TiketBus.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: menentukan harga tiket dan besar diskon
 */
package Praktikum26022025;

import java.util.Scanner;

public class TiketBus {
    public static void main(String[] args) {
        int menu, jum_tiket = 0;
        long harga, tot_awal;
        float diskon = 0, tot_bayar;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|       KELAS       |   Harga Tiket   |");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|  1.Ekonomi        |  Rp.350.000,00  |");
        System.out.println("|  2.Eksekutif      |  Rp.500.000,00  |");
        System.out.println("|  3.SuperEksekutif |  Rp.650.000,00  |");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.print("Pilih tiket (angka): ");
        menu = input.nextInt();
        System.out.print("Masukkan jumlah tiket: ");
        jum_tiket = input.nextInt();
        switch(menu){
            case 1 : harga = 350000;
            break;
            case 2 : harga = 500000;
            break;
            case 3 : harga = 650000;
            break;
            default:
                harga = 0;
                System.out.println("Kelas tidak tersedia");
                break;
        }
        tot_awal=harga*jum_tiket;
        if (jum_tiket>4){
            System.out.println("Diskon!!!");
            diskon=(float) (0.1*tot_awal);
        }
        else {
            diskon = 0;
        }
        tot_bayar=tot_awal-diskon;
        System.out.println("Biaya Awal : "+tot_awal);
        System.out.println("Diskon     : "+diskon);
        System.out.println("Bayar      : "+tot_bayar);
    }
    
}