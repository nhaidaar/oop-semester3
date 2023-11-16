package Exercise1;

public class Manajer extends Pegawai {
    private int tunjangan;

    Manajer(String nama, int gaji, int tunjangan) {
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    int getGaji() {
        return gaji;
    }

    int getTunjangan() {
        return tunjangan;
    }
}
