package Tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;

    DaftarGaji(int length) {
        this.listPegawai = new Pegawai[length];
    }

    void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }
    }

    void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println(pegawai.getNama() + " - " + pegawai.getGaji());
            }
        }
    }
}
