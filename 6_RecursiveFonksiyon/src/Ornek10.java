public class Ornek10 {
    /*
     * 10. Dizideki en buyuk elemani bulma
     * 
     * Bir integer dizisindeki en buyuk elemani recursive olarak bul.
     * 
     * Ornek:
     * 
     * [4, 17, 2, 9, 31, 8]
     * 
     * Sonuc = 31
     * 
     * Dongu kullanmamaya calis.
     */
    public static void main(String[] args) {
        System.out.println("En buyuk: " + enBuyuk(dizi));
    }

    static int[] dizi = { 4, 17, 2, 9, 31, 8 };
    static int enBuyuk = dizi[0];
    static int uzunluk = dizi.length - 1;

    static int enBuyuk(int[] dizi) {
        if (uzunluk == 0) {
            if (dizi[uzunluk] > enBuyuk) {
                enBuyuk = dizi[uzunluk];
                return enBuyuk;
            }
            return enBuyuk;
        }
        if (enBuyuk < dizi[uzunluk]) {
            enBuyuk = dizi[uzunluk];
        }
        uzunluk = uzunluk - 1;
        return enBuyuk(dizi);
    }
    // AI'den yardım aldım
}
