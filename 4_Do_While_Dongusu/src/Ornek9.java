import java.util.Scanner;

public class Ornek9 {
    // Kullanicidan bir sayi al ve rakamlarinin toplamini hesapla.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = girdi.nextInt();
        if (sayi <= 0) {
            System.out.println("Yanlis sayi girdiniz!");
        } else {
            int rakamlarToplami = 0;
            int basamakDegeri = 0;
            do {
                rakamlarToplami += sayi % 10;
                sayi /= 10;

            } while (sayi > 0);
            System.out.println("Sayinin basamaklari toplami: " + rakamlarToplami);

        }

    }
}
