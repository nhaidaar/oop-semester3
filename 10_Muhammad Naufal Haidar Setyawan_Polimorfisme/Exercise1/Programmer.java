package Exercise1;

public class Programmer extends Pegawai {
    private int bonus;

    Programmer(String nama, int gaji, int bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    int getGaji() {
        return gaji;
    }

    int getBonus() {
        return bonus;
    }
}
