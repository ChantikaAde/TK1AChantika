package Praktikum20032025;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int JumlahObjek=0;
    
    public PersegiPanjang(){
            JumlahObjek++;
    }
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        JumlahObjek++;
    }
    public static int getJumlahObjek(){
        return JumlahObjek;
    }
    public int getLuas(){
        return(panjang*lebar);
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}
