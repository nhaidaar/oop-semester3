package Percobaan2;

public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan() {
    }

    public Karyawan(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama\t=" + nama);
        System.out.println("Alamat\t=" + alamat);
        System.out.println("Jenis Kelamin\t=" + jk);
        System.out.println("Umur\t=" + umur);
        System.out.println("Gaji\t=" + gaji);
    }
}