public class Main {
    public static void main(String[] args) {
        // Membuat Object
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();
        System.out.println();
        
        // Memanggil Method
        System.out.println("Luas Lingkaran = " + lingkaran.luas(14));
        System.out.println("Keliling Lingkaran = " + lingkaran.keliling(14));

        System.out.println();

        System.out.println("Luas Segitiga = " + segitiga.luas(10,15));
        System.out.println("Keliling Segitiga = " + segitiga.keliling(10,15));

        System.out.println();

        System.out.println("Luas Persegi = " + persegi.luas(20));
        System.out.println("Keliling Persegi = " + persegi.keliling(20));

    }
}
