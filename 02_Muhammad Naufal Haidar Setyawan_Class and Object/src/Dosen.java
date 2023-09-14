public class Dosen {
    String nip, namaDosen;

    Dosen(String nip, String namaDosen) {
        this.nip = nip;
        this.namaDosen = namaDosen;
    }

    public void tampilData() {
        System.out.println("Nama\t: " + namaDosen);
        System.out.println("NIP\t: " + nip);
    }
}
