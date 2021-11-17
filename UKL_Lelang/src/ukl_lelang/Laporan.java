package UKL_Lelang;

import java.util.ArrayList;
public class Laporan {

    public void laporan(UKL_Lelang.Barang barang) {
        int x = barang.getJmlBarang();

        System.out.println();
        System.out.println("=====TABEL BARANG YANG DILELANG=====");
        System.out.println("ID Nama Barang \tHarga \t\tStatus ");
        for (int i = 0; i < x; i++) {
            System.out.println(i +".\t" + barang.getNamaBarang(i) + "\t" + "\t" + "Rp." + barang.getHargaAwal(i) + "\t" + barang.getStatus(i));
        }
    }

    public void Laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJmlMasyarakat();
        System.out.println("\n==========TABEL MASYARAKAT==========");
        System.out.println("ID \tNama \tAlamat \t\tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t"+ masyarakat.getNama(i) + "\t"
                    + masyarakat.getAlamat(i) + "\t" + masyarakat.getTelepon(i));
        }
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();
        System.out.println("===========TABEL PETUGAS============");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + petugas.getNama(i) + "\t"
                    + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));
        }
    }

    void laporan(Masyarakat masyarakat1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

