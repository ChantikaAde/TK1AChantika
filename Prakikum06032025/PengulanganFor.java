/*
Program: PengulanganFor.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 06 Maret 2025
Deskripsi: menampilkan barisan angka dari 1 sampai input 
 */
package Prakikum06032025;

import java.util.Scanner;

public class PengulanganFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        ///pengulangan for
        System.out.print("Masukan batasan angka = ");
        n=input.nextInt();
        System.out.println("--Manggunakan Skema For--");
        for(i=1; i<=n; i++)
            System.out.print(i+"\t");
        ///endfor
        System.out.println(); //ganti baris

        System.out.println("--Menggunakan Skema While--");
        i=1;
        while(i<=n){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        
        System.out.println("--Menggunakan Skema do While--");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }
        while(i<=n);  
    } 
}
