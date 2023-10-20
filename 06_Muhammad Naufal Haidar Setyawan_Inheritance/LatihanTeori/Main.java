package LatihanTeori;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pj = new PersegiPanjang(10, 10);
        System.out.println("Luas Persegi Panjang : " + pj.luas());
        System.out.println("Keliling Persegi Panjang : " + pj.keliling());

        Lingkaran l = new Lingkaran(10);
        System.out.println("Luas Lingkaran : " + l.luas());
        System.out.println("Keliling Lingkaran : " + l.keliling());

        Segitiga s = new Segitiga(10, 10);
        System.out.println("Luas Segitiga : " + s.luas());
        System.out.println("Keliling Segitiga : " + s.keliling());
    }
}
