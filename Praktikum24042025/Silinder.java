package Praktikum24042025;

public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(){
        super();
        this.tinggi = 0;
    }
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return super.getLuas() * tinggi;
    }
    @Override
    public String toString(){
        return "Silinder dengan r: " + super.getR() +
                "\nTinggi: " + tinggi +
                "\nVolume: " + getVolume() +
                "\nLuas: " + getLuas();
    }
    @Override
    public double getLuas(){
         return 2 * Math.PI * super.getR() * tinggi;
    }
}
