public class Ornek24 {
    /*
     * Bir eleman hem solundaki hem sagindaki elemandan buyukse buna local maximum
     * kabul et.
     */
    public static void main(String[] args) {
        int[] dizi = { 2, 7, 3, 8, 4, 9, 1 };
        for (int i = 1; i < dizi.length - 1; i++) {
            if ((dizi[i] > dizi[i - 1]) && (dizi[i] > dizi[i + 1])) {
                System.out.println(dizi[i] + " ");
            }
        }
    }
}
