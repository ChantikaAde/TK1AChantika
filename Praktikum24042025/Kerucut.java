package Praktikum24042025;

public class Kerucut extends Lingkaran {
    private double tinggi;
    
    public Kerucut(){
        super();
        this.tinggi = 0;
    }
    public Kerucut(double r, double t){
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
        return (1.0 / 3) * super.getLuas() * tinggi;
    }
    @Override
    public String toString(){
        return "Kerucut dengan r: " + super.getR() +
                "\nTinggi: " + tinggi +
                "\nVolume: " + getVolume() +
                "\nLuas: " + getLuas();
        
    }
    @Override
    public double getLuas(){
        double s = Math.sqrt((tinggi * tinggi) + (super.getR() * super.getR()));
        return Math.PI * super.getR() * s;
    }
}
