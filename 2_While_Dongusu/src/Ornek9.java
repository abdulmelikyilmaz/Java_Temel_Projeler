import java.util.Scanner;

public class Ornek9 {
    // Bir sayinin basamak sayisini bul

    public static void main(String[] args) {
        System.out.println("Sayinizi giriniz: ");
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int basamakSayisi = 0;

        while (true) {
            sayi /= 10;
            if (sayi != 0) {
                basamakSayisi++;
            } else {
                basamakSayisi++;
                break;
            }
        }

        System.out.println("Basamak sayiniz: " + basamakSayisi);

    }
}
