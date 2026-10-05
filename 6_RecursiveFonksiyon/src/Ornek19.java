public class Ornek19 {
    /*
     * Dongu kullanmadan dizideki tum elemanlarin toplamini recursive olarak
     * hesapla.
     * 
     * Ornek:
     * 
     * [5, 8, 2, 10]
     * 
     * Sonuc = 25
     */
    public static void main(String[] args) {
        int[] dizi = { 5, 8, 2, 10 };
        int index = dizi.length - 1;
        System.out.println("Dizinin eleman toplami: " + topla(dizi, index));
    }

    static int topla(int[] dizi, int index) {
        if (index == 0) {
            return dizi[index];
        }
        return topla(dizi, index - 1) + dizi[index];
    }
}
