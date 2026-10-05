import java.util.Random;
import java.util.Scanner;

public class Ornek20 {
    /*
     * Sadece bir kez gecen sayilari ekrana yazdir.
     * Kac tane olduklarini bul.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dizi kac elemanli olsun?");
        int elemanSayisi = girdi.nextInt();
        int[] dizi = new int[elemanSayisi];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Elemanlar atandi");

        for (int i : dizi) {
            System.out.print(i + " ");
        }

        int tekrarSayisi = 0, adet = 0;

        System.out.println("Sadece 1 kez gcen sayilar");
        for (int i : dizi) {
            for (int j : dizi) {
                if (i == j) {
                    tekrarSayisi++;
                }
            }
            if (tekrarSayisi == 1) {
                System.out.print(i + " ");
                adet++;
            }
            tekrarSayisi = 0;
        }
        System.out.println();
        System.out.println(adet);

    }
}
