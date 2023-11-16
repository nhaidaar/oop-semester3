package Exercise1;

public class Pegawai {
    protected String nama;
    protected int gaji;

    Pegawai() {
    }

    Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    int getGaji() {
        return gaji;
    }
}