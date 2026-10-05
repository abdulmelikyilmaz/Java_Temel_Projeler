public class Ornek13 {
    /*
     * Bir int dizisi olustur.
     * foreach kullanarak ikinci en buyuk sayiyi bulmaya calis.
     */
    public static void main(String[] args) {
        int[] dizi = { 7, 4, 9, 2, 11, 5, 8 };

        int enBuyuk = dizi[0], ikinciEnBuyuk = dizi[0], kontrolEdilecek = dizi[0];

        for (int i : dizi) {
            if (i > enBuyuk) {
                enBuyuk = i;
            }
        }
        for (int i : dizi) {
            if ((ikinciEnBuyuk < i) && enBuyuk != i) {
                ikinciEnBuyuk = i;

            }
        }
        System.out.println("En buyuk: " + enBuyuk);
        System.out.println("Ikinci en buyuk: " + ikinciEnBuyuk);
    }
}
