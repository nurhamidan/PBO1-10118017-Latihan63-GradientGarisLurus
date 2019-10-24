package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah implementasi dari interface GarisLurus.
 * 
 */
public class Koordinat implements GarisLurus {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Koordinat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    @Override
    public int hitungGradient() {
        return (y2 - y1) / (x2 - x1);
    }
}
