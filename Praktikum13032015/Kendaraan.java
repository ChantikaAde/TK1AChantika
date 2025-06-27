/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum13032015;

public class Kendaraan {
    String jenis;
    int tahun;
    String warna;
    
    
    ///constructor
    public Kendaraan(String j, int t, String w){
        this.jenis=j;
        this.tahun=t;
        this.warna=w;
    }
    
    public void TampilData(){
        System.out.println("Jenis kendaraan = "+jenis);
        System.out.println("Warna Kendaraan = "+warna);
        System.out.println("Tahun keluaran = "+tahun);
    }
    
    ///method dengan parameter
    public void TipeKendaraan(int kec){
        System.out.println("Tipe Kendaraan Anda");
        if(kec<20){
            System.out.println("Lebih baik jalan");
            System.out.println("Ganti kendaraan saja");
        }
        else if (kec<40)
            System.out.println("Slow");
        else if (kec<80)
            System.out.println("Standar");
        else if (kec<100)
            System.out.println("Fast");
        else
            System.out.println("Racing Car!!!!");
    }
}
