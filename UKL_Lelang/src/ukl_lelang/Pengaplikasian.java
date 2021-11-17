package UKL_Lelang;

public class Pengaplikasian {

    public static void main(String[] args) {
        // TODO code application logic here
        Barang barang1 = new Barang();
        Masyarakat masyarakat1 = new Masyarakat();
        Petugas petugas1 = new Petugas();
        Lelang lelang1;
        lelang1 = new Lelang();
        Laporan laporan1 = new Laporan();

        laporan1.laporan(petugas1);
        lelang1.prosesLelang(petugas1, masyarakat1, lelang1, barang1, laporan1
        );
        laporan1.laporan(barang1);
        laporan1.laporan(masyarakat1);
        lelang1.prosesPenawaran(masyarakat1, lelang1, barang1);
    }
}
