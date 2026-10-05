import java.util.Scanner;

public class Ornek23 {
    // Kullanici dogru sifreyi girene kadar sifre istemeye devam et. Kullanici 3 kez
    // yanlis girerse program sonlansin.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int yanlisGirim = 0;

        System.out.print("Sifrenizi giriniz: ");
        String sifre = girdi.nextLine();

        do {
            if (sifre.equals("123")) {
                System.out.println("Sifre dogru!");
                break;
            } else {
                System.out.println("Sifre yanlis tekrar deneyiniz!");
                ++yanlisGirim;
                System.out.println("Yanlis girim sayisi: " + yanlisGirim);
                sifre = girdi.nextLine();
            }
        } while (yanlisGirim < 3);
        if (yanlisGirim == 3) {
            System.out.println("Hesabiniz bloke oldu");
        }
    }
}
