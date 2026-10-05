import java.util.Random;
import java.util.Scanner;

public class Ornek10 {
    /*
     * 10 elemanli bir int dizisi olustur.
     * Kullanicidan bir sayi al.
     * Bu sayinin dizide kac kez tekrarlandigini bul.
     * Sonucu ekrana yazdir
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizi olusturuldu");
        int[] dizi = new int[10];
        Random rand = new Random();

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Dizinin elemanlari atandi!");

        System.out.println("Hangi sayiyi ariyorsunuz!");

        int aranan = girdi.nextInt();
        int bulunmaSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (aranan == dizi[i]) {
                bulunmaSayisi++;
            }
        }

        if (bulunmaSayisi != 0) {
            System.out.println("Aranan sayi dizide bulunma sayisi: " + bulunmaSayisi);
        } else {
            System.out.println("Bulunamadi!");
        }

    }
}
