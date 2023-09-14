public class MataKuliah {
    String kodeMk, namaMk;
    double nilai;

    MataKuliah(String kodeMk, String namaMk, double nilai) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.nilai = nilai;
    }

    public boolean kelulusan() {
        return nilai > 70;
    }
}
