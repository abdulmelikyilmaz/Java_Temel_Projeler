public class Ornek5 {
    /*
     * Bir int dizisi olustur.
     * foreach ile sadece 5'ten buyuk sayilari ekrana yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
        }
        for (int i : dizi) {
            if (i > 5) {
                System.out.println(i);
            }
        }
    }
}
