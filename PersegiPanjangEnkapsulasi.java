package TK1AChantikaAdePutri;

public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi(){
        this.panjang = 0;
        this.lebar = 0;
        jumlahObjek++;
    }

    PersegiPanjangEnkapsulasi(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void setPanjang(int panjangBaru){
        this.panjang = panjangBaru;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lebarBaru){
        this.lebar = lebarBaru;
    }   
    public int getLebar(){
        return lebar;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    public int getLuas(){
        return panjang * lebar;
    }
    public int getKeliling(){
        return 2 * (panjang + lebar);
    }
}
