package Tugas.Overriding;

public class Manusia {
    void bernafas() {
        System.out.println("Manusia bernafas.");
    }

    void makan() {
        System.out.println("Manusia makan.");
    }
}

class Dosen extends Manusia {
    void makan() {
        System.out.println("Dosen makan.");
    }

    void lembur() {
        System.out.println("Dosen lembur.");
    }
}

class Mahasiswa extends Manusia {
    void makan() {
        System.out.println("Mahasiswa makan.");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur.");
    }
}

class Main {
    public static void main(String[] args) {
        Manusia a = new Dosen();
        a.makan();
        a.bernafas();
        Manusia b = new Mahasiswa();
        b.makan();
        b.bernafas();
    }
}