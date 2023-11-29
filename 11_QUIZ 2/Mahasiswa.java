public class Mahasiswa {
    private String nama;
    private String nim;
    private double[] nilai;

    Mahasiswa(String nama, String nim, double[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double[] getNilai() {
        return nilai;
    }

    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    public double hitung_ipk() {
        double total_nilai = 0;
        for (double n : nilai) {
            total_nilai += n; // menjumlahkan seluruh anggota array nilai
        }
        return (total_nilai / nilai.length) / 25; // membagi hasil penjumlahan dengan panjang array lalu convert ke IPK
                                                  // (nilai 100 ke ipk 4.0)
    }

    public double hitung_ipk(double[] bobot_sks) {
        double total_nilai = 0;
        double total_sks = 0;
        for (int i = 0; i < nilai.length; i++) {
            total_nilai += nilai[i] * bobot_sks[i]; // seluruh nilai dikali bobot_sks masing-masing
            total_sks += bobot_sks[i]; // menjumlahkan seluruh anggota array bobot_sks
        }
        return (total_nilai / total_sks) / 25; // membagi total nilai dengan seluruh bobot sks
    }
}