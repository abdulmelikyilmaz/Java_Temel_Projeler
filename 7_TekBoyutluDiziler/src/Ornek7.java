public class Ornek7 {
    /*
     * 8 elemanli bir int dizisi olustur.
     * Dizinin elemanlarini normal sirayla yazdir.
     * Daha sonra ayni diziyi sondan basa dogru yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Dizi olusturuldu!");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        System.out.println();
        System.out.println("Dizi ters cevrildi!");
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i] + " ");
        }

    }
}
