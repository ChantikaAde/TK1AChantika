package Praktikum24042025;

public class Lingkaran {
    private double r;
    
    public Lingkaran(){
        this.r = 0;
    }
    public Lingkaran(double r){
        this.r = r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public double getDiameter(){
        return 2 * r;
    }
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    public double getLuas(){
        return Math.PI * r * r;
    }
    @Override
    public String toString (){
        return "Lingkaran dengan r: " + r +
                "\nDiameter: " + getDiameter() +
                "\nKeliling: " + getKeliling() +
                "\nLuas: " + getLuas();
    }
}
