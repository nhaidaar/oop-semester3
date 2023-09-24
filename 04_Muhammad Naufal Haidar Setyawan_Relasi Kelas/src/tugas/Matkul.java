package tugas;

public class Matkul {
    private String kode;
    private String nama;
    private Dosen pengajar;

    public Matkul(String kode, String nama, Dosen pengajar) {
        this.kode = kode;
        this.nama = nama;
        this.pengajar = pengajar;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Dosen getPengajar() {
        return pengajar;
    }

}
