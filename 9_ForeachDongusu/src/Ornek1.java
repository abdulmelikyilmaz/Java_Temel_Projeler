public class Ornek1 {
    /*
     * Bir int dizisi olustur
     * foreach kullanarak tum elemanlari ekrana yazdir.
     */
    public static void main(String[] args) {
        int[] dizi = new int[5];
        System.out.println("Dizi olusturuldu");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
        }
        System.out.println("Elemanlar atandi");

        for (int i : dizi) {
            System.out.print(i + " ");
        }

    }
}