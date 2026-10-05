public class Ornek15 {
    /*
     * Bir int[][] jagged array olustur.
     * Her alt dizinin elemanlarini foreach ile gez.
     * Tum elemanlarin toplamini bul.
     */
    public static void main(String[] args) {
        int[][] dizi = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9, 10 },
        };

        int toplam = 0;

        for (int[] i : dizi) {
            for (int j : i) {
                toplam += j;
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}
