/*
Program: BonusAkhirTahun.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: 
 */
package Prakikum06032025;

import java.util.Scanner;
import java.util.Random;

public class Array1DRandom {
    public static void main(String[] args) {
        int A[]; //variabel array
        int i, uk; //i=indeks, uk=ukuran
        Scanner input = new Scanner(System.in);
        Random rand = new Random (); //objek random
        System.out.print("Masukkan ukuran array = ");
        uk=input.nextInt();
        A=new int[uk]; //berikan ukuran untuk array
        //mengisi array
        for(i=0;i<uk;i++){
            A[i]=rand.nextInt(100)+1;//isi array dengan random 100        }
        //menampilkan array
        System.out.println("---Isi Array---");
        for(i=0;i<uk;i++)
            System.out.print(A[i]+"\t");
        //end for 
        System.out.println();
    }
    
}
}
