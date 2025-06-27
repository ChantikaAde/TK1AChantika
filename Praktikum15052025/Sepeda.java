package Praktikum15052025;

public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
        
    }
    public Sepeda(String jmlSadel, int jmlGir, int jmlRoda, String warna){
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    public String getJmlSdael(){
        return jmlSadel;
    }
    public void setJmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    public void display(){
    System.out.println("Kelas Sepeda");
    System.out.println("Jumlah Sadel = "+this.jmlSadel);
    System.out.println("Jumlah Gir = "+this.jmlGir);
    System.out.println("Jumlah Roda = "+this.jmlRoda);
    System.out.println("Warna = "+this.warna);
}
    
}
