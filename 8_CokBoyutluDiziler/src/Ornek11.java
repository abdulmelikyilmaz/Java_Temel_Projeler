import java.util.Random;
import java.util.random.*;
import java.util.Scanner;

public class Ornek11 {
    /*
     * 3x4x5 boyutunda bir dizi olustur.
     * Kullanicidan aranacak bir sayi al.
     * Dizinin tamaminda ara.
     * Sayiyi buldugun zaman katman, satir ve sutun bilgisini yazdir.
     * Sayinin kac kez tekrar ettigini de hesapla.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);
        int[][][] dizi = new int[3][4][5];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = rand.nextInt(100) + 1;
                }
            }
        }
        System.out.println("Elemanlar diziye yerlestirildi!");

        System.out.println("Dizide aranacak elemani giriniz: ");
        int aranacak = girdi.nextInt();
        boolean sonuc = false;
        int xEkseni = -1, yEkseni = -1, zEkseni = -1;

        int tekrarSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    if (aranacak == dizi[i][j][k]) {
                        sonuc = true;
                        xEkseni = i;
                        yEkseni = j;
                        zEkseni = k;
                        tekrarSayisi++;
                    }
                }
            }
        }

        if (sonuc == true) {
            System.out.println(
                    "Aranan eleman " + aranacak + " ilk olarak dizinin " + xEkseni + "-" + yEkseni + "-" + zEkseni
                            + " koordinatlarinda bulundu!");
            System.out.println("tekrar sayisi: " + tekrarSayisi);
        } else {
            System.out.println("Aranan eleman bulunamadi");
        }

    }
}
