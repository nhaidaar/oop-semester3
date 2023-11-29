public class Main {
    public static void main(String[] args) {
        // Buat objek Perwalian
        Perwalian perwalian = new Perwalian();

        // Tambahkan mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", "1234567890", new double[] { 80, 90, 75 });
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "2345678901", new double[] { 75, 85, 80 });
        perwalian.addMahasiswa(mahasiswa1);
        perwalian.addMahasiswa(mahasiswa2);

        // Tambahkan mata kuliah
        MataKuliah matakuliah1 = new MataKuliah("Artificial Intelligence", 2, new double[] { 80, 90, 75 });
        MataKuliah matakuliah2 = new MataKuliah("Sistem Informasi Manajemen", 2, new double[] { 75, 85, 80 });
        perwalian.addMatakuliah(matakuliah1);
        perwalian.addMatakuliah(matakuliah2);

        // Cetak data
        perwalian.printData();
    }
}
