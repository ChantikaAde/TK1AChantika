/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22052025;
public class Motor extends Kendaraan{
    private String jenisHelm;
    private int cc;
    
    public Motor(String merek, int tahun, String jenisHelm, int cc){
        super(merek, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    public String getJenisHelm(){
        return jenisHelm;
    }
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm = jenisHelm;
    }
    public int getCc(){
        return cc;
    }
    public void setCc(int cc){
        this.cc = cc;
    }
    @Override
    public void nyalakan(){
    System.out.println("Motor "+ merek + " dinyalakan dengan starter.");
}
    @Override
    public void matikan(){
    System.out.println("Motor " + merek + " dimatikan.");
}
    @Override
    public void info(){
        System.out.println("Motor " + merek + ", Tahun " + tahun + ", " + "CC: " + cc + ", Helm " + jenisHelm);
    }
    @Override
    public void periksaKondisi(){
        System.out.println("Periksa rantai, oli mesin, " + "dan rem motor " + merek + ".");
    }
    @Override
    public void servis(){
        System.out.println("Motor " + merek + " perlu servis rutin setiap 3.000km.");
    }
}
