package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main. Memanggil semua yang dibutuhkan agar program dapat berjalan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat garisLurus1 = new Koordinat(2, 10, 5, 7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)\nmemiliki gradient sebesar %d%n", garisLurus1.getX1(), garisLurus1.getY1(), garisLurus1.getX2(), garisLurus1.getY2(), garisLurus1.hitungGradient());
        
        Koordinat garisLurus2 = new Koordinat(5, 1, 3, 12);
        System.out.printf("%nGaris yang melalui titik (%d,%d) dan (%d,%d)\nmemiliki gradient sebesar %d%n", garisLurus2.getX1(), garisLurus2.getY1(), garisLurus2.getX2(), garisLurus2.getY2(), garisLurus2.hitungGradient());
    }
    
}
