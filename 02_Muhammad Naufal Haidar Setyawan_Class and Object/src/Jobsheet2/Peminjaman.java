package Jobsheet2;

public class Peminjaman {
    public int idMember;
    public int lamaSewa;

    public int hitungSewa(int harga) {
        return harga * this.lamaSewa;
    }

    public void tampilDataPeminjaman(String namaGame, int hargaGame) {
        System.out.println("Peminjaman oleh Member " + this.idMember);
        System.out.println("Nama Game\t\t: " + namaGame);
        System.out.println("Harga per-hari\t\t: " + hargaGame);
        System.out.println("Total pembayaran\t: " + hitungSewa(hargaGame));
        System.out.println("========================================");
    }
}
