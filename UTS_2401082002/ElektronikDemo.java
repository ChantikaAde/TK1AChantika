package UTS_2401082002;

import java.util.Scanner;

public class ElektronikDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("\n MENU PROGRAM ELEKTRONIK");
        System.out.println("1. Laptop");
        System.out.println("2. Gaming");
        System.out.println("3. Keluar");
        System.out.println("Pilih (1-3): ");
        int pilihan = in.nextInt();
        in.nextLine();
        
        switch(pilihan){
            case 1: 
                System.out.print("Masukkan Merek: ");
                String merek = in.nextLine();
                System.out.print("Masukkan Tahun Produksi: ");
                int tahunProduksi = in.nextInt();
                System.out.print("Masukkan Garansi");
                int garansi = in.nextInt();  
                break;
            case 2:
                System.out.print("Masukkan Ukuran Layar: ");
                int ukuranLayar = in.nextInt();
                System.out.print("Masukkan Kapasitas RAM: ");
                int kapasitasRAM = in.nextInt();
                break;
            case 3: 
                
        }
    }
    
}
