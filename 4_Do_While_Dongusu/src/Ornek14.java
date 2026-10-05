import java.util.Scanner;

public class Ornek14 {
    // Kullanicidan bir sayi al ve en buyuk rakamini bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = girdi.nextInt();

        int temp = sayi % 10;
        int enBuyuk;
        // 537
        do {
            enBuyuk = sayi % 10;
            if (temp < enBuyuk) {
                temp = enBuyuk;
            }
            sayi /= 10;
        } while (sayi > 0);

        System.out.println("Girdiginiz sayinin en buyuk basamagi: " + temp);
    }
}
