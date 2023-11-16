package Exercise1;

public class Bayaran {
    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();
        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();
        } else {
            uang += ((Programmer) pg).getBonus();
        }
        return uang;
    }
}
