import java.util.Scanner;
import java.util.spi.ToolProvider;

public class Ornek8 {
    // Ortalama hesapla

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi = girdi.nextInt();
        double toplam = 0;
        int adet = 0;

        while (sayi != 0) {
            toplam += sayi;
            adet++;
            sayi = girdi.nextInt();
        }

        toplam /= adet;

        System.out.println("Sayi ortalamaniz: " + toplam);

    }
}
