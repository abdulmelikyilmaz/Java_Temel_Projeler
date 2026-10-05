import java.util.Scanner;

public class Ornek14 {
    /*
     * Kullanicidan:
     * 
     * Katman sayisi
     * Satir sayisi
     * Sutun sayisi
     * 
     * bilgilerini al.
     * 
     * Bu bilgilerle 3 boyutlu bir int dizisi olustur.
     * 
     * Daha sonra:
     * 
     * Tum elemanlari kullanicidan al.
     * Tum diziyi katman katman yazdir.
     * Tum elemanlarin toplamini bul.
     * En buyuk elemani bul.
     * En kucuk elemani bul.
     * Cift sayi adedini bul.
     * Tek sayi adedini bul.
     * Kullanici bir sayi girsin ve dizide kac kez tekrar ettigini bul.
     * Aranan sayinin ilk bulundugu katman-satir-sutun konumunu yazdir.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Dizinin katman sayisini giriniz:");
        int katman = girdi.nextInt();
        System.out.print("Dizinin satir sayisini giriniz: ");
        int satir = girdi.nextInt();
        System.out.print("Dizinin sutun sayisini giriniz: ");
        int sutun = girdi.nextInt();
        System.out.println("Dizinin boyut bilgileri alindi");
        System.out.println();

        int[][][] dizi = new int[katman][satir][sutun];
        System.out.println("Dizi olusturuldu");
        System.out.println();

        System.out.println("Dizinin eleman sayisini giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = girdi.nextInt();
                }
            }
        }
        System.out.println("Dizinin eleman sayisi girildi");
        System.out.println();

        System.out.println("Dizi katman katman yazdiriliyor");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Katman: " + (i + 1));
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    System.out.print(dizi[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Dizi yazdirildi");
        System.out.println();

        int elemanlarToplami = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    elemanlarToplami += dizi[i][j][k];
                }
            }
        }
        System.out.println("Tum elemanalrin toplami: " + elemanlarToplami);
        System.out.println();

        System.out.println("En buyuk ve en kucuk eleman bulunuyor");
        int enBuyukEleman = dizi[0][0][0], enKucukEleman = dizi[0][0][0];
        int ciftSayiAdedi = 0, tekSayiAdedi = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    if (enBuyukEleman < dizi[i][j][k]) {
                        enBuyukEleman = dizi[i][j][k];
                    }
                    if (enKucukEleman > dizi[i][j][k]) {
                        enKucukEleman = dizi[i][j][k];
                    }
                    if (dizi[i][j][k] % 2 == 0) {
                        ciftSayiAdedi++;
                    }
                    if (dizi[i][j][k] % 2 != 0) {
                        tekSayiAdedi++;
                    }
                }
            }
        }
        System.out.println("Dizinin en buyuk elemani: " + enBuyukEleman);
        System.out.println("Dizinin en kucuk elemani: " + enKucukEleman);
        System.out.println();
        System.out.println("Tek sayi adedi: " + tekSayiAdedi);
        System.out.println("Cift sayi adedi: " + ciftSayiAdedi);
        System.out.println();
        System.out.println();

        System.out.println("Dizide aradiginiz sayiyi giriniz:");
        int arananSayi = girdi.nextInt(), bulunmaSayisi = 0;
        boolean sonuc = false;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    if (arananSayi == dizi[i][j][k]) {
                        bulunmaSayisi++;
                        sonuc = true;
                    }
                }
            }
        }

        if (!sonuc) {
            System.out.println("Bulunamadi");
        } else {
            System.out.println("Dizide " + arananSayi + " Sayisi " + bulunmaSayisi + " kere bulundu!");
        }

    }
}
