import java.util.Scanner;

public class Ornek10 {
    // Sayinin rakamlari toplami
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();

        // 123

        int kalan = 0, toplam = 0;

        while (true) {
            if (sayi > 0) {
                kalan = sayi % 10;
                sayi /= 10;
                toplam += kalan;
            } else {
                break;
            }
        }

        System.out.println("Basamak toplami: " + toplam);
    }
}