import java.util.ArrayList;
import java.util.List;

public class Perwalian {
    private List<Mahasiswa> mahasiswa;
    private List<MataKuliah> matakuliah;

    public Perwalian() {
        mahasiswa = new ArrayList<>();
        matakuliah = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
    }

    public void addMatakuliah(MataKuliah matakuliah) {
        this.matakuliah.add(matakuliah);
    }

    public void printData() {
        for (Mahasiswa m : mahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("IPK: " + m.hitung_ipk());
            System.out.println("Mata kuliah yang diambil:");
            for (MataKuliah mk : matakuliah) {
                System.out.println("* " + mk.getNama_matakuliah() + " (SKS: " + mk.getSks() + ")");
            }
            System.out.println();
        }
    }
}
