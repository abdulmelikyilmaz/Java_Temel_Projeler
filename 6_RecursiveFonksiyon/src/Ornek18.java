public class Ornek18 {
    /*
     * Bir dizinin elemanlarini recursive fonksiyon ile sondan basa yazdir.
     * 
     * Ornek:
     * 
     * [10, 20, 30, 40, 50]
     * 
     * 50 40 30 20 10
     */
    public static void main(String[] args) {
        int dizi[] = { 10, 20, 30, 40, 50 };
        int index = dizi.length - 1;
        yazdir(dizi, index);
    }

    static void yazdir(int[] dizi, int index) {
        if (index == 0) {
            System.out.print(dizi[index] + " ");
            return;
        }

        yazdir(dizi, index - 1);
        System.out.print(dizi[index] + " ");

    }
}
