import java.util.Random;

public class Ornek12 {
    /*
     * 5x5 bir matris olustur.
     * 
     * Matriste:
     * 
     * Ana kosegen toplamını bul.
     * Yan kosegen toplamını bul.
     * Iki kosegende ortak olan elemani hesaba iki kez katma.
     * Kosegenlerde bulunmayan elemanlarin toplamını bul.
     * Sonuclari ekrana yazdir.
     */
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        int elemanSayisi = 0;

        System.out.println(dizi.length + "-" + dizi[0].length + " dizi olusturuldu");
        System.out.println();

        System.out.println("Diziye elemanlar yerlestiriliyor!");
        Random rand = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rand.nextInt(10) + 1;
                elemanSayisi++;
            }
        }
        System.out.println("Diziye elemanlar yerlestirildi!");
        System.out.println();

        System.out.println("Ana kosegen hesaplaniyor!");
        int anaKosegenToplami = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == j) {
                    anaKosegenToplami += dizi[i][j];
                }
            }
        }
        System.out.println("Ana kosegen hesaplandi! Toplam: " + anaKosegenToplami);
        System.out.println();

        System.out.println("Yan kosegen hesaplaniyor!");
        int yanKosegenToplami = 0;
        int k = 4;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = dizi[i].length - 1; j >= 0; j--) {
                yanKosegenToplami += dizi[i][k];
                k--;
                break;
            }
        }
        System.out.println("Yan kosegen hesaplandi! Yan kosegen toplami: " + yanKosegenToplami);
        System.out.println();

        if (elemanSayisi % 2 == 0) {
            elemanSayisi /= 2;
        } else {
            elemanSayisi = (elemanSayisi / 2) + 1;
        }

        int kosegenlerToplami = anaKosegenToplami + yanKosegenToplami;
        System.out.println("Ana ve yan kosegen toplami hesaplaniyor!");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = dizi[i].length - 1; j >= 0; j--) {
                elemanSayisi--;
                if (elemanSayisi == 0) {
                    kosegenlerToplami -= dizi[i][j];
                }
            }
        }
        System.out.println("kosegenler toplami: " + kosegenlerToplami);
        System.out.println();

        System.out.println("Kosegenlerde bulunmayan elemanlar toplami hesaplaniyor!");
        int kosegenlerdeBulunmayanElemanlar = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i != j && i + j != dizi[i].length - 1) {
                    kosegenlerdeBulunmayanElemanlar += dizi[i][j];
                }
            }
        }
        System.out.println("Kosegenlerde bulunmayan elemanlar topami: " + kosegenlerdeBulunmayanElemanlar);
        System.out.println();

        System.out.println("Dizinin elemanlari:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
