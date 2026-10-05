import java.util.Scanner;
import java.math.*;

public class Diziler {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        ortalamaHesaplama();
    }

    static void ortalamaHesaplama() {
        System.out.println("Kac tane dersiniz var?");
        int dersSayisi = girdi.nextInt();
        int[] notOrtalamasi = new int[dersSayisi];

        System.out.println("Ortalamanizi giriniz:");
        int notlarim;
        for (int i = 0; i < notOrtalamasi.length; i++) {
            notlarim = girdi.nextInt();
            notOrtalamasi[i] = notlarim;
        }

        int toplam = 0;
        for (int i = 0; i < notOrtalamasi.length; i++) {
            toplam += notOrtalamasi[i];
        }

        double ortalama = toplam / dersSayisi;
        System.out.println("Not ortalamaniz: " + ortalama);

    }

    // 3X3 dizi ekrana yazdirma
    static void dizi3X3() {
        int sayi = 1;
        int[][] dizi = new int[3][3];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                dizi[i][j] = sayi++;
            }

        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void dizi2X2() {
        int[][] dizi = new int[2][2];
        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.println("Dizinin " + i + ". satırın " + j + ". sütununu giriniz:");
                dizi[i][j] = girdi.nextInt();
            }
        }
        System.out.println("--------DİZİNİN ELEMANLARI---------");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void satirToplami() {
        double dizi[][] = new double[4][4];
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = Math.random() * 100;
                toplam += dizi[i][j];
            }
            System.out.println((i + 1) + ". satirin toplami: " + toplam);
            toplam = 0;
        }

        System.out.println("--------Dizinin elemanlari-----------");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + " - ");
            }
            System.out.println();
        }

    }

    static void sutunToplami() {
        int satir, sutun;
        System.out.println("Dizinin satir sayisini gir");
        satir = girdi.nextInt();
        System.out.println("Dizinin sutun sayisini giriniz:");
        sutun = girdi.nextInt();
        int dizi[][] = new int[satir][sutun];
        int sutunToplami[] = new int[sutun];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = (int) (Math.random() * 100);
                sutunToplami[j] += dizi[i][j];
            }
        }
        System.out.println("--------Dizinin elemanlari-----------");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("---------Sutunlarin toplami-----------");
        for (int i = 0; i < sutunToplami.length; i++) {
            System.out.print(sutunToplami[i] + " ");
        }

    }

    static void enBuyukEnKucuk() {
        int satir, sutun;
        System.out.println("Dizinin satir sayisini giriniz:");
        satir = girdi.nextInt();
        System.out.println("Dizinin sutun sayisini giriniz:");
        sutun = girdi.nextInt();

        int dizi[][] = new int[satir][sutun];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = (int) (Math.random() * 100);
            }
        }

        int enBuyuk = dizi[0][0], enKucuk = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (enBuyuk < dizi[i][j]) {
                    enBuyuk = dizi[i][j];
                }
                if (enKucuk > dizi[i][j]) {
                    enKucuk = dizi[i][j];
                }
            }
        }

        System.out.println("---------Dizinin elemanlari--------");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Dizinin en buyuk elemani: " + enBuyuk);
        System.out.println("Dizinin en kucuk elemani: " + enKucuk);

    }

    static void transpose() {
        int satir, sutun;
        System.out.println("Dizinin satir sayisini giriniz:");
        satir = girdi.nextInt();
        System.out.println("Dizinin sutun sayisini giriniz:");
        sutun = girdi.nextInt();

        int[][] dizi = new int[satir][sutun];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("\nİlk dizi------");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

        int dizi2[][] = new int[sutun][satir];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi2[j][i] = dizi[i][j];
            }
        }
        System.out.println();
        System.out.println("İkinci dizi");
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void ucBoyutlu() {
        int satir, sutun, derinlik;
        System.out.println("Dizinin satir sayisini giriniz:");
        satir = girdi.nextInt();
        System.out.println("Dizinin sutun sayisini giriniz:");
        sutun = girdi.nextInt();
        System.out.println("Dizinin derinligini giriniz:");
        derinlik = girdi.nextInt();

        int[][][] dizi = new int[satir][sutun][derinlik];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        System.out.println("Dizinin elemanlari");
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

    // 3 boyutlu dizi
    static void okulNotu() {
        int dizi[][][] = new int[3][3][4];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    dizi[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        System.out.println("Dizinin elemanlari-------");

        int genelToplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            int okulToplam = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    okulToplam += dizi[i][j][k];
                }
            }
            System.out.println((i + 1) + ". okulun toplamı: " + okulToplam);
            genelToplam += okulToplam;
        }
        System.out.println("Tüm okulların toplamı: " + genelToplam);
    }

}