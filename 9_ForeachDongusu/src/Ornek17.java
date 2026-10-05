import java.lang.foreign.AddressLayout;
import java.util.Random;

public class Ornek17 {
    /*
     * En buyuk sayiyi bul.
     * En kucuk sayiyi bul.
     * Ortalamayi bul.
     * Ortalamadan buyuk kac eleman oldugunu bul.
     */
    public static void main(String[] args) {
        int[] dizi = new int[25];
        System.out.println("Dizi olusturuldu");

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(500) + 1;
        }
        System.out.println("Elemanlar atandi");

        int enBuyuk = dizi[0], enKucuk = dizi[0];
        double toplam = 0, elemanSayisi = 0, ortalama = 0;
        int ortalamadanBuyukElemanSayisi = 0;

        for (int i : dizi) {
            elemanSayisi++;
            toplam += i;
            if (i > enBuyuk) {
                enBuyuk = i;
            }
            if (i < enKucuk) {
                enKucuk = i;
            }
        }

        ortalama = (toplam / elemanSayisi);

        for (int i : dizi) {
            if (ortalama < i) {
                ortalamadanBuyukElemanSayisi++;
            }
        }

        System.out.println("En buyuk eleman: " + enBuyuk);
        System.out.println("En kucuk eleman: " + enKucuk);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Ortalamadan buyuk eleman sayisi: " + ortalamadanBuyukElemanSayisi);

    }
}
