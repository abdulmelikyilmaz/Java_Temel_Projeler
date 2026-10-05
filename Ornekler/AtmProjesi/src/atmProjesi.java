import java.util.Scanner;

public class atmProjesi {
    static Scanner girdi = new Scanner(System.in);
    static double bakiye = 800;

    public static void main(String[] args) {
        bilgilendirme();
    }

    static void bilgilendirme() {
        int sayi;
        while (true) {
            System.out.println("Seciminizi yapiniz");
            System.out.println("1-Para yatir\n" +
                    "2-Para cek\n" +
                    "3-Bakiye sorgula\n" +
                    "4-Cikis yap");
            sayi = girdi.nextInt();

            if (sayi == 1) {
                paraYatir();
            } else if (sayi == 2) {
                paraCek();
            } else if (sayi == 3) {
                bakiyeSorgula();
            } else if (sayi == 4) {
                System.out.println("Cikis yapilmistir");
                break;
            } else {
                System.out.println("yanlis tercih.Tekrar dene.");
            }
        }
    }

    static void paraYatir() {
        System.out.print("Yatirmak isteediginiz tutari giriniz: ");
        double tutar;
        while (true) {
            tutar = girdi.nextDouble();
            if (tutar % 1 != 0) {
                System.out.println("Girdiginiz tutar tam sayi olmali. Tekrar deneyiniz.");
            } else {
                if (tutar <= 0) {
                    System.out.println("Gecerli bir tutar giriniz.");
                } else {
                    bakiye += tutar;
                    System.out.println("Yatirma basarili");
                    break;
                }

            }
        }
    }

    static void paraCek() {
        System.out.println("Cekmek istediginiz tutari giriniz:");
        double tutar;
        while (true) {
            tutar = girdi.nextDouble();
            if (tutar % 1 != 0) {
                System.out.println("Cekmek istediginiz tutar tam sayi olmali. Tekrar deneyiniz.");
            } else {
                if (bakiye < tutar) {
                    System.out.println("Bakiyenizde yeterli tutar bulunmamaktadir.Tekrar deneyiniz.");
                } else if (tutar <= 0) {
                    System.out.println("Gecerli bir tutar giriniz.");
                } else {
                    bakiye -= tutar;
                    System.out.println("Cekim basarili!");
                    break;
                }
            }
        }
    }

    static void bakiyeSorgula() {
        System.out.println("Bakiyeniz: " + bakiye + "₺");
    }
}
