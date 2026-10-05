import java.util.Random;
import java.util.random.*;

public class Ornek3 {
    /*
     * 4x5 boyutunda bir int matrisi olustur.
     * 
     * Matrisin icindeki en buyuk sayiyi bul.
     * En buyuk sayinin hangi satir ve sutunda oldugunu da yazdir.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] dizi = new int[4][5];
        System.out.println("Dizi olusturuldu!");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(5000) + 1;
            }
        }
        System.out.println("Elemanlar atandi!");

        int enBuyuk = dizi[0][0], xEkseni = -1, yEkseni = -1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (enBuyuk < dizi[i][j]) {
                    enBuyuk = dizi[i][j];
                    xEkseni = i + 1;
                    yEkseni = j + 1;
                }
            }
        }

        System.out.println("Dizideki en buyuk eleman: " + enBuyuk);
        System.out.println("İndis degerleri ise " + xEkseni + "-" + yEkseni);

    }
}
