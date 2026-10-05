import java.util.Scanner;

public class Ornek6 {
    // Mini ATM

    static int bakiye = 1000;

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hangi islemi yapmak istiyorsunuz?");
        System.out.println("1-Bakiye goruntule\n2-Para yatir\n3-Para cek\n4-Cikis");

        int islem = girdi.nextInt();

        while (islem != 4) {
            switch (islem) {
                case 1 -> {
                    System.out.println("Mevcut bakiyeniz: " + bakiye);
                    System.out.println("Hangi islemi yapmak istiyorsunuz?");
                    System.out.println("1-Bakiye goruntule\n2-Para yatir\n3-Para cek\n4-Cikis\n");
                    islem = girdi.nextInt();
                }
                case 2 -> {
                    System.out.println("Yatirilacak bakiyenizi giriniz:");
                    int yatirilacak = girdi.nextInt();
                    if (yatirilacak < 0) {
                        System.out.println("Yatirilacak bakiye 0'dan dusuk olamaz.");

                    } else {
                        bakiye += yatirilacak;
                        System.out.println("Yeni bakiyeniz: " + (bakiye));
                        System.out.println("Hangi islemi yapmak istiyorsunuz?");
                        System.out.println("1-Bakiye goruntule\n2-Para yatir\n3-Para cek\n4-Cikis\n");
                        islem = girdi.nextInt();
                    }
                }
                case 3 -> {
                    System.out.println("Ne kadar cekmek istiyorsunuz?");
                    System.out.println("Mevcut bakiyeniz: " + bakiye);
                    int cekilecek = girdi.nextInt();
                    if (cekilecek > bakiye) {
                        System.out.println("Cekilmek istenen tutar bakiyenizden fazladir!");

                    } else {
                        bakiye -= cekilecek;
                        System.out.println("Yeni bakiyeniz: " + bakiye);
                        System.out.println("Hangi islemi yapmak istiyorsunuz?");
                        System.out.println("1-Bakiye goruntule\n2-Para yatir\n3-Para cek\n4-Cikis\n");
                        islem = girdi.nextInt();
                    }

                }
                case 4 -> {
                    System.out.println("Cikis yapildi!");
                    break;
                }

            }
        }

    }
}
