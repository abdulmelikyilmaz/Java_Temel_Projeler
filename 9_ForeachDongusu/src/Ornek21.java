import java.util.Random;

public class Ornek21 {
    /*
     * Iki dizide de bulunan ortak sayilari bul.
     * Ortak sayilarin kac tane oldugunu bul.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] dizi = new int[20];
        int[] dizi2 = new int[20];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(100) + 1;
            dizi2[i] = rand.nextInt(100) + 1;
        }

        int sayac = 0;
        for (int i : dizi) {
            for (int j : dizi2) {
                if (i == j) {
                    System.out.println(i);
                    sayac++;
                }
            }
        }
        System.out.println("ortak eleman: " + sayac);

    }
}
