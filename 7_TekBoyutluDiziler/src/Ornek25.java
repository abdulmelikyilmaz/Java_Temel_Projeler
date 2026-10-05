public class Ornek25 {
    /*
     * Bir eleman hem solundaki hem sagindaki elemandan kucukse buna local minimum
     * kabul et.
     */
    public static void main(String[] args) {
        int[] dizi = { 5, 2, 8, 3, 9, 4, 7 };
        for (int i = 1; i < dizi.length - 1; i++) {
            if ((dizi[i] < dizi[i - 1]) && (dizi[i] < dizi[i + 1])) {
                System.out.println(dizi[i] + " ");
            }
        }
    }
}
