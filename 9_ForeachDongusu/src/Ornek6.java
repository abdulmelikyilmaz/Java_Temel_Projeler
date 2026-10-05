public class Ornek6 {
    /*
     * Bir int dizisi olustur.
     * foreach ile dizide kac tane cift sayi oldugunu bul.
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i;
        }
        for (int i : dizi) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
