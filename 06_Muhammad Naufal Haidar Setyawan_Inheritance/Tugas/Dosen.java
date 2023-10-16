package Tugas;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }

}
