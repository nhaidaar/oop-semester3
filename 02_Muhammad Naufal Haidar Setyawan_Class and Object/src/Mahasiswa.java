public class Mahasiswa {
    String nim, nama, kelas;

    Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
    }
}
