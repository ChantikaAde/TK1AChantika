package Praktikum17042025;

public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata Guk! Guk!");
    }
    
}
