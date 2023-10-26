package Soal5;

public class Buku {
    private String ISBN, judul;
    private Penulis penulis;
    private int harga;

    String getISBN() {
        return ISBN;
    }

    void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    String getJudul() {
        return judul;
    }

    void setJudul(String judul) {
        this.judul = judul;
    }

    int getHarga() {
        return harga;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    Penulis getPenulis() {
        return penulis;
    }

    void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
}
