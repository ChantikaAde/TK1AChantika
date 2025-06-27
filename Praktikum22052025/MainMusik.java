/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum22052025;
public class MainMusik {
    public static void main(String[] args) {
        //membuat objek 
        Gitar gitar = new Gitar("Klasik", "Petik", 6);
        Keyboard keyboard = new Keyboard ("Yamaha", "Elektronik", true);
        
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("Alat Musik Keyboard");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.matikan();
        keyboard.cekListrik();
        keyboard.mainkan();
        keyboard.stem();
        
    }
    
}
