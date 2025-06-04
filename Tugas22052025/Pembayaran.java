package Tugas22052025;

abstract class Pembayaran {
    protected double totalBayar;

    public Pembayaran(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public abstract void prosesPembayaran();
}
