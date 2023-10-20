package LatihanTeori;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        super.luas = panjang * lebar;
        super.keliling = 2 * (panjang + lebar);
    }

}
