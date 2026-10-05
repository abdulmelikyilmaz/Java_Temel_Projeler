public class Ornek27 {
    /* Bir dizide tekrar eden elemanlari kaldir. */
    public static void main(String[] args) {
        int[] dizi = { 4, 2, 4, 7, 2, 9, 7 };
        boolean bulunduMu = false;
        int[] dizi2 = new int[dizi.length];
        int k = 0;
        for (int i = 0; i < dizi.length; i++) {
            bulunduMu = false;
            for (int j = dizi.length - 1; j > i; j--) {
                if (dizi[i] == dizi[j]) {
                    bulunduMu = true;
                }
            }
            if (bulunduMu == false) {
                dizi2[k] = dizi[i];
                k++;
            }
        }

        for (int i = 0; i < dizi2.length - k + 1; i++) {
            if (dizi[i] != 0) {
                System.out.println(dizi2[i]);
            }
        }
    }
}
