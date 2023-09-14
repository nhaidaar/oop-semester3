package Jobsheet2.Tugas4;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return hargaDasar - (int) (diskon * hargaDasar);
    }

    public void tampilData() {
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Dasar\t: " + hargaDasar);
        System.out.println("Diskon\t: " + (diskon * 100) + "%");
        System.out.println("===============================");
        System.out.println("Harga Jual\t: " + hitungHargaJual());
    }
}
