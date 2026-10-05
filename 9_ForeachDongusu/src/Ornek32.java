public class Ornek32 {
    /*
     * Basamak sayisini bul.
     * Basamaklarinin toplamini bul.
     */
    public static void main(String[] args) {
        int[] dizi = { 123, 45, 789, 1 };
        System.out.println("Dizi olusturuldu");

        int basamakSayisi = 0, basamakToplami = 0;
        for (int i : dizi) {
            System.out.print(i + " sayisinin ");
            while (i > 0) {
                basamakSayisi++;
                basamakToplami += i % 10;
                i /= 10;
            }
            System.out.println("basamak sayisi: " + basamakSayisi + " basamak toplami: " + basamakToplami);
            basamakSayisi = 0;
            basamakToplami = 0;
        }
    }
}
