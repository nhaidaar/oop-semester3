package Percobaan1;

public class Manager extends Staff {
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("----------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("----------------");
    }

    public void lihatInfo() {
        System.out.println("Manager\t:" + this.getBagian());
        System.out.println("NIP\t:" + this.getNip());
        System.out.println("Nama\t:" + this.getNama());
        System.out.println("Golongan\t:" + this.getGolongan());
        System.out.printf("Tunjangan\t:%.0f\n", this.getTunjangan());
        System.out.printf("Gaji\t:%.0f\n", this.getGaji());
        System.out.println("Bagian\t:" + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
