public class Ornek3 {
    /*
     * 6 elemanli bir int dizisi olustur.
     * Dizideki tum sayilarin toplamini bul.
     * Dizinin ortalamasini hesaplayip ekrana yazdir
     */
    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 4, 5, 6 };
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("Dizideki elemanlarin toplami: " + toplam);
        System.out.print("Dizinin ortalamasi: " + (toplam / (dizi.length - 1)));

    }
}
