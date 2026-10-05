public class Ornek20 {
    /*
     * Bir integer dizisinin kucukten buyuge sirali olup olmadigini recursive olarak
     * kontrol et.
     * 
     * Ornek:
     * 
     * [2, 5, 8, 12, 20] -> true
     * 
     * [2, 8, 5, 12, 20] -> false
     */
    public static void main(String[] args) {
        int[] dizi = { 2, 5, 8, 12, 20 };
        int index = dizi.length - 1;
        System.out.println(siraliMi(dizi, index));
    }

    static boolean siraliMi(int[] dizi, int index) {
        if (index == 0) {
            return true;
        }
        if (!(dizi[index] > dizi[index - 1])) {
            return false;
        }
        return siraliMi(dizi, index - 1);
    }
}
