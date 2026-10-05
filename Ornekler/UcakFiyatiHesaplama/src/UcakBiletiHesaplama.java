import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        yolcuTanimaVeUcusBilgisi();

    }

    static void yolcuTanimaVeUcusBilgisi() {
        Scanner girdi = new Scanner(System.in);
        int yas;
        int yolculukTipi;
        double kilometre;

        do {
            System.out.print("Yasinizi giriniz:");
            yas = girdi.nextInt();
            System.out.print("Gideceginiz kilometreyi giriniz:");
            kilometre = girdi.nextDouble();
            System.out.println("Yolculuk tipini giriniz:" + "\n1-Gidis" + "\n2-Gidis-Donus");
            yolculukTipi = girdi.nextInt();
        } while (yas < 0 || kilometre < 0 || (yolculukTipi != 1 && yolculukTipi != 2));
        biletFiyatlandirma(yolculukTipi, yas, kilometreFiyati(kilometre));

    }

    static double kilometreFiyati(double kilometre) {
        kilometre = kilometre * 0.10;
        return kilometre;
    }

    static double yas(int yas) {
        if (yas <= 12) {
            return 0.5;
        } else if (yas > 12 && yas <= 24) {
            return 0.9;
        } else if (yas >= 65) {
            return 0.7;
        } else
            return 1;
    }

    static void biletFiyatlandirma(int yolculukTipi, int yas, double kilometre) {
        double toplamBiletFiyati = kilometre;

        if (yolculukTipi == 2) {
            toplamBiletFiyati *= (0.8 * yas(yas)) * 2;
            System.out.println(toplamBiletFiyati);

        } else {
            toplamBiletFiyati *= yas(yas);
            System.out.println(toplamBiletFiyati);
        }

    }
}