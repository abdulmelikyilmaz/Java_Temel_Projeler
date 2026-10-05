import java.util.Random;

public class Ornek12 {
    /*
     * 10 elemanli bir int dizisi olustur.
     * Dizideki tekrar eden sayilari tespit et.
     * Her sayinin kac kez tekrarlandigini ekrana yazdir
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Dizi olusturuldu ve elemanlar atandi!");
        System.out.println();

        int[] dizi2 = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    dizi2[i] += 1;
                }
            }
        }

        boolean yazdirma;
        for (int i = 0; i < dizi.length; i++) {
            yazdirma = false;
            for (int j = 0; j < i; j++) {
                if (dizi[i] == dizi[j]) {
                    yazdirma = true;
                }
            }
            if (yazdirma == false) {
                System.out.println(dizi[i] + ". elemanin tekrar sayisi : " + dizi2[i]);
            }
        }

    }
}
