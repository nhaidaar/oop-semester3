package tugas;

public class MainTugas {
    public static void main(String[] args) {
        Prodi prodi1 = new Prodi("TI", "D4 Teknik Informatika");
        Prodi prodi2 = new Prodi("SIB", "D4 Sistem Informasi Bisnis");

        Dosen dosen1 = new Dosen("VAH", "Vipkas Al Hadid");
        Dosen dosen2 = new Dosen("ZUL", "Ahmadi Yuli Ananta");
        Dosen dosen3 = new Dosen("MUP", "Muhammad Unggul Pamenang");

        Matkul matkul1 = new Matkul("PBO", "Pemrograman Berbasis Objek", dosen1);
        Matkul matkul2 = new Matkul("MANPRO", "Manajemen Proyek", dosen2);
        Matkul matkul3 = new Matkul("DESPROWEB", "Desain dan Pemrograman Web", dosen3);
        Matkul matkul4 = new Matkul("GUI", "Desain Antarmuka", dosen3);

        Mahasiswa mahasiswa1 = new Mahasiswa("Naufal", "2241720097", prodi1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Irsyad", "2241730197", prodi2);

        mahasiswa1.ambilMatkul(new Matkul[] { matkul1, matkul2, matkul3, matkul4 });

        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
    }
}
