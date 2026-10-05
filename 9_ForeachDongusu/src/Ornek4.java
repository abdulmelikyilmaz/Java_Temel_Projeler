public class Ornek4 {
    /*
     * Bir int dizisi olustur.
     * foreach ile sadece cift sayilari ekrana yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
        }
        System.out.println("Elemanlar atandi");

        System.out.println("Cift sayilar bulunuyor");
        for (int i : dizi) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Cift sayilar bulundu");
    }
}
