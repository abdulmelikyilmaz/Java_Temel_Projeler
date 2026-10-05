import java.util.Random;
import java.util.Scanner;

public class Ornek38 {
    /*
     * Pozitif sayi sayisini
     * Negatif sayi sayisini
     * Sifir sayisini
     * Pozitiflerin toplamini
     * Negatiflerin toplamini
     * En buyuk pozitif sayiyi
     * En kucuk negatif sayiyi
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dizi kac elemanli olsun");
        int elemanSayisi = girdi.nextInt();
        int[] dizi = new int[elemanSayisi];
        System.out.println("Dizi olusturuldu");

        System.out.println("Elemanlar tanimlaniyor");
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(101) - 50; // -50 ile 50 arasinda degerler uretir
        }
        System.out.println("Elemanlar tanimlandi");

        System.out.println("Dizinin elemanlari; ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        int enBuyuk = dizi[0], enKucuk = dizi[0];
        int pozitifSayi = 0, negatifSayi = 0, sifirSayisi = 0;
        int pozitifToplam = 0, negatifToplam = 0;

        for (int i : dizi) {
            if (enBuyuk < i) {
                enBuyuk = i;
            }
            if (enKucuk > i) {
                enKucuk = i;
            }
            if (i > 0) {
                pozitifSayi++;
                pozitifToplam += i;
            } else if (i < 0) {
                negatifSayi++;
                negatifToplam += i;
            } else {
                sifirSayisi++;
            }
        }

        System.out.println();
        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);
        System.out.println("Pozitif sayi toplami: " + pozitifToplam + " Pozitif sayi Adet: " + pozitifSayi);
        System.out.println("Negatif sayi toplami: " + negatifToplam + " Negatif sayi Adet: " + negatifSayi);
        System.out.println("Sifir sayi adet: " + sifirSayisi);

    }
}
