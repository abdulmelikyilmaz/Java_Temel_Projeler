import java.util.Random;
import java.util.random.*;

public class Ornek10 {
    /*
     * 2x3x4 boyutunda bir int dizisi olustur.
     * 
     * Tum elemanlari 1 ile 24 arasindaki sayilarla doldur.
     * Tum elemanlari ekrana yazdir.
     * Tum elemanlarin toplamini hesapla.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[][][] dizi = new int[2][3][4];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = rand.nextInt(24) + 1;
                }
            }
        }

        System.out.println("Elemanlar diziye yerlestirildi!");
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    System.out.println(dizi[i][j][k] + " ");
                    toplam += dizi[i][j][k];
                }
                System.out.print("-");
            }
            System.out.println();
        }

        System.out.println("Dizinin elemanlari toplami: " + toplam);

    }
}
