import java.util.Scanner;

public class Ornek11 {
    // Sayiyi ters cevir
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();

        int tersSayi = 0;

        while (true) {
            if (sayi > 0) {
                tersSayi *= 10;
                tersSayi += (sayi % 10);
                sayi /= 10;
            } else {
                break;
            }
        }
        System.out.println("Ters sayiniz: " + tersSayi);

    }
}
