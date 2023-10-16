# Praktikum 4 - Relasi Kelas

Nama : Muhammad Naufal Haidar Setyawan <br>
NIM : 2241720097 <br>
Kelas : 2C <br>
No. Absen : 18 <br>

## Percobaan 1 (Extends)

Pertanyaan :

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
   **Jawab:** <br>
   Dengan mengubah `public class ClassB {` menjadi `public class ClassB extends ClassA {` pada ClassB.java <br><br>
   <img src = lib/1_jawab1.png> <br>
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! <br>
   **Jawab:** <br>
   Karena awalnya ClassB adalah class yang berdiri sendiri dan tidak mewarisi dari class apapun, sehingga ketika menjalankan program main pada Percobaan1.java program tidak dapat menemukan variabel x dan y pada class B.

## Percobaan 2 (Hak Akses)

Pertanyaan :

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
   **Jawab:** <br>

   <img src = lib/2_jawab1.png> <br>

   - Membuat method getter getX() dan getY() pada ClassA karena atribut pada ClassA bersifat private. <br>

     ```
     public int getX() {
        return x;
     }

     public int getY() {
        return y;
     }
     ```

   - Mengubah `public class ClassB {` menjadi `public class ClassB extends ClassA {` pada ClassB.java
   - Mengganti pemanggilan atribut x dan y pada ClassB menjadi getX() dan getY() <br>

     ```
     public void getJumlah() {
        System.out.println("jumlah:" + (getX() + getY() + z));
     }
     ```

2. Jelaskan apa penyebab program pada percobaan 2 ketika dijalankan terdapat error! <br>
   **Jawab:** <br>
   Karena awalnya ClassB adalah class yang berdiri sendiri dan tidak mewarisi dari class apapun, sehingga ketika menjalankan program main pada Percobaan2.java program tidak dapat menemukan method setter dan getter untuk variabel x dan y pada class B.

## Percobaan 3 (Super)

Pertanyaan :

1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung! <br>
   <img src = lib/3_1.jpg> <br>
   **Jawab:** <br>
   `super` adalah kata kunci untuk merujuk kepada superclass, yang dalam hal ini class Tabung merupakan subclass dari superclass Bangun. Pada method setSuperPhi dan setSuperR, kata kunci `super` digunakan untuk memanipulasi atribut phi dan r pada superclass Bangun yang memiliki access modifier protected.
2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung! <br>
   <img src = lib/3_2.jpg> <br>
   **Jawab:** <br>

   - super.phi merujuk pada atribut phi di superclass Bangun.
   - super.r merujuk pada atribut r di superclass Bangun.
   - this.t merujuk pada atribut t di subclass Tabung.

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut! <br>
   **Jawab:** <br>
   Karena class Tabung adalah subclass dari class Bangun, dan juga atribut phi dan r pada class Bangun memiliki access modifier yang memungkinkan untuk diakses dari class lain.

## Percobaan 4 (Super Constructor)

Pertanyaan :

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya! <br>
   **Jawab:** <br>
   - ClassA adalah superclass.<br> ClassA merupakan kelas dasar dan tidak mewarisi dari kelas lainnya.
   - ClassB adalah subclass dari ClassA.<br> ClassB mengextend dari ClassA sehingga ClassB mewarisi state dan behavior dari Class A.
   - ClassC adalah subclass dari ClassB, dan secara tidak langsung juga merupakan subclass dari ClassA karena ikut mewarisi juga superclass yang ada diatasnya.
2. Ubahlah isi konstruktor default ClassC seperti berikut: <br>
   <img src = lib/4_2.jpg> <br>
   Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya! <br>
   **Jawab:** <br>
   <img src = lib/4_jawab2.png> <br>
   Tidak ada perbedaan dalam hasil output yang dihasilkan.
3. Ublah isi konstruktor default ClassC seperti berikut: <br>
   <img src = lib/4_3_1.jpg> <br>
   Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.
   Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC <br>
   <img src = lib/4_3_2.jpg> <br>
   Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat! <br>
   **Jawab:** <br>
   Saat membuat objek test dari ClassC yang mana subclass dari ClassB, konstruktor ClassB dipanggil. Namun, karena ClassB adalah subclass dari ClassA, maka konstruktor ClassA yang akan dipanggil pertama kali.<br> Setelah konstruktor ClassA dijalankan, konstruktor ClassB akan dipanggil dan dijalankan. Akhirnya, konstruktor dari ClassC (kelas yang sedang diinstansiasi) akan dipanggil setelah konstruktor dari superclassnya (ClassA dan ClassB) selesai dijalankan.
4. Apakah fungsi super() pada potongan program dibawah ini di ClassC! <br>
   <img src = lib/4_4.jpg> <br>
   **Jawab:** <br>
   `super()` adalah pemanggilan yang digunakan untuk memanggil konstruktor dari superclassnya, yaitu ClassB. Namun, hal tsb sudah dilakukan secara otomatis oleh Java. <br> Java akan secara otomatis memasukkan pemanggilan `super();` ke dalam konstruktor kelas ClassC, sehingga konstruktor default dari ClassB (superclass) akan dipanggil sebelum kode dalam konstruktor ClassC dijalankan. Ini adalah perilaku default dalam pewarisan kelas.

## Tugas

Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini. Kemudian buatlah instansiasi objek untuk menampilkan data nama pegawai dan gaji yang didapatkannya.<br>
<img src = lib/Soal_Tugas.png> <br>
**Jawab:** <br>
Sepertinya terjadi kesalahan penulisan pada soal. Pada class Pegawai, method `getGaji()` tidak menunjukkan getter yang jelas pada atribut mana. Sedangkan pada class DaftarGaji, method `getGaji()` dibutuhkan untuk `printSemuaGaji()`.
