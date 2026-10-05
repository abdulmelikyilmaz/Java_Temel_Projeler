import java.util.Scanner;

public class Ornek4 {
    /*
     * Kullanicidan 3x3 bir matrisin elemanlarini al.
     * 
     * Scanner kullan.
     * Matrisi ekrana yazdir.
     * Ardindan tum elemanlarin ortalamasini hesapla.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dizinin x ekseni boyutunu giriniz: ");
        int xEkseni = girdi.nextInt();
        System.out.print("Dizinin y eksenini giriniz: ");
        int yEkseni = girdi.nextInt();
        int[][] dizi = new int[xEkseni][yEkseni];

        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = girdi.nextInt();
            }
        }

        double ortalama = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                ortalama += dizi[i][j];
            }
        }

        System.out.println("Dizinin ortalamasi: " + (ortalama / (xEkseni * yEkseni)));

    }
}
