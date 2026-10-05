import java.util.Random;

public class Ornek19 {
    /* Matrisi 90 derece saat yonunde dondur. */
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] dizi = new int[5][5];
        System.out.println("Dizi olusturuldu");
        System.out.println();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(9) + 1;
            }
        }
        System.out.println("Elemanlar atandi");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        int[][] dizi2 = new int[dizi.length][dizi[0].length];
        System.out.println("Dizi 90 derece donduruluyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi2[j][dizi.length - i - 1] = dizi[i][j];
            }
        }

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
