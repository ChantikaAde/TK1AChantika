package Tugas22052025;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistem Pembayaran ===");
        System.out.print("Masukkan total bayar: Rp");
        double totalBayar = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Cash (Tunai)");
        System.out.println("3. E-Wallet");
        System.out.println("4. Kartu Kredit");
        System.out.print("Pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 
        
        Pembayaran metodePembayaran = null;
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan nama bank: ");
                String namaBank = scanner.nextLine();
                metodePembayaran = new TransferBank(totalBayar, namaBank);
                break;
            case 2:
                metodePembayaran = new Cash(totalBayar);
                break;
            case 3:
                System.out.print("Masukkan provider E-Wallet (contoh: GoPay, OVO, DANA): ");
                String provider = scanner.nextLine();
                metodePembayaran = new EWallet(totalBayar, provider);
                break;
            case 4:
                System.out.print("Masukkan bank penerbit kartu: ");
                String bankKartu = scanner.nextLine();
                System.out.print("Masukkan nomor kartu kredit: ");
                String nomorKartu = scanner.nextLine();
                metodePembayaran = new KartuKredit(totalBayar, bankKartu, nomorKartu);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }
        
        System.out.println("\n=== Detail Pembayaran ===");
        ((MetodePembayaran)metodePembayaran).tampilkanDetail();
        System.out.println("Total: Rp" + totalBayar);
        
        System.out.println("\n=== Proses Pembayaran ===");
        metodePembayaran.prosesPembayaran();
        
        scanner.close();
    }
}
