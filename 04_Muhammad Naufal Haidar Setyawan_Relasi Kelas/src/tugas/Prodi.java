package tugas;

public class Prodi {
    private String kodeprodi;
    private String namaprodi;

    public Prodi(String kd, String nm) {
        kodeprodi = kd;
        namaprodi = nm;
    }

    public String getKode() {
        return kodeprodi;
    }

    public String getNama() {
        return namaprodi;
    }

}
