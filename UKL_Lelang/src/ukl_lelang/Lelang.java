package UKL_Lelang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lelang {
    
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    public Lelang() {
        this.idMasyarakat.add(0);
        this.idBarang.add(0);
        this.hargaTawar.add(2);
    }

    static int inputIdBarang;

    public void prosesLelang(Petugas petugas, Masyarakat masyarakat, Lelang lelang, Barang barang, Laporan laporan) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("==========SILAHKAN LELANG BARANG ANDA!==========");
        System.out.println(" ");
        System.out.print("Masukkan ID Petugas                : ");
        int idPetugas = myObj.nextInt();
        System.out.println("Selamat datang " + petugas.getNama(idPetugas));
        System.out.println(" ");
        System.out.print("Masukkan Barang yang mau dilelang  : ");
        String namaBarang = myObj.next();
        barang.setNamaBarang(namaBarang);

        System.out.print("Masukkan harga awal lelang         : Rp.");
        int hargaAwal = myObj.nextInt();
        barang.setHargaAwal(hargaAwal);

        System.out.print("Apakah barang bisa ditawar?(yes/no):");
        String answer = myObj.next();
        if ("yes".equals(answer)) {
            barang.setStatus(true);
            System.out.println("Barang dapat ditawar");
        } else {
            System.out.println("Barang tidak boleh ditawar");
            barang.setStatus(false);
            laporan.laporan(barang);
            System.exit(0);
        }
    }

    static int idMasy;
    static String namaPemenang = "";

    public void prosesPenawaran(Masyarakat masyarakat, Lelang lelang, Barang barang) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        if (barang.getStatus(inputIdBarang) == true) {
            System.out.println("======SILAHKAN MELAKUKAN PENAWARAN BARANG!======");
            int temp = 0;

            do {
                System.out.print("Masukkan ID Masyarakat            : ");
                idMasy = myObj.nextInt();
                System.out.println("Selamat datang " + masyarakat.getNama(idMasy));
                ArrayList<Integer> idBarang = new ArrayList<Integer>();
                ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

                int i = 0;
                do {
                    System.out.print("Masukkan kode barang              : ");
                    temp = myObj.nextInt();
                    if (temp == 99) {
                        continue;
                    } else {
                        inputIdBarang = temp;
                    }

                    if (temp != 99) {
                        idBarang.add(temp);
                        System.out.print(barang.getNamaBarang(idBarang.get(i))
                                + " Harga Tawar                : Rp.");
                        int inputHargaTawar = myObj.nextInt();
                        if (inputHargaTawar < Collections.max(this.hargaTawar)) {
                            continue;
                        } else {
                            namaPemenang = masyarakat.getNama(idMasy);
                            this.hargaTawar.add(inputHargaTawar);
                        }
                        i++;
                    }
                } while (temp != 99);

                System.out.print("\nLanjutkan atau matikan 1 / 99 ?   : ");

                temp = myObj.nextInt();
            } while (temp != 99);
            System.out.println("Barang sudah tidak dapat dilelang");
            barang.editStatus(inputIdBarang, false);
            System.out.println("Status barang saat ini          : " + barang.getStatus(1));

            int total = 0;
            int x = idBarang.size();

            System.out.println("\n =========TABEL PEMENANG LELANG BARANG=========");
            System.out.println("Barang yang dilelang               : " + barang.getNamaBarang(inputIdBarang));
            System.out.println("Nama pemenang                      : " + namaPemenang);
            System.out.println("Harga Awal                         : Rp." + barang.getHargaAwal(inputIdBarang));
            System.out.println("Harga tertinggi                    : Rp." + Collections.max(this.hargaTawar));

        } else if (barang.getStatus(inputIdBarang) == false) {
            System.out.println("Barang tidak dapat ditawar");

        }
    }

    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar) {
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
        barang.editStatus(idBarang, barang.getStatus(idBarang));
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getBanyaknya(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public int getJmlLelang() {
        return this.idMasyarakat.size();
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int getHargaTawar(int idBarang) {
        return this.hargaTawar.get(idBarang);
    }
}


