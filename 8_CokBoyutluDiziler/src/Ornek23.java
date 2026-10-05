import java.util.Random;
import java.util.Scanner;

public class Ornek23 {
    /*
     * 4x5x6 boyutunda rastgele sayilardan olusan bir 3D dizi olustur.
     * 
     * Kullanicidan bir sayi al.
     * 
     * Bu sayinin:
     * 
     * Kacinci katmanda
     * Kacinci satirda
     * Kacinci sutunda
     * 
     * bulundugunu tum tekrarlarıyla birlikte yazdir.
     * 
     * En sonunda toplam kac kez bulundugunu yazdir.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);

        int[][][] dizi = new int[4][5][6];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = rand.nextInt(99) + 1;
                }
            }
        }
        System.out.println("Diziye eleman atandi");

        System.out.println("Hangi sayiyi ariyorsunuz?");
        int arananSayi = girdi.nextInt();
        int bulunmaSayisi = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    if (arananSayi == dizi[i][j][k]) {
                        System.out.println("Aranan sayi;");
                        System.out
                                .println(
                                        (i + 1) + ". katman " + (j + 1) + " satir " + (k + 1) + " sutunda bulunmustur");
                        bulunmaSayisi++;
                    }
                }
            }
        }
        System.out.println("Bulunma sayisi ise: " + bulunmaSayisi);
    }
}
