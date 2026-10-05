import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        sayilar();
    }

    static void Secenekler() {
        System.out.println("Yapacağiniz islemi seciniz:");
        System.out.print("1-Toplama\n" +
                "2-Cikarma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Sayilari degistir");
    }

    static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    static double bolme(double sayi1, double sayi2) {
        return sayi1 / sayi2;
    }

    static void sayilar() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz:");
        double sayi1 = girdi.nextDouble();
        System.out.print("Sayinizi giriniz:");
        double sayi2 = girdi.nextDouble();
        while (true) {
            Secenekler();
            byte secenek = girdi.nextByte();
            switch (secenek) {
                case 1:
                    System.out.println(toplama(sayi1, sayi2));
                    break;
                case 2:
                    System.out.println(cikarma(sayi1, sayi2));
                    break;
                case 3:
                    System.out.println(carpma(sayi1, sayi2));
                    break;
                case 4:
                    System.out.println(bolme(sayi1, sayi2));
                    break;
                case 5:
                    System.out.print("Sayinizi giriniz:");
                    sayi1 = girdi.nextDouble();
                    System.out.print("Sayinizi giriniz:");
                    sayi2 = girdi.nextDouble();
                    break;
                default:
                    System.out.println("Yanlis tercih yaptiniz. ");
                    break;
            }
        }

    }

}
