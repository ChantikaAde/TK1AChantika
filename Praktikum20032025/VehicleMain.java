/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20032025;

/**
 *
 * @author Asus
 */
public class VehicleMain {
    public static void main(String[] args) {
        //buat kendaraam dengan bebas maksimal 10000kg
        System.out.println("Buat kendaraan max beban 10000kg");
        Vehicle kend1 = new Vehicle (10000);
        
        //menambahkan beberapa beban ke kendaraan
        System.out.println("Menambahkan beban 1 (500kg) ");
        kend1.load=kend1.load+500;
        System.out.println("Menambahkan beban 2 (1000kg) ");
        kend1.load=kend1.load+1000;
        System.out.println("Menambahkan beban 3 (5000kg) ");
        kend1.load=kend1.load+5000;
        System.out.println("Menambahkan beban 4 (750kg) ");
        kend1.load=kend1.load+750;
        System.out.println("Menambahkan beban 5 (3000kg) ");
        kend1.load=kend1.load+3000;
        
        //menampilkan beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini");
        System.out.println(kend1.getLoad()+" kg");
    }
    
}
