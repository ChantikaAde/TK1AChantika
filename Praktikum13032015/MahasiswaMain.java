package Praktikum13032015;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        long nim;
        String nama;
        int tgs;
        int uts;
        int uas;
        int quiz;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nim Anda: ");
        nim = in.nextLong();
        in.nextLine();
        
        System.out.print ("Masukkan nama Anda: ");
        nama = in.nextLine();
        
        System.out.print("Masukkan tugas Anda: ");
        tgs = in.nextInt();
        
        System.out.print("Masukkan nilai uts Anda: ");
        uts = in.nextInt();
        
        System.out.print("Masukkan nilai uas Anda: ");
        uas = in.nextInt();
        
        System.out.print("Masukkan nilai quiz Anda: ");
        quiz = in.nextInt();
        
        Mahasiswa orang = new Mahasiswa (nim, nama, tgs, uts, uas, quiz);
        
        System.out.println("-- Informasi Mahasiswa --");
        orang.DataMahasiswa();
        
        System.out.println("-- Nilai Akhir --");
        orang.NilaiAkhir();
        
        System.out.println("\n-- Konversi Nilai --");
        orang.KonversiNilai();
        
    }
    
}
