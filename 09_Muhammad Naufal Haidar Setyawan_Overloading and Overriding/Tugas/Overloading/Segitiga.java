package Tugas.Overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return sisiA + sisiB + (Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println(s.keliling(3, 4));
    }
}
