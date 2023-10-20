package LatihanTeori;

public class Lingkaran extends BangunDatar {
    private float r;

    Lingkaran(float r) {
        this.r = r;
        super.luas = (float) (Math.PI * r * r);
        super.keliling = (float) (2 * Math.PI * r);
    }
}
