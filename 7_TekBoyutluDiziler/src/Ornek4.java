import java.util.Scanner;

public class Ornek4 {
    /*
     * n elemanli bir int dizisi olustur.
     * Dizinin degerlerini kullanicidan al
     * Dizideki en buyuk sayiyi bul.
     * Dizideki en kucuk sayiyi bul.
     * Sonuclari ekrana yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun?");
        int elemanSayisi = girdi.nextInt();
        int[] dizi = new int[elemanSayisi];

        System.out.println("Dizi olusturuldu!");
        System.out.println();
        int diziDegerleri;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanini giriniz: ");
            diziDegerleri = girdi.nextInt();
            dizi[i] = diziDegerleri;
        }
        System.out.println("Dizi elemanlari tanimlandi!");

        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }
        System.out.println();
        System.out.println("Dizinin en buyuk ve en kucuk elemanlari bulundu!");
        System.out.println("Dizinin en buyuk elemani: " + enBuyuk);
        System.out.println("Diziin en kucuk elemani: " + enKucuk);

    }
}
