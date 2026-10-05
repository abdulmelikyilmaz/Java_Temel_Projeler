public class Ornek19 {
    /* Bir dizide, solunda bulunan tum elemanlardan buyuk olan elemanlari bul. */
    public static void main(String[] args) {
        int[] dizi = { 4, 2, 8, 7, 3, 9, 5, 11 };

        boolean buyukMu = true;
        System.out.println(dizi[0]);

        for (int i = 1; i < dizi.length; i++) {
            buyukMu = true;
            for (int j = i - 1; j >= 0; j--) {
                if (dizi[i] < dizi[j]) {
                    buyukMu = false;
                }
            }
            if (buyukMu == true) {
                System.out.println(dizi[i]);
            }
        }
    }

}
