package tugas;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Prodi prodi;
    private Matkul[] matkul;

    public Mahasiswa(String nim, String nama, Prodi prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void ambilMatkul(Matkul[] matkul) {
        this.matkul = matkul;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi.getNama());

        if (matkul != null) {
            System.out.println("Mata Kuliah yang Diambil:");
            for (int i = 0; i < matkul.length; i++) {
                System.out.println(
                        (i + 1) + ". " + matkul[i].getNama());
                System.out.println("\tDosen Pengajar : "
                        + matkul[i].getPengajar().getNama());
            }
        } else {
            System.out.println("Belum mengambil mata kuliah.");
        }
        System.out.println("============================");
    }
}
