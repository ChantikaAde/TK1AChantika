/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum15052025;

/**
 *
 * @author Asus
 */
public class TestPolimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //normal
        Kendaraan k1 = new Kendaraan(4,"merah");
        k1.display();
        System.out.println("");
        
        //public Mobil(String bahanBakar, int kapasitasMesin, int jmlRoda, String warna)
        Kendaraan k2 = new Mobil("bensin",1500,4,"cokelat");
        k2.display();
        System.out.println("");
        
        //public Truk(int muatanMaks, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna)
        Mobil k3 = new Truk(10000,"Solar",4000,6,"biru-merah");
        k3.display();
        System.out.println("");
        
        //public SepedaListrik(int kecepatanMaks, int jarakTempuh, String jmlSadel, int jmlGir, int jmlRoda, String warna)
        Sepeda k4 = new SepedaListrik(40,50,"lima",2,4,"merah");
        k4.display();
        System.out.println();
    }
    
}
