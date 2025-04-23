package Praktikum17042025;

public class PesawatMain1 {

    public static void main(String[] args) {
        //buat objek pada class pesawat
        Pesawat p=new Pesawat("Air Asia",2020,true,130);
        System.out.println("Kondisi awal");
        p.Cetak();
        
        System.out.println();
        
        System.out.println("Kondisi setelah reset");
        p.reset("Lion Air", 1998, false, 80);
        p.Cetak();
    }
    
}
