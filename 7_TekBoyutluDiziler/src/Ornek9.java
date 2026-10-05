public class Ornek9 {
    /*
     * 8 elemanli bir int dizisi olustur.
     * Dizideki en buyuk sayiyi bul.
     * Dizideki ikinci en buyuk farkli sayiyi bul.
     * Sonuclari ekrana yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = { 5, 9, 1, 9, 8, 3, 5, 12 };

        int enBuyuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (enBuyuk < dizi[i]) {
                enBuyuk = dizi[i];
            }
        }
        int enBuyuk2 = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (enBuyuk2 < dizi[i] && dizi[i] != enBuyuk) {
                enBuyuk2 = dizi[i];
            }
        }

        System.out.println("En buyuk degerler arasindaki fark: " + (enBuyuk - enBuyuk2));
    }
}
