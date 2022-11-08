public class Lingkaran extends Bangundatar {
    private static final float Pi = 3.14f;
    private int r;

    public float luas(int r) {
        this.r = r;
        return (float) (Lingkaran.Pi*this.r*this.r);
    }
    public float keliling(int r) {
        this.r = r;
        return (float) (2*Lingkaran.Pi*this.r);
    }
}
