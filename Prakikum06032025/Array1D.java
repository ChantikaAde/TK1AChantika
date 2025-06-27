/*
Program: BonusAkhirTahun.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: Program meminta ukuran array dan isi array pada user
 */
package Prakikum06032025;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int A[]; //variabel array
        int i, uk; //i=indeks, uk=ukuran
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran array = ");
        uk=input.nextInt();
        A=new int[uk]; //berikan ukuran untuk array
        //mengisi array
        for(i=0;i<uk;i++){
            System.out.print("Masukkan data ke"+(i+1)+" = ");
            A[i]=input.nextInt();
        }
        //menampilkan array
        System.out.println("---Isi Array---");
        for(i=0;i<uk;i++)
            System.out.print(A[i]+"\t");
        //end for 
        System.out.println();
        //mengitung jumlah dan rata rata isi array
        int sum = 0;
        float rata = 0;
        for (i=0;i<uk;i++)
            sum = sum + A[i];
        //end for
        rata = (float) sum / uk;
        System.out.println("Jumlah = "+sum);
        System.out.println("Rata-Rata = "+rata);
        System.out.println();
        //menghitung max dan min isi array 
        //cara 1, berdasarkan isi array
        int max = A[0];
        for(i=1;i<uk;i++){
            if (A[i]>max)
                max=A[i];
        }
          System.out.println("Nilai Terbesar = "+max);
        int min = A[0];
        for(i=1;i<uk;i++){
            if (A[i]<min)
                min=A[i];
        }
        System.out.println("Nilai Terkecil = "+min);
        //cara 2, berdasarkan posisi indeks (max)
        int imax = 0;
        for(i=1;i<uk;i++){
            if(A[i]>A[imax])
                imax = i;
        }
        //end if
        System.out.println("Nilai Terbesar Cara 2 = "+imax);
        //cara 2, berdasarkan posisi indeks (min)
        int imin = 0;
        for(i=1;i<uk;i++){
            if(A[i]<A[imin])
                imin = i;
        }
        System.out.println("Nilai Terkecil Cara 2 = "+imin);
        }
        }
