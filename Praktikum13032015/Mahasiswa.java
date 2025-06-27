/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum13032015;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    long nim;
    String nama;
    int tugas;
    int uts;
    int uas;
    int quiz;
    double nilaiakhir;
    
public Mahasiswa (long nim, String nama, int tugas, int quiz, int uts, int uas){
    this.nim=nim;
    this.nama=nama;
    this.tugas=tugas;
    this.quiz=quiz;
    this.uts=uts;
    this.uas=uas;
}
    
public void DataMahasiswa(){
    System.out.println("NIM mahasiswa "+nim);
    System.out.println("Nama mahasiswa "+nama);
    System.out.println("Tugas mahasiswa "+tugas);
    System.out.println("UTS mahasiswa "+uts);
    System.out.println("UAS mahasiswa "+uas);
    System.out.println("Quiz mahasiswa "+quiz);
}

public void NilaiAkhir(){
    nilaiakhir = tugas*0.15 + quiz*0.2 + uts*0*3 + uas*0.5;
    System.out.println("Nilai Akhir = ");
    }

public void KonversiNilai(){
    System.out.print("Nilai Akhir Mahasiswa = ");
    
    if(nilaiakhir<40){
        System.out.println("E");
        System.out.println("Tidak Lulus");
    }
    else if (nilaiakhir<50){
        System.out.println("D");
    }
    else if (nilaiakhir<65){
        System.out.println("C");
    }
    else if (nilaiakhir<80){
        System.out.println("B");
    }
    else
        System.out.println("A");
}
}
