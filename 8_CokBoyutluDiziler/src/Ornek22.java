import java.util.Random;

public class Ornek22 {
    /*
     * 3x4x5 boyutunda bir dizi olustur.
     * 
     * Rastgele 1-100 arasinda sayilarla doldur.
     * 
     * Her katman icin:
     * 
     * En buyuk
     * En kucuk
     * Toplam
     * Ortalama
     * 
     * degerlerini bul.
     */
    public static void main(String[] args) {
        int[][][] dizi = new int[3][4][5];
        System.out.println("Dizi olusturuldu");

        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = rand.nextInt(99) + 1;
                }
            }
        }
        System.out.println("Elemanlar atandi");
        System.out.println();
        System.out.println();

        int enBuyuk = dizi[0][0][0], enKucuk = dizi[0][0][0], adet = 0;
        double ortalama = 0, toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            enBuyuk = dizi[i][0][0];
            enKucuk = dizi[i][0][0];
            toplam = 0;
            ortalama = 0;
            adet = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    if (enBuyuk < dizi[i][j][k]) {
                        enBuyuk = dizi[i][j][k];
                    }
                    if (enKucuk > dizi[i][j][k]) {
                        enKucuk = dizi[i][j][k];
                    }
                    toplam += dizi[i][j][k];
                    adet++;
                }
            }
            System.out.println((i + 1) + ". katman icin;");
            System.out.println("En buyuk eleman: " + enBuyuk);
            System.out.println("En kucuk eleman: " + enKucuk);
            System.out.println("Toplam: " + toplam);
            ortalama = (toplam / adet);
            System.out.println("Ortalama: " + ortalama);
            System.out.println();
            System.out.println();
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    System.out.print(dizi[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
