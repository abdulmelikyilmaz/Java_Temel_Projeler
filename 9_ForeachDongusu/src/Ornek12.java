import java.util.Random;

public class Ornek12 {
    /*
     * Bir int dizisi olustur.
     * foreach ile dizideki tek sayilarin ortalamasini hesapla.
     */
    public static void main(String[] args) {
        int[] dizi = new int[20];
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10);
        }

        int toplam = 0, adet = 0;
        for (int i : dizi) {
            if (i % 2 != 0) {
                toplam += i;
                adet++;
            }
        }

        System.out.println("Tek sayi ortalamasi: " + (toplam / adet));

    }
}
