package Praktikum24042025;

import java.util.Scanner;

public class MainLingkaran {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("\n=== MENU PROGRAM LINGKARAN ===");
        System.out.println("1. Lingkaran");
        System.out.println("2. Kerucut");
        System.out.println("3. Silinder");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int menu = in.nextInt();
        in.nextLine(); 
        
        switch (menu){
            case 1:
                System.out.print("Masukkan r lingkaran: ");
                double rLingkaran = in.nextDouble();
                Lingkaran lingkaran = new Lingkaran(rLingkaran);
                System.out.println(lingkaran.toString());
                break;
            case 2:
                System.out.print("Masukkan r kerucut: ");
                double rKerucut = in.nextDouble();
                System.out.print("Masukkan t kerucut: ");
                double tKerucut = in.nextDouble();
                Kerucut kerucut = new Kerucut(rKerucut, tKerucut);
                System.out.print(kerucut.toString());
                break;
            case 3:
                System.out.print("Masukkan r silinder: ");
                double rSilinder = in.nextDouble();
                System.out.print("Masukkan t silinder: ");
                double tSilinder = in.nextDouble();
                Silinder silinder = new Silinder(rSilinder, tSilinder);
                System.out.print(silinder.toString());
                break;
            case 4:
                System.out.println("Terima Kasih. Program Selesai");
                break;
                
            default:
                System.out.println("Pilihan tidak valid.");
        }
        in.close();
    }
    
}
