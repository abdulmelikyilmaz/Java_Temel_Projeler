import java.util.Random;
import java.util.random.*;

public class Ornek6 {
    /*
     * Ana kosegendeki elemanlari ekrana yazdir.
     * Ana kosegen elemanlarinin toplamini bul.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        System.out.println("Dizi olusturuldu!");

        Random rand = new Random();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println("Dizinin eleman atamalari yapildi!");

        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == j) {
                    toplam += dizi[i][j];
                    System.out.print(dizi[i][j] + " - ");
                }
            }
        }

        System.out.println();
        System.out.println("Ana kosegen elemanlarin toplami: " + toplam);

    }
}
