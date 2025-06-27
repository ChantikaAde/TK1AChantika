/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22052025;
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;
    
public Mobil(String merek, int tahun, int jumlahPintu, String transmisi){
    super(merek, tahun);
    this.jumlahPintu = jumlahPintu;
    this.transmisi = transmisi;
}
public int getJumlahPintu(){
    return jumlahPintu;
}
public void setJumlahPintu(int jumlahPintu){
    this.jumlahPintu = jumlahPintu;
}
public String getTransmisi(){
    return transmisi;
}
public void setTransmisi(String transmisi){
    this.transmisi = transmisi;
}
    @Override
    public void nyalakan(){
    System.out.println("Mobil "+ merek + " dinyalakan dengan kunci.");
}
    @Override
    public void matikan(){
    System.out.println("Mobil " + merek + " dimatikan.");
}
    @Override
    public void info(){
        System.out.println("Mobil " + merek + ", Tahun " + tahun + ", Pintu " + jumlahPintu + " ,Transmisi: " + transmisi);
    }
    @Override
    public void periksaKondisi(){
        System.out.println("Periksa oli, rem, dan tekanan ban " + merek + ".");
    }
    @Override
    public void servis(){
        System.out.println("Mobil " + merek + " dijadwalkan servis setiap 10.000 km.");
    }
}
