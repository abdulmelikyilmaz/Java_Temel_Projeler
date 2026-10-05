import java.util.Scanner;

public class whileDongusu {

    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        ucgen();
    }

    // Birden yuze kadar olan cift sayilari yazdiran while dongusu
    static void birdenYuze() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // Negatif bir deger girilene kadar kullanıcıdan girdi alan ve tek sayi
    // girdilerini toplayan program
    static void tekSayiGirdi() {
        int sayi, toplam = 0;
        while (true) {
            System.out.print("Sayinizi giriniz:");
            sayi = girdi.nextInt();
            if (sayi >= 0) {
                if (sayi % 2 != 0) {
                    toplam += sayi;
                } else {

                }
            } else {
                break;
            }
        }
        System.out.println("Tekli sayilarin toplami: " + toplam);
    }

    // Girilen sayiya kadar olan ikinin kuvvetleri
    static void ikininKuvvetleri() {

        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        double kuvvetler = 0;

        int i = 1;
        while (true) {
            kuvvetler = Math.pow(2, i);
            if (kuvvetler <= sayi) {
                System.out.println(kuvvetler);
                i++;
            } else {
                break;
            }
        }
    }

    // Faktoriyel hesaplama
    static void Faktoriyel() {
        System.out.println("Kac haneye kadar faktoriyel hesaplansin.");
        int faktoriyelAdimi = girdi.nextInt();
        int faktoriyel = 1;
        int i = 1;
        while (i <= faktoriyelAdimi) {
            faktoriyel *= i;
            i++;
        }
        System.out.println("Faktoriyel sonucunuz:" + faktoriyel);
    }

    // Harmonik sayilar
    static void harmonik() {
        System.out.print("Harmonik basamak sayinisini giriniz");
        int harmonik = girdi.nextInt();
        double toplam = 0;
        int i = 1;
        while (i <= harmonik) {
            toplam += 1.0 / i;
            i++;
        }
        System.out.println("Harmonik sayinin toplami:" + toplam);
    }

    // sola yapisik ucgen yapma
    static void ucgen() {
        System.out.println("Kac basamakli ucgen olsun?");
        int basamakSayisi = girdi.nextInt();
        int i = 1;

        while (i <= basamakSayisi) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
