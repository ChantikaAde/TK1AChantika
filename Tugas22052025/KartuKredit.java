package Tugas22052025;

class KartuKredit extends Pembayaran implements MetodePembayaran {
    private String bank;
    private String nomorKartu;

    public KartuKredit(double totalBayar, String bank, String nomorKartu) {
        super(totalBayar);
        this.bank = bank;
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via Kartu Kredit...");
        System.out.println("Total: Rp" + totalBayar);
        System.out.println("Bank: " + bank);
        System.out.println("4 digit terakhir: " + nomorKartu.substring(nomorKartu.length() - 4));
        System.out.println("Pembayaran berhasil diproses!");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Metode: Kartu Kredit");
        System.out.println("Bank: " + bank);
    }
}