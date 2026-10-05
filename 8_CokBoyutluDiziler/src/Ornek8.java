import java.util.Random;

public class Ornek8 {
    /*
     * Matriste kac tane cift sayi oldugunu bul.
     * Kac tane tek sayi oldugunu bul.
     * Cift sayilarin toplamini ve tek sayilarin toplamini ayri ayri hesapla.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] dizi = new int[5][5];

        System.out.println("Dizi olusturuldu ve elemanlar atandi");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                dizi[i][j] = rand.nextInt(100) + 1;
            }
        }

        int tekSayisi = 0, ciftSayisi = 0;
        int ciftToplam = 0, tekToplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i][j] % 2 == 0) {
                    ciftSayisi++;
                    ciftToplam += dizi[i][j];
                } else {
                    tekSayisi++;
                    tekToplam += dizi[i][j];
                }
            }
        }

        System.out.println("Dizideki cift sayi adedi: " + ciftSayisi + " toplami: " + ciftToplam);
        System.out.println("Dizideki tek sayi adedi: " + tekSayisi + " toplami: " + tekToplam);

    }
}
