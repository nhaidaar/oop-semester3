package tugas;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        int inputMenu;
        do {
            System.out.println("=======================");
            System.out.println("Nama Anggota: " + donny.getNama());
            System.out.println("Jumlah Pinjaman: " + donny.getJumlahPinjaman());
            System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
            listMenu();
            inputMenu = sc.nextInt();
            switch (inputMenu) {
                case 1:
                    System.out.print("Masukkan jumlah peminjaman : ");
                    int pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran : ");
                    int angsur = sc.nextInt();
                    donny.angsur(angsur);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan salah!");
                    break;
            }
        } while (inputMenu != 3);
    }

    public static void listMenu() {
        System.out.println("=======================");
        System.out.println("1. Ajukan Pinjaman");
        System.out.println("2. Bayar Angsuran");
        System.out.println("3. Keluar program");
        System.out.println("=======================");
        System.out.print("Pilih menu : ");
    }

}
