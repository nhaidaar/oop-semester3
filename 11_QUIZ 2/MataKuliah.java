public class MataKuliah {
    private String nama_matakuliah;
    private int sks;
    private double[] nilai_mahasiswa;

    MataKuliah(String nama_matakuliah, int sks, double[] nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public void setNama_matakuliah(String nama_matakuliah) {
        this.nama_matakuliah = nama_matakuliah;
    }

    public double getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public double[] getNilai_mahasiswa() {
        return nilai_mahasiswa;
    }

    public void setNilai_mahasiswa(double[] nilai_mahasiswa) {
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    public double hitung_bobot() {
        double nilai_rata_rata = 0;
        for (double n : nilai_mahasiswa) {
            nilai_rata_rata += n; // menjumlahkan seluruh nilai mahasiswa
        }
        nilai_rata_rata /= nilai_mahasiswa.length; // membaginya dengan banyak mahasiswa

        // memilih bobot berdasarkan nilai rata-rata
        if (nilai_rata_rata >= 80) {
            return 4.0;
        } else if (nilai_rata_rata >= 75) {
            return 3.5;
        } else if (nilai_rata_rata >= 70) {
            return 3.0;
        } else if (nilai_rata_rata >= 65) {
            return 2.5;
        } else if (nilai_rata_rata >= 60) {
            return 2.0;
        } else if (nilai_rata_rata >= 55) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

    public double hitung_bobot(double[] bobot_mahasiswa) {
        double bobot = 0;
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            bobot += nilai_mahasiswa[i] * bobot_mahasiswa[i]; // menghitung tiap bobot mahasiswa dengan nilainya lalu
                                                              // menjumlahkannya
        }

        bobot /= nilai_mahasiswa.length; // membaginya dengan banyak mahasiswa

        // memilih bobot berdasarkan rata-rata
        if (bobot >= 80) {
            return 4.0;
        } else if (bobot >= 75) {
            return 3.5;
        } else if (bobot >= 70) {
            return 3.0;
        } else if (bobot >= 65) {
            return 2.5;
        } else if (bobot >= 60) {
            return 2.0;
        } else if (bobot >= 55) {
            return 1.5;
        } else {
            return 1.0;
        }
    }
}
