import java.util.Scanner;

public class Ornek2 {
    // Kullanicidan bir sayi al ve o sayidan 0'a kadar geri sayim yap.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Pozitif sayinizi giriniz:");
        int sayi = girdi.nextInt();
        while (true) {
            if (sayi < 0) {
                System.out.println("Girdiginiz sayi 0'dan kucuktur! Lutfen tekrar deneyiniz:");
                sayi = girdi.nextInt();
            } else {
                break;
            }
        }
        do {
            System.out.println(sayi);
            sayi--;
        } while (sayi >= 0);
    }
}
