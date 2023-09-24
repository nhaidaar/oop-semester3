# Praktikum 4 - Relasi Kelas

Nama : Muhammad Naufal Haidar Setyawan <br>
NIM : 2241720097 <br>
Kelas : 2C <br>
No. Absen : 18 <br>

## Percobaan 1

Output : <br><br>
<img src = lib/percobaan1_output.png>

Pertanyaan :

1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ? <br>
   **Jawab :** <br>
   Method setter digunakan untuk mengatur value dari atribut private di dalam suatu class, sedangkan method getter digunakan untuk mengambil value dari atribut private di dalam suatu class.
2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ? <br>
   **Jawab :** <br>
   Konstruktor default digunakan untuk membuat objek tanpa menginisiasi value dari atribut class tersebut. Sedangkan konstruktor berparameter digunakan untuk membuat objek sekaligus menginisiasi value dari atribut class.
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ? <br>
   **Jawab :** <br>
   `proc`, yaitu object dari class Processor
4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ? <br>
   **Jawab :** <br>
   Pada atribut proc yang merupakan object dari class Processor.
   ```
   private Processor proc;
   ```
5. Perhatikan pada class Laptop , Apakah guna dari sintaks `proc.info()` ? <br>
   **Jawab :** <br>
   Memanggil method `info()` dari class Processor melalui object proc
6. Pada class MainPercobaan1, terdapat baris kode:

   ```
   Laptop l = new Laptop("Thinkpad", p);
   ```

   Apakah p tersebut ?
   Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:

   ```
   Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
   ```

   Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ? <br>
   **Jawab :** <br>
   p merupakan nama object dari class Processor yang telah dibuat sebelumnya :

   ```
   Processor p = new Processor("Intel i5", 3);
   ```

   Jika kode tersebut diubah sesuai instruksi, maka object p tidak akan terpakai dan akan digantikan oleh object baru yang dikirim melalui parameter.

## Percobaan 2

Output : <br><br>
<img src = lib/percobaan2_output.png>

Pertanyaan :

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ? <br>
   **Jawab :** <br>
   Pada atribut mobil yang merupakan object dari class Mobil dan atribut sopir yang merupakan object dari class Sopir.
   ```
   private Mobil mobil;
   private Sopir sopir;
   ```
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ? <br>
   **Jawab :** <br>
   Pada case sistem rental mobil, maka diperlukan argument hari untuk menghitung biaya rental tersebut pada kedua class (menghitung biaya mobil dan sopir yang dirental). Argument hari dikirim dari objek Pelanggan yang nanti akan dibuat setiap ada pemesanan rental.
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah `mobil.hitungBiayaMobil(hari)` dan `sopir.hitungBiayaSopir(hari)` ? <br>
   **Jawab :** <br>
   Menghitung biaya rental mobil beserta biaya rental sopir pada setiap pemesanan berdasarkan total hari rental.
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks `p.setMobil(m)` dan `p.setSopir(s)` ? <br>
   **Jawab :** <br>
   Mengatur value dari atribut pada object `p` menjadi : <br>
   object `m` untuk atribut mobil dan object `s` untuk atribut sopir.
5. Perhatikan class MainPercobaan2. Untuk apakah proses `p.hitungBiayaTotal()` tersebut ? <br>
   **Jawab :** <br>
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run!

   ```
   System.out.println(p.getMobil().getMerk());
   ```

   Jadi untuk apakah sintaks `p.getMobil().getMerk()` yang ada di dalam method main tersebut? <br>
   **Jawab :** <br>
   Memanggil method `getMerk()` di object `Mobil`, yang mana object tersebut didapat dari memanggil method `getMobil()` pada object p (class Pelanggan). Method getMerk() akan mereturn atribut nama pada object Mobil.

## Percobaan 3

Output : <br><br>
<img src = lib/percobaan3_output.png>

Pertanyaan :

1. Di dalam method info() pada class KeretaApi, baris `this.masinis.info()` dan `this.asisten.info()` digunakan untuk apa ? <br>
   **Jawab :** <br>
   Memanggil method `info()` dari object `masinis` dan `asisten` yang menjadi atribut pada class `KeretaApi`. Method tersebut memiliki output atribut nip dan nama pada object.
