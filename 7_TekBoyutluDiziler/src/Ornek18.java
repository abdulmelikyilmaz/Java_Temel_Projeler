public class Ornek18 {
    /*
     * Bir dizide:
     * 
     * max - min degerini hesapla.
     * 
     * Ama Math.max() ve Math.min() kullanma.
     * 
     * Tum islemi diziyi gezerek kendin yap.
     */
    public static void main(String[] args) {
        int[] dizi = { 8, 3, 6, 1, 4, 3, 9, 6 };
        int enBuyuk = dizi[0], enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (enBuyuk < dizi[i]) {
                enBuyuk = dizi[i];
            }
            if (enKucuk > dizi[i]) {
                enKucuk = dizi[i];
            }
        }
        System.out.println("Dizinin en buyuk degeri: " + enBuyuk);
        System.out.println("Dizinin en kucuk degeri: " + enKucuk);
    }
}
