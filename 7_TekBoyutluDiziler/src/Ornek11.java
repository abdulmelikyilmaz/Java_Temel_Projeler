import java.util.Random;

public class Ornek11 {
    /*
     * 8 elemanli bir int dizisi olustur.
     * Diziyi kucukten buyuge sirala.
     * Siralanmis diziyi ekrana yazdir
     * ,5,4,9,7
     */
    public static void main(String[] args) {
        int[] dizi = new int[8];
        System.out.println("Dizi olusturuldu!");
        System.out.println();

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Elemanlar atandi!");
        System.out.println();

        System.out.println("**********DİZİ*********");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
        System.out.println();

        int temp;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] < dizi[j]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        System.out.println("Dizi ters cevrildi!");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }
}
