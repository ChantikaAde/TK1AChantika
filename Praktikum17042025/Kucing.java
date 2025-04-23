package Praktikum17042025;

public class Kucing extends Hewan{
    
    public Kucing(String nama){
        super(nama); //mengakses property super class
    }
    
    @Override
    public void bersuara(){
        super.bersuara(); //mengakses method super class
        System.out.println(nama+"berkata Meong!!!");
    }
}
