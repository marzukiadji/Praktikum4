public class Segitiga {
    private int alas, tinggi;

    public float luas(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        return (float) (this.alas * this.tinggi/2);
    }

    public float keliling(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        double sisi = Math.sqrt(this.alas*this.alas + this.tinggi*this.tinggi);
        return (float) (this.alas + this.tinggi + sisi);
    }
}