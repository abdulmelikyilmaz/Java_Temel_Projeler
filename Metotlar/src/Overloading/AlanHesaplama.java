package Overloading;

import java.util.Scanner;

public class AlanHesaplama {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        alanTercih();
    }

    static void alanTercih() {
        System.out.println("1-Kare alan hesapla\n" +
                "2-Dikdortgen alan hesapla\n" +
                "3-Daire alan hesapla\n" +
                "4-Cikis\n");

        int tercih;

        while (true) {
            tercih = girdi.nextInt();
            if (tercih == 1) {
                System.out.print("Karenin kenar uzunlugunu giriniz:");
                int kenar = girdi.nextInt();
                alanHesapla(kenar);
            } else if (tercih == 2) {
                System.out.print("Dikdortgenin uzun kenarini giriniz:");
                int uzunKenar = girdi.nextInt();
                System.out.print("Dikdortgenin kisa kenarini giriniz:");
                int kisaKenar = girdi.nextInt();
                alanHesapla(uzunKenar, kisaKenar);
            } else if (tercih == 3) {
                System.out.print("Dairenin yaricapini giriniz:");
                double yaricap = girdi.nextDouble();
                alanHesapla(yaricap);
            } else if (tercih == 4) {
                System.out.println("Cikis yapiliyor!");
            } else {
                System.out.println("Yanlis tercih yaptiniz. Tekrar deneyiniz!");
            }
        }
    }

    // Kare
    static void alanHesapla(int kenar) {
        System.out.println("Karenin alani: " + (kenar * kenar));
        alanTercih();
    }

    // Dikdortgen
    static void alanHesapla(int uzunKenar, int kisaKenar) {
        System.out.println("Dikdortgenin alani: " + (uzunKenar * kisaKenar));
        alanTercih();
    }

    // Daire
    static void alanHesapla(double yaricap) {
        System.out.println("Dairenin alani: " + (Math.PI * (Math.pow(yaricap, 2))));
        alanTercih();
    }
}
