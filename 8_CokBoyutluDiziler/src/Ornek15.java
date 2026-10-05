import java.util.Random;

public class Ornek15 {
    /*
     * 5x5 bir matris olustur.
     * 
     * Her satirdaki en buyuk elemani bul ve yazdir.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        System.out.println("Dizi olusturuldu");

        Random rand = new Random();
        System.out.println("Dizinin elemanlari ataniyor");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println("Dizinin elemanlari atanmasi basarili");

        System.out.println();
        System.out.println("Dizinin elemanlari:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Satirin en buyuk elemanlari bulunuyor");
        int enBuyuk = dizi[0][0];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] > enBuyuk) {
                    enBuyuk = dizi[i][j];
                }
            }
            System.out.println("Dizinin " + (i + 1) + " satirinin en buyuk elemani: " + enBuyuk);
            if (i < dizi.length - 1) {
                enBuyuk = dizi[i + 1][0];
            }
        }

    }
}
