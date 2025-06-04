package Tugas22052025;

class Cash extends Pembayaran implements MetodePembayaran {
    public Cash(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran tunai...");
        System.out.println("Total: Rp" + totalBayar);
        System.out.println("Silakan bayar di kasir terdekat");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Metode: Pembayaran Tunai (Cash)");
    }
}
