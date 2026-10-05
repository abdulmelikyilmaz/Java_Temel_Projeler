import java.util.Scanner;
import java.util.Random;

public class Ornek25 {
    /*
     * Iki matris olustur:
     * 
     * A = 2x3
     * B = 3x2
     * 
     * Bu iki matrisi carp ve sonucu:
     * 
     * C = 2x2
     * 
     * matrisine aktar.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Dizinin x eksenini giriniz: ");
        int xEkseni = girdi.nextInt();
        System.out.println("Dizinin y eksenini giriniz: ");
        int yEkseni = girdi.nextInt();

        int[][] a = new int[xEkseni][yEkseni];
        int[][] b = new int[yEkseni][xEkseni];
        int[][] matrisCarpimi = new int[xEkseni][xEkseni];
        System.out.println("Diziler olusturuldu ve boyutlar hizzalandi");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(9) + 1;
            }
        }
        System.out.println("1. elemanlar atandi");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = rand.nextInt(9) + 1;
            }
        }
        System.out.println("2. elemanlar atandi");

        System.out.println("Matris carpimi hesaplaniyor");
        for (int i = 0; i < matrisCarpimi.length; i++) {
            for (int j = 0; j < matrisCarpimi[i].length; j++) {
                for (int k = 0; k < yEkseni; k++) {
                    matrisCarpimi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Matris carpimi hesaplandi");

        for (int i = 0; i < matrisCarpimi.length; i++) {
            for (int j = 0; j < matrisCarpimi[i].length; j++) {
                System.out.print(matrisCarpimi[i][j] + " ");
            }
            System.out.println();
        }

    }
}
