package TK1AChantikaAdePutri;

import java.util.Scanner;

public class TestBankEnkapsulasi {
    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah("Naya", "Didi");
        Tabungan tabungan1 = new Tabungan(10000); 
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Jojo", "Susi");
        Tabungan tabungan2 = new Tabungan(8000); 
        nasabah2.setTabungan(tabungan2);

        System.out.println("Nasabah 1: " + nasabah1);
        System.out.println("Nasabah 2: " + nasabah2);

        nasabah1.getTabungan().simpanUang(4000); 
        System.out.println("Saldo Nasabah 1 setelah menabung: " + nasabah1.getTabungan().getSaldo());

        nasabah2.getTabungan().simpanUang(7000); 
        System.out.println("Saldo Nasabah 2 setelah menabung: " + nasabah2.getTabungan().getSaldo());

        if (nasabah1.getTabungan().ambilUang(5000)) {
            System.out.println("Saldo Nasabah 1 setelah mengambil uang: " + nasabah1.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 1 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        if (nasabah2.getTabungan().ambilUang(6000)) {
            System.out.println("Saldo Nasabah 2 setelah mengambil uang: " + nasabah2.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 2 gagal mengambil uang. Saldo tidak mencukupi.");
        }
        
        if (nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000)) {
            System.out.println("Transfer berhasil.");
        } else {
            System.out.println("Transfer gagal. Saldo Nasabah 2 tidak mencukupi.");
        }

        System.out.println("Saldo akhir Nasabah 1: " + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir Nasabah 2: " + nasabah2.getTabungan().getSaldo());
    }
}

