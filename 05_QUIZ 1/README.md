# QUIZ 1

Nama : Muhammad Naufal Haidar Setyawan <br>
NIM : 2241720097 <br>
Kelas : 2C <br>
No. Absen : 18 <br>

## Class dan Object

1. Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek? <br>
   **Jawab :** <br>
   Class adalah blueprint / cetakan dalam membuat sebuah objek. Class berisi state (atribut) dan behavior (method/fungsi) yang menggambarkan suatu entitas.
2. Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java? <br>
   **Jawab :** <br>
   `NamaClass namaObjek = new NamaClass();`
3. Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?<br>
   **Jawab :** <br>
   `Barang laptop = new Barang();`

## Encapsulation

1. Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang. <br>
   **Jawab :** <br>
   Encapsulation adalah pembungkusan atau penyembunyian detail internal suatu objek dari luarannya. Detail internal objek yang dimaksud adalah state (atribut) dan
   behaviornya (method). Hal ini penting karena beberapa alasan, diantaranya terkait
   keamanan data dan memudahkan dalam pengembangan.
   Untuk keamanan data, dengan menggunakan encapsulation Anda dapat membatasi akses
   langsung ke atribut objek. Ini berarti hanya metode-metode tertentu yang dapat
   mengubah nilai atribut. Dalam konteks inventaris barang, ini membantu mencegah
   perubahan yang tidak sah pada data inventaris.
   Lalu dalam hal memudahkan pengembangan, encapsulation berguna jika ada perubahan
   kode maka tidak perlu untuk mengubah semua hal yang berkaitan. Dengan begitu
   kestabilan program dapat terjaga.
   Dalam sistem informasi inventaris barang, encapsulation dapat digunakan untuk
   menyembunyikan atribut seperti harga, jumlah, atau status barang dari pengguna sistem.
   Dengan cara ini, Anda dapat mengontrol dan memvalidasi perubahan pada atribut ini
   sesuai dengan aturan bisnis atau kebijakan yang berlaku.

2. Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang
   harus di-encapsulate dan mengapa. <br>
   **Jawab :** <br> 1. Harga <br>
   Memastikan bahwa harga hanya dapat diubah melalui metode tertentu yang mungkin
   memerlukan validasi, seperti memastikan harga tidak kurang dari nol atau
   menghitung pajak yang sesuai. <br> 2. Jumlah Stok <br>
   Memastikan bahwa perubahan stok hanya dapat terjadi melalui operasi seperti
   penambahan atau pengurangan yang sesuai, dan Anda dapat memvalidasi bahwa stok
   tidak pernah menjadi negatif. <br> 3. Status Barang <br>
   Karena perubahan status ini mungkin mempengaruhi proses lain dalam sistem,
   seperti perhitungan ketersediaan barang atau penyelesaian pesanan.

## Relasi Kelas

1.  Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek? <br>
    **Jawab :** <br>
    Relasi antara kelas dalam pemrograman berorientasi objek adalah hubungan
    yang terjadi antara dua atau lebih kelas. Relasi ini menggambarkan interaksi antara
    kelas-kelas tersebut, baik secara langsung maupun tidak langsung. Ada empat jenis relasi
    yang umum dijumpai, yaitu asosiasi, komposisi, kebergantungan (dependency), dan
    pewarisan (inheritance). Relasi antar kelas dapat digambarkan menggunakan diagram
    kelas
2.  Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi
    antara kelas "Barang" dan kelas "Kategori"? <br>
    **Jawab :** <br>
    Relasi antara Barang dan Kategori dapat digambarkan dengan relasi Asosiasi. <br>
    <img src = lib/1.png>

## PBL

1. Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana
   beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut
   (misalnya, class "Barang"). <br>
   **Jawab :** <br>
   <img src = lib/2.png>

2. Bagaimana Anda akan menggunakan encapsulation untuk melindungi atributatribut
   dalam class tersebut? <br>
   **Jawab :** <br>
   Pada kode diatas terlihat bahwa setiap atribut memiliki access modifier private,
   sehingga tidak dapat diakses langsung dari class lain tanpa menggunakan method setter
   dan getter.
3. Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem
   informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar
   class (misalnya, inheritance atau association) dalam konteks tersebut. <br>
   **Jawab :** <br>
   <img src = lib/3.png>
