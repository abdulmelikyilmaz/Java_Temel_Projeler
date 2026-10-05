import java.util.Scanner;

public class mayinTarlasi {
    static Scanner girdi = new Scanner(System.in);
    static int boy, en, zorlukDerecesi, mayinYogunlugu, kareSayisi;
    static double oran;
    static int[][] mayinTarlasiHaritasi;

    public static void main(String[] args) {
        mayinTarlasiOlustur();
        mayinYogunlugu();
        mayinyerlestirme();
        System.out.println();
        mayinTarlasiYazdirma(); // mayinlari gormek istersen acabilirsin
        System.out.println();
        mayinOyunu();

    }

    static void mayinTarlasiOlustur() {
        while (true) {
            System.out.println("Mayin tarlasinin boyunu giriniz:");
            boy = girdi.nextInt();
            System.out.println("mayin tarlasinin enini giriniz:");
            en = girdi.nextInt();
            if ((boy < 0 || en < 0)) {
                System.out.println("Lutfen negatif sayi girmeyiniz.");
            } else if (boy == 0 || en == 0) {
                System.out.println("Lutfen 0 girmeyiniz");
            } else if (boy == 1 && en == 1) {
                System.out.println("Lutfen en ve boyu 1 girmeyiniz. En az bir tanesi farkli olsun.");
            } else if (boy > 10 || en > 10) {
                System.out.println("Lutfen daha kucuk sayi giriniz");
            } else {
                break;
            }
        }
        System.out.println(boy + " - " + en + " mayin tarlasi olusturuldu");
        mayinTarlasiHaritasi = new int[boy][en];
    }

    static void mayinYogunlugu() {
        System.out.println("\nZorluk Derecesi");
        System.out.println("1-Kolay" +
                "\n2-Orta" +
                "\n3-Zor");
        while (true) {
            zorlukDerecesi = girdi.nextInt();
            if (zorlukDerecesi > 3 || zorlukDerecesi < 1) {
                System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz");
                continue;
            } else {
                if (zorlukDerecesi == 1) {
                    oran = 0.15;
                } else if (zorlukDerecesi == 2) {
                    oran = 0.20;
                } else {
                    oran = 0.25;
                }
                mayinYogunlugu = (int) Math.round(boy * en * oran);
                if (mayinYogunlugu < 1) {
                    mayinYogunlugu = 1;
                }
                break;
            }
        }
    }

    static void mayinyerlestirme() {

        // Heryeri 0 yaptik
        for (int i = 0; i < mayinTarlasiHaritasi.length; i++) {
            for (int j = 0; j < mayinTarlasiHaritasi[i].length; j++) {
                mayinTarlasiHaritasi[i][j] = 0;
            }
        }

        int yerlesenMayin = 0;

        // Mayinlarimizi yerlestirdik (1)
        while (yerlesenMayin < mayinYogunlugu) {
            int randomBoy = (int) (Math.random() * boy);
            int randomEn = (int) (Math.random() * en);

            if (mayinTarlasiHaritasi[randomBoy][randomEn] == 0) {
                mayinTarlasiHaritasi[randomBoy][randomEn] = 1;
                yerlesenMayin++;
            }
        }

    }

    static void mayinTarlasiYazdirma() {
        for (int i = 0; i < mayinTarlasiHaritasi.length; i++) {
            for (int j = 0; j < mayinTarlasiHaritasi[i].length; j++) {
                System.out.print(mayinTarlasiHaritasi[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mayinOyunu() {
        kareSayisi = (boy * en) - mayinYogunlugu;
        System.out.println("Mayin oyunu başlatiliyor");

        while (kareSayisi != 0) {
            System.out.println("Bir x-y koordinati giriniz:");
            int x, y;
            x = girdi.nextInt() - 1;
            y = girdi.nextInt() - 1;

            if (x >= boy || x < 0 || y >= en || y < 0) {
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (mayinTarlasiHaritasi[x][y] == -1) {
                System.out.println("Bu hucre zaten acik");
                continue;
            }

            if (mayinTarlasiHaritasi[x][y] == 1) {
                System.out.println("Mayina bastiniz!");
                break;
            }
            mayinTarlasiHaritasi[x][y] = -1;
            kareSayisi--;

            System.out.println("Mayin degil");
            mayinTarlasiYazdirma();

            if (kareSayisi == 0) {
                System.out.println("Kazandiniz!");
            }

        }
    }

}
