package Jobsheet2;

public class Tugas1 {
    public static void main(String[] args) {
        Member member1 = new Member();
        member1.idMember = 1;
        member1.namaMember = "Rafi";
        member1.tampilDataMember();

        Game game1 = new Game();
        game1.namaGame = "Super Mario BROS";
        game1.hargaGame = 10000;
        game1.tampilDataGame();

        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.idMember = 1;
        peminjaman1.lamaSewa = 7; // hari
        peminjaman1.tampilDataPeminjaman(game1.namaGame, game1.hargaGame);
    }

}
