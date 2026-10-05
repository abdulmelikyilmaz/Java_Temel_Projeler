import java.util.Scanner;
import java.util.Random;

public class Ornek26 {
    /*
     * Kullanicidan:
     * 
     * katman
     * satir
     * sutun
     * 
     * bilgilerini al ve dinamik olarak 3 boyutlu dizi olustur.
     * 
     * Sonra menu sistemi kur:
     * 
     * 1 - Diziyi yazdir
     * 2 - Toplam hesapla
     * 3 - En buyuk elemani bul
     * 4 - En kucuk elemani bul
     * 5 - Cift sayilari bul
     * 6 - Belirli sayiyi ara
     * 7 - Katman toplamlari
     * 8 - Satir toplamlari
     * 9 - Sutun toplamlari
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Dizinin katman sayisini giriniz: ");
        int katman = girdi.nextInt();
        System.out.print("Dizinin satir sayisini giriniz: ");
        int satir = girdi.nextInt();
        System.out.print("Dizinin sutun sayisini giriniz: ");
        int sutun = girdi.nextInt();

        int[][][] dizi = new int[katman][satir][sutun];
        System.out.println("Dizi olusturuldu");
        System.out.println("Sinirlar tahsis edildi");

        int atanacak, adet = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    atanacak = rand.nextInt(100) + 1;
                    dizi[i][j][k] = atanacak;
                    if (atanacak % 2 == 0) {
                        adet++;
                    }
                }
            }
        }
        int[] ciftSayilar = new int[adet];
        System.out.println("Diziye elemanlar atandi");
        System.out.println();

        System.out.println("Hangi elemani ariyorsunuz?");
        int aranan = girdi.nextInt();
        boolean sonuc = false;

        int toplam = 0, uzunluk = 0;
        int enBuyukEleman = dizi[0][0][0], enKucukEleman = dizi[0][0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    System.out.print(dizi[i][j][k] + " ");
                    toplam += dizi[i][j][k];
                    if (enBuyukEleman < dizi[i][j][k]) {
                        enBuyukEleman = dizi[i][j][k];
                    }
                    if (enKucukEleman > dizi[i][j][k]) {
                        enKucukEleman = dizi[i][j][k];
                    }
                    if (aranan == dizi[i][j][k]) {
                        sonuc = true;
                    }
                    if (dizi[i][j][k] % 2 == 0) {
                        ciftSayilar[uzunluk] = dizi[i][j][k];
                        uzunluk++;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Dizideki elemanlar toplami: " + toplam);
        System.out.println("Dizinin en buyuk elemani: " + enBuyukEleman);
        System.out.println("Dizinin en kucuk elemani: " + enKucukEleman);
        if (!sonuc) {
            System.out.println("Aranan eleman bulunamadi");
        } else {
            System.out.println("Aranan eleman bulundu");
        }
        System.out.println("Dizideki cift elemanlar;");
        for (int i = 0; i < ciftSayilar.length; i++) {
            System.out.print(ciftSayilar[i] + " ");
        }

        int satirToplam = 0, sutunToplam = 0, KatmanToplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    satirToplam += dizi[i][j][k];
                    KatmanToplam += dizi[i][j][k];
                }
                System.out.println("Satir toplam: " + satirToplam);
                satirToplam = 0;
                System.out.println();
            }
            System.out.println();
            System.out.println("Katman toplam: " + KatmanToplam);
            KatmanToplam = 0;
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[i][0].length; k++) {
                for (int j = 0; j < dizi[i].length; j++) {
                    sutunToplam += dizi[i][j][k];
                }

                System.out.println("Sutun toplam: " + sutunToplam);
                sutunToplam = 0;
            }

            System.out.println();
        }

    }
}
