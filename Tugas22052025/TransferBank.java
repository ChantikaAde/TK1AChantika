package Tugas22052025;

class TransferBank extends Pembayaran implements MetodePembayaran {
    private String namaBank;

    public TransferBank(double totalBayar, String namaBank) {
        super(totalBayar);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via transfer bank...");
        System.out.println("Total: Rp" + totalBayar);
        System.out.println("Bank Tujuan: " + namaBank);
        System.out.println("Pembayaran berhasil diproses!");
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Metode: Transfer Bank");
        System.out.println("Bank: " + namaBank);
    }
}
