import java.util.Random;
import java.util.random.*;

public class Ornek9 {
    /* Matrisi transpoze ederek ekrana yazdir. */
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] dizi = new int[3][4];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println("Dizi olustruldu ve elemanlar atandi");

        System.out.println("Dizinin elemanlari ise;");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose aliniyor");
        int[][] dizi2 = new int[dizi[0].length][dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi2[j][i] = dizi[i][j];
            }
        }
        System.out.println("Transpose alindi");
        System.out.println();

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
