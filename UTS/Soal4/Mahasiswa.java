package Soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin

    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor

        Mahasiswa mhs1 = new Mahasiswa("2241720097", "Muhammad Naufal Haidar Setyawan", "Pasuruan", 'L');
        System.out.println("Nama\t: " + mhs1.nama);
        System.out.println("NIM\t: " + mhs1.nim);
        System.out.println("Alamat\t: " + mhs1.alamat);
        System.out.println("Jenis Kelamin\t: " + mhs1.jenisKelamin);
    }
}