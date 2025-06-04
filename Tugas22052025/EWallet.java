package Tugas22052025;

class EWallet extends Pembayaran implements MetodePembayaran {
    private String provider;

    public EWallet(double totalBayar, String provider) {
        super(totalBayar);
        this.provider = provider;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via E-Wallet...");
        System.out.println("Total: Rp" + totalBayar);
        System.out.println("Provider: " + provider);
        System.out.println("Pembayaran berhasil diproses!");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Metode: E-Wallet");
        System.out.println("Provider: " + provider);
    }
}
