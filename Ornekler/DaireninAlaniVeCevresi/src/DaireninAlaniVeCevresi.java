import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args) {
        // Dairenin alani : A=πr^2
        // Dairenin cevresi : C=2πr

        Scanner girdi = new Scanner(System.in);

        while (true) {

            System.out.println("Dairenin nesini hesaplayacaksiniz?\n" +
                    "1-Cevresi\n" +
                    "2-Alani\n" +
                    "3-Hepsini\n" +
                    "4-Cikis");

            byte secim = girdi.nextByte();
            if (secim == 1) {
                System.out.print("Dairenin yaricap'ini giriniz:");
                float yaricap = girdi.nextFloat();
                System.out.println("Dairenin cevresi : " + cevreHesaplama(yaricap));
            } else if (secim == 2) {
                System.out.print("Dairenin yaricap'ini giriniz:");
                float yaricap = girdi.nextFloat();
                System.out.println("Dairenin alani " + alanHesaplama(yaricap));
            } else if (secim == 3) {
                System.out.print("Dairenin yaricap'ini giriniz:");
                float yaricap = girdi.nextFloat();
                System.out.println(
                        "Dairenin cevresi ve alani : " + cevreHesaplama(yaricap) + " - " + alanHesaplama(yaricap));
            } else if (secim == 4) {
                break;
            } else {
                System.out.println("Yanlış tercih yaptınız tekrar deneyiniz.");
            }

        }

    }

    static double cevreHesaplama(float yaricap) {
        double cevre = 2 * Math.PI * yaricap;
        return cevre;
    }

    static double alanHesaplama(float yaricap) {
        double alan = Math.PI * Math.pow(yaricap, 2);
        return alan;
    }

}
