package Tugas;

public class Main {
    public static void main(String[] args) {
        Mac laptopMac = new Mac("Macbook Pro M1", 3, 8, "Apple M1", "A2171", "MAX");
        laptopMac.tampilMac();
        System.out.println("=====================");

        Windows laptopWindows = new Windows("MSI GF63", 3, 8, "Intel i5 gen 10", "8RC-057NL", "Powerful Gaming");
        laptopWindows.tampilWindows();
        System.out.println("=====================");

        Pc pc = new Pc("Asus ROG", 3, 16, "Intel i7 gen 11", 27);
        pc.tampilPc();

    }
}
