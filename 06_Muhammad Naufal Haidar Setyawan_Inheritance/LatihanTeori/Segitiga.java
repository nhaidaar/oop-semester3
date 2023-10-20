package LatihanTeori;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        super.luas = alas * tinggi / 2;
        super.keliling = (float) (2 * Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2)) + alas);
    }
}
