public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();

        persegi.inputSisi(5);

        persegi.showSisi();
        System.out.println("Luas persegi adalah " + persegi.luasPersegi());
        System.out.println("Keliling persegi adalah " + persegi.kelilingPersegi());
    }
}
