import java.util.Scanner;

public class Ornek20 {
    // Girilen sayilardan sadece negatifleri kabul etme
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int toplam = 0;
        while (sayi != 0) {
            if (sayi < 0) {
                toplam += sayi;
                sayi = girdi.nextInt();
            } else {
                sayi = girdi.nextInt();
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}
