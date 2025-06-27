/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22052025;

/**
 *
 * @author Asus
 */
public abstract class Kendaraan {
    protected String merek;
    protected int tahun;
    
public Kendaraan(String merek, int tahun){
    this.merek = merek;
    this.tahun = tahun;
}
public String getMerek(){
    return merek;
}
public void setMerek(String merek){
    this.merek = merek;
}
public int getTahun(){
    return tahun;
}
public void setTahun(int tahun){
    this.tahun = tahun;
}
        
public void nyalakan(){
    System.out.println("Kendaraan dinyalakan");
}  
public void matikan(){
    System.out.println("Kendaraan dimatikan");
}

public abstract void info();
public abstract void periksaKondisi();
public abstract void servis();
}
