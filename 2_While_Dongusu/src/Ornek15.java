import java.util.Scanner;

import org.xml.sax.SAXException;

public class Ornek15 {
    // En buyuk sayiyi bul
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sifir girince sistem duracak!");
        System.out.println("Sayinizi giriniz!");
        int sayi = girdi.nextInt();
        int enBuyuk = sayi;

        while (sayi != 0) {
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            sayi = girdi.nextInt();
        }
        System.out.println("En buyuk sayi: " + enBuyuk);

    }
}
