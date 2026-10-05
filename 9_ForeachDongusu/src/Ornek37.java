public class Ornek37 {
    /*
     * arka arkaya gelen artan sayilardan olusan en uzun serinin uzunlugunu bul.
     * 
     * Ornek:
     * 
     * {1, 2, 3, 2, 4, 5, 6, 7, 1}
     * 
     * En uzun seri:
     * 
     * 2, 4, 5, 6, 7
     */
    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 2, 4, 5, 6, 7, 1 };

        int k = 0, kiyaslama = dizi[0], tekrarSayisi = 0, enBuyuk = 0, indisBaslangic = 0, indisBitis = 0;
        for (int i : dizi) {
            k++;
            if (kiyaslama < i) {
                kiyaslama = i;
                tekrarSayisi++;
            } else {
                tekrarSayisi = 1;
                kiyaslama = i;
            }
            if (enBuyuk < tekrarSayisi) {
                enBuyuk = tekrarSayisi;
                indisBaslangic = k - tekrarSayisi;
                indisBitis = k;
            }

        }

        for (int i = indisBaslangic; i < indisBitis; i++) {
            System.out.println(dizi[i]);
        }
    }
}
