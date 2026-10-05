import java.util.Scanner;

public class Ornek14 {
    // Us alma
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println("Ussunuzu giriniz: ");
        int us = girdi.nextInt();

        int sonuc = 1;

        while (us != 0) {
            sonuc *= sayi;
            us--;
        }
        System.out.println("Sonuc: " + sonuc);

    }
}