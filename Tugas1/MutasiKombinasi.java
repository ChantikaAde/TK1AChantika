package Tugas1;

import java.util.Scanner;

public class MutasiKombinasi {
    public static void main(String[] args) {
        int n, r, i;
        int mutasi=1, kombi=1, x=1;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.print("Maasukkan nilai n: ");
        n = input.nextInt();
        System.out.print("Maasukkan nilai r: ");
        r = input.nextInt();
        System.out.println("====================");
        
        for(i=n;i>(n-r);i--){
            mutasi *= i;
        }
        for(i=r;i>1;i--){
            x *= i;
        }
        kombi = mutasi / x;
        
        System.out.println("Nilai Permutasi: "+mutasi);
        System.out.println("Nilai Kombinasi: "+kombi);
        System.out.println("--------------------");
    }
}
