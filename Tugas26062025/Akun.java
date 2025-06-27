/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas26062025;

/**
 *
 * @author Asus
 */
public class Akun {
    private String pin;
    private double saldo;
    
    public Akun(String pin, double saldo){
        this.pin = pin;
        this.saldo = saldo;
    }
    public String getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean cekPin(String input) {
        return this.pin.equals(input);
    }
    
}
