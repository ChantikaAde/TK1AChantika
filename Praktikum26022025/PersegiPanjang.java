/*
Program: PersegiPanjang.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: Hitung luas dan keliling persegi panjang
 */
package Praktikum26022025;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        int pj, lbr, luas, kell;
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang: ");
        pj = input.nextInt();
        System.out.print("Lebar: ");
        lbr = input.nextInt();
        luas = pj*lbr;
        kell = (2*pj)+(2*lbr);
        System.out.println("Luas: "+luas);
        System.out.println("Keliling: "+kell);
    }
    
}
