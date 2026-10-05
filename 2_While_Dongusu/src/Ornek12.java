import java.util.Scanner;

public class Ornek12 {
    // Sayinin palindrom olup olmadigini kontrol et
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        int sayi2 = sayi;

        int tersSayi = 0;

        while (true) {
            if (sayi2 > 0) {
                tersSayi *= 10;
                tersSayi += (sayi2 % 10);
                sayi2 /= 10;
            } else {
                break;
            }
        }

        if (sayi == tersSayi) {
            System.out.println(sayi + " Sayiniz palindrom sayidir!");
        } else {
            System.out.println(sayi + " Sayiniz palindrom sayi degildir!");
        }

    }
}
