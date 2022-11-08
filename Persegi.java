public class Persegi extends Bangundatar {
    private int sisi;

    public float luas(int sisi) {
        this.sisi = sisi;
        return (float) (this.sisi*this.sisi);
    }

    public float keliling(int sisi) {
        this.sisi = sisi;
        return (float) (4*this.sisi);
    }
    
}
