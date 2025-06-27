package Praktikum20032025;

import java.util.Scanner;

public class TestPersegiPanjang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kondisi awal sebelum pembuatan objek");
        System.out.println("Jumlah persegi panjang = "+PersegiPanjang.JumlahObjek);
        PersegiPanjang pp1 = new PersegiPanjang(8,5);
        System.out.println("Panjang= "+pp1.panjang);
        System.out.println("Lebar= "+pp1.lebar);
        
        System.out.println("Luas= "+pp1.panjang+" * "+pp1.lebar+" = "+pp1.getLuas());
        System.out.println("Keliling persegi panjang 1 = "+pp1.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini = "+PersegiPanjang.JumlahObjek);
        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.print("Masukkan panjang = ");
        pp2.panjang = in.nextInt();
        System.out.print("Masukkan lebar = ");
        pp2.lebar = in.nextInt();
        System.out.println("Luas persegi panjang 2 = "+pp2.getLuas());
        System.out.println("Keliling persegi panjang 2 = "+pp2.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini = "+PersegiPanjang.JumlahObjek);
        
    }
    
}