2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() !

   ```
   Pegawai masinis = new Pegawai("1234", "Spongebob
   Squarepants");
   KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
   masinis);

   System.out.println(keretaApi.info());
   ```

3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ? <br>
   **Jawab :** <br>
   <img src = lib/percobaan3_pertanyaan3.png> <br>
   Karena pada method `keretaApi.info()` memerlukan adanya atribut asisten.
4. Perbaiki class KeretaApi sehingga program dapat berjalan ! <br>
   **Jawab :** <br>
   Tinggal mengubah method info() :
   ```
   public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
   ```

## Percobaan 4

Output : <br><br>
<img src = lib/percobaan4_output.png>

Pertanyaan :

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?<br>
   **Jawab :** <br>
   10, bisa dilihat dari kode berikut :

   ```
   Gerbong gerbong = new Gerbong("A", 10);
   ```

2. Perhatikan potongan kode pada method `info()` dalam class Kursi. Apa maksud kode tersebut ?

   ```
   ...
   if (this.penumpang != null) {
   info += "Penumpang: " + penumpang.info() + "\n";
   }
   ...
   ```

   **Jawab :** <br>
   Kode tersebut akan mengecek jika ada atribut penumpang (tidak bernilai null) maka akan memanggil method `info()` pada atribut penumpang yang merupakan objek dari class Penumpang.

3. Mengapa pada method `setPenumpang()` dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?<br>
   **Jawab :** <br>
   Karena array dimulai dari index 0, sehingga semisal jika kursi 1 maka pada array kursi 1 berada pada indeks (1-1) yaitu 0.
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan `gerbong.setPenumpang(budi, 1)`. Apakah yang terjadi?<br>
   **Jawab :** <br>
   <img src = lib/percobaan4_pertanyaan4.png>
   Penumpang kursi 1 akan berganti menjadi budi.
5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !<br>
   **Jawab :** <br>
   Mengubah method `setPenumpang()` pada class Gerbong:
   ```
   public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        } else {
            System.out.println("Maaf, kursi " + nomor + " telah ditempati.");
        }
    }
   ```

## Tugas

UML :

<img src = lib/tugas_uml4.png><br>
<img src = lib/tugas_uml1.png><br>
<img src = lib/tugas_uml3.png><br>
<img src = lib/tugas_uml2.png><br>

Code :

1. Class `Prodi` :

   ```
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
   ```

2. Class `Dosen` :

   ```
   package tugas;

   public class Dosen {
      private String nip;
      private String nama;

      public Dosen(String nip, String nama) {
         this.nip = nip;
         this.nama = nama;
      }

      public String getNip() {
         return nip;
      }

      public String getNama() {
         return nama;
      }
   }

   ```

3. Class `Matkul` :

   ```
   package tugas;

   public class Matkul {
      private String kode;
      private String nama;
      private Dosen pengajar;

      public Matkul(String kode, String nama, Dosen pengajar) {
         this.kode = kode;
         this.nama = nama;
         this.pengajar = pengajar;
      }

      public String getKode() {
         return kode;
      }

      public String getNama() {
         return nama;
      }

      public Dosen getPengajar() {
         return pengajar;
      }

   }
   ```

4. Class `Mahasiswa` :

   ```
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
   ```

5. `Main` :

   ```
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
         Matkul matkul4 = new Matkul("GUI", "Desain Interface", dosen3);

         Mahasiswa mahasiswa1 = new Mahasiswa("Naufal", "2241720097", prodi1);
         Mahasiswa mahasiswa2 = new Mahasiswa("Irsyad", "2241730197", prodi2);

         mahasiswa1.ambilMatkul(new Matkul[] { matkul1, matkul2, matkul3, matkul4 });

         mahasiswa1.tampilkanInfo();
         mahasiswa2.tampilkanInfo();
      }
   }
   ```

Output : <br>

<img src = lib/tugas_output.png>
