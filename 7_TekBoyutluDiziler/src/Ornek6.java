import java.util.Random;

public class Ornek6 {
    /*
     * 10 elemanli bir int dizisi olustur.
     * Dizide kac tane cift sayi oldugunu bul.
     * Dizide kac tane tek sayi oldugunu bul
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Dizi olusturuldu!");

        int tekSayi = 0, ciftSayi = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                ciftSayi++;
            } else {
                tekSayi++;
            }
        }

        System.out.println("Dizideki tek eleman sayisi: " + tekSayi);
        System.out.println("Dizideki cift eleman sayisi: " + ciftSayi);

    }
}
