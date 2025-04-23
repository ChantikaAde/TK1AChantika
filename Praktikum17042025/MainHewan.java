/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum17042025;

/**
 *
 * @author Asus
 */
public class MainHewan {
    public static void main(String[] args) {
        //pembuatan objek
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby ");
        Anjing anjingku=new Anjing("Helly ");
        //mengakses super class
        hewanku.tampilkanNama();
        hewanku.bersuara();
        //mengakses subclass kucing
        System.out.println("\nTampilan akses sub class Kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        //mengakses subclass anjing
        System.out.println("Tampilan akses sub class Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
    
}
