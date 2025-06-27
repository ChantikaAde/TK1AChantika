/*
Program: InputVariabel.java
Pembuat: Chantika Ade Putri 2401082002
Tanggal: 26 Februari 2025
Deskripsi: input beberapa jenis tipe data dari keyboard
 */
package Praktikum26022025;

import java.util.Scanner;

public class InputVariabel {
    public static void main(String[] args) {
        String nama; //variabel string
        char jk; //variabel karakter
        int umur; //variabel bilangan bulat
        float ipk; //variabel bilangan berkoma
        boolean asal; //variabel logika (true/false)
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jk = input.next().charAt(0);
        System.out.print("Masukkan umur anda: ");
        umur = input.nextInt();
        System.out.print("Masukkan nilai IPK anda: ");
        ipk = input.nextFloat();
        System.out.print("Apakah anda berasal dari Padang (true/false): ");
        asal = input.nextBoolean();
        System.out.println("\n\n===Data Anda===");
        System.out.println("Nama: "+ nama);
        System.out.println("Umur: "+ umur +" tahun");
        System.out.println("Gender: "+ jk);
        System.out.println("IPK: "+ ipk);
        if (asal)//default true
            System.out.println("Anda berasal dari Padang");
        else //asal=false
            System.out.println("Anda tidak berasal dari Padang");
        //endif
                
    }
    
}
