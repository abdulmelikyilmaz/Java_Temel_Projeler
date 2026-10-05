import java.util.Scanner;

public class Ornek19 {
    // Banka ATM simulasyonu
    static int bakiye = 1000;

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1 → Bakiye gör\n" + //
                "2 → Para çek\n" + //
                "3 → Para yatır\n" + //
                "4 → Çıkış");

        System.out.println("Ne yapmak istiyorsunuz?");
        int islem = girdi.nextInt();

        while (true) {
            if (islem == 1) {
                System.out.println("Bakiyeniz: " + bakiye);
                System.out.println("Ne yapmak istiyorsunuz?");
                islem = girdi.nextInt();
            } else if (islem == 2) {
                System.out.println("Cekilecek tutari giriniz: ");
                int tutar = girdi.nextInt();
                if (tutar <= bakiye) {
                    System.out.println("Cekim basarili ");
                    bakiye -= tutar;
                    System.out.println("Ne yapmak istiyorsunuz?");
                    islem = girdi.nextInt();
                } else {
                    System.out.println("Cekilecek tutar bakiyeden buyuk olamaz");

                }
            } else if (islem == 3) {
                System.out.println("yatirilacak tutari giriniz:");
                int tutar = girdi.nextInt();
                if (tutar >= 0) {
                    bakiye += tutar;
                    System.out.println("Ne yapmak istiyorsunuz?");
                    islem = girdi.nextInt();
                } else {
                    System.out.println("Yatirilacak tutar 0 veya negatif olamaz");
                }
            } else {
                break;
            }
        }

    }
}