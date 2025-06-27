package UTS_2401082002;

public class Laptop extends Elektronik {
    public int ukuranLayar;
    public int kapasitasRAM;
    
public Laptop(){
    
}
public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM){
    super(merek, tahunProduksi, garansi);
    this.ukuranLayar=ukuranLayar;
    this.kapasitasRAM=kapasitasRAM;
}
public int getUkuranLayar(){
    return ukuranLayar;
}
public void setUkuranLayar(int ukuranLayar){
    this.ukuranLayar=ukuranLayar;
}
public int getKapasitasRAM(){
    return kapasitasRAM;
}
public void setKapasitasRAM(int kapasitasRAM){
    this.kapasitasRAM=kapasitasRAM;
}
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM;
    }
}

