/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20032025;

import java.util.Scanner;

public class TestVehicleEnkapsulasi {
    public static void main(String[] args) {
        //berat maksimum kendaraan
        System.out.println("Buat kendaraan maksimum 10000kg");
        VehicleEnkapsulasi kend1 = new VehicleEnkapsulasi(10000);
        
        //menambahkan berat pada kendaraan
        System.out.println("Menambahkan beban 1 (500kg) "+kend1.addBox(500));
        System.out.println("Menambahkan beban 2 (1000kg) "+kend1.addBox(1000));
        System.out.println("Menambahkan beban 3 (5000kg) "+kend1.addBox(5000));
        System.out.println("Menambahkan beban 4 (750kg) "+kend1.addBox(750));
        System.out.println("Menambahkan beban 5 (3000kg) "+kend1.addBox(3000));
        
        //beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini");
        System.out.println(kend1.getLoad()+" kg");
        
        Scanner in = new Scanner(System.in);
        //buat objek kedua dengan konstruktor kosong
        VehicleEnkapsulasi kend2 = new VehicleEnkapsulasi();
        System.out.println("Beban maksimal kendaraan = ");
        double bebanmax = in.nextDouble();
        kend2.setMaxLoad(bebanmax);
        //mengisi kendaraan dengan beban
        System.out.print("Masukkan beban ke kendaraan. Berat = ");
        double beban = in.nextDouble();
        while(kend2.addBox(beban)){
            kend2.addBox(beban);
            System.out.print("Masukkan beban ke kendaraan. Berat = ");
            beban = in.nextDouble();
        }
        if(!kend2.addBox(beban)){
            System.out.println("Maaf beban berlebih. Penambahan batal.");
        }
        System.out.println("Beban kendaraan saat ini = ");
        System.out.println(kend2.getLoad()+" kg");
    }
    
}
