import java.util.Scanner;

public class ForDongusu {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        ekokBulma();
    }

    // Girilen sayinin asal olup olmadigini soyleyen program
    static void asalMi() {
        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
                break;
            }
        }
        if (sayac == 0) {
            System.out.println("Girilen deger asaldir");
        } else {
            System.out.println("Girilen deger asal degildir");
        }
    }

    // 3 basamaklı armstrong sayilari bul
    // 153 - 371 armstrong sayidir
    static void armstrongSayilar() {
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int basamakDegeri, toplam = 0, sayi2 = sayi;

        for (int i = 1; i <= 3; i++) {
            basamakDegeri = sayi % 10;
            toplam += Math.pow(basamakDegeri, 3);
            sayi /= 10;
        }

        if (toplam == sayi2) {
            System.out.println("Sayimiz armstrong sayidir.");
        } else {
            System.out.println("Sayimiz armstrong sayi degildir.");
        }
    }

    // 100 ile 999 arasındaki armstrong sayilari bul
    static void armstrong() {
        int basamakDegeri, toplam = 0, sayi, sayi2;
        for (int i = 100; i <= 999; i++) {
            sayi = i;
            toplam = 0;
            for (int j = 1; j <= 3; j++) {
                basamakDegeri = sayi % 10;
                toplam += Math.pow(basamakDegeri, 3);
                sayi /= 10;
            }
            if (toplam == i) {
                System.out.println(toplam + " Sayisi armstrong sayidir.");
            }
        }
    }

    static void fibonacciDizisi() {
        System.out.println("Fibonacci dizisinin kacinci basamagina kadar gormek istiyorsunuz");
        int sayi = girdi.nextInt();

        int sayi1 = 0, sayi2 = 1, toplam;

        for (int i = 1; i <= sayi; i++) {
            System.out.println(sayi1 + " ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }

    static void ebobBulma() {
        System.out.print("İlk sayinizi giriniz:");
        int sayi1 = girdi.nextInt();
        System.out.print("İkinci sayinizi giriniz:");
        int sayi2 = girdi.nextInt();

        int enKucukSayi = Math.min(sayi1, sayi2);
        int enBuyukSayi = Math.max(sayi1, sayi2);
        String ortakBolen = "Ortak bolen yoktur";

        for (int i = 1; i <= enKucukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ortakBolen = String.valueOf(i);
            }
        }
        System.out.println(ortakBolen);
    }

    static int ebobBulma(int sayi1, int sayi2) {

        int enKucukSayi = Math.min(sayi1, sayi2);
        int enBuyukSayi = Math.max(sayi1, sayi2);
        int ortakBolen = 1;

        for (int i = 1; i <= enKucukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ortakBolen = i;
            }
        }
        return ortakBolen;
    }

    static void ekokBulma() {
        System.out.print("İlk sayinizi giriniz:");
        int sayi1 = girdi.nextInt();
        System.out.print("İkinci sayinizi giriniz:");
        int sayi2 = girdi.nextInt();
        int ebob = ebobBulma(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("EKOK:" + ekok);
    }
}
