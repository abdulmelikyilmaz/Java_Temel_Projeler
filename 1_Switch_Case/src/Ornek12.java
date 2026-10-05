import java.util.Scanner;

public class Ornek12 {
    static double bakiye = 1000;

    // ATM Prototip
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("ATM HOSGELDİNİZ!");

        int hak = 3;
        String atmSifre;

        while (hak > 0) {
            System.out.print("Sifrenizi giriniz: ");
            atmSifre = girdi.nextLine();

            if (atmSifre.equals("melik")) {
                System.out.println("Giris basarili");

                while (true) {
                    System.out.println("\nHangi islemi yapmak istiyorsunuz?");
                    System.out.println("1-Bakiye goruntule\n2-Para yatir\n3-Para cek\n4-Sifre degistir\n5-Cikis");

                    int secim = girdi.nextInt();
                    girdi.nextLine(); // buffer temizleme

                    switch (secim) {
                        case 1 -> System.out.println("Bakiyeniz: " + bakiye);

                        case 2 -> {
                            System.out.print("Yatirilacak tutar: ");
                            int yatir = girdi.nextInt();
                            girdi.nextLine();

                            if (yatir > 0)
                                bakiye += yatir;
                            else
                                System.out.println("Hatalı tutar!");
                        }

                        case 3 -> {
                            System.out.print("Cekilecek tutar: ");
                            int cek = girdi.nextInt();
                            girdi.nextLine();

                            if (cek > 0 && cek <= bakiye) {
                                bakiye -= cek;
                            } else {
                                System.out.println("Yetersiz bakiye!");
                            }
                        }

                        case 4 -> {
                            System.out.print("Yeni sifre: ");
                            atmSifre = girdi.nextLine();
                            System.out.println("Sifre degistirildi (sadece oturum icin)");
                        }

                        case 5 -> {
                            System.out.println("Cikis yapildi");
                            return;
                        }

                        default -> System.out.println("Gecersiz secim");
                    }
                }

            } else {
                hak--;
                System.out.println("Yanlis sifre! Kalan hak: " + hak);

                if (hak == 0) {
                    System.out.println("Hesabiniz bloke olmustur.");
                }
            }
        }

        girdi.close();
    }
}