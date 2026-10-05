public class Ornek20 {
    /* Bir dizide, saginda bulunan tum elemanlardan buyuk olan elemanlari bul. */
    public static void main(String[] args) {
        int[] dizi = { 4, 2, 11, 9, 8, 7, 3, 5 };
        boolean buyukMu;
        for (int i = 0; i < dizi.length; i++) {
            buyukMu = true;
            for (int j = i + 1; j < dizi.length; j++) {
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
