package UTS_2401082002;

public class Gaming extends Laptop {
    public String kartuGrafis;
    public int refreshRate;
    
public Gaming(){
    
}
public Gaming(String merek, int tahunProduksi, int garansi, int ukuranLayar, 
        int kapasitasRAM, String kartuGrafis, int refreshRate){
    super(merek, tahunProduksi, garansi, ukuranLayar, kapasitasRAM);
    this.kartuGrafis=kartuGrafis;
    this.refreshRate=refreshRate;
}
public String getKartuGrafis(){
    return kartuGrafis;
}
public void setKartuGrafis(String kartuGrafis){
    this.kartuGrafis=kartuGrafis;
}
public int getRefreshRate(){
    return refreshRate;
}
public void setRefreshRate(int refreshRate){
    this.refreshRate=refreshRate;
}
}
