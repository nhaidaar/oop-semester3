package Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    Komputer() {
    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    void tampilData() {
        System.out.println("Merk\t= " + merk);
        System.out.println("Jenis Processor\t= " + jnsProsesor);
        System.out.println("Kecepatan Processor\t= " + kecProsesor + " GHz");
        System.out.println("Ukuran Memori\t= " + sizeMemory + " GB");
    }
}
