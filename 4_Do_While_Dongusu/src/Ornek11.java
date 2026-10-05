import java.util.Scanner;

public class Ornek11 {
    // Kullanicidan bir sayi al ve palindrom olup olmadigini kontrol et.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = girdi.nextInt();
        int temp = sayi, temp2 = 0;

        do {
            temp2 *= 10;
            temp2 += sayi % 10;
            sayi /= 10;
        } while (sayi > 0);
        if (temp2 != temp) {
            System.out.println("Sayi palindrom sayi degildir.");
        } else {
            System.out.println("Sayi palindrom sayidir!");
        }

    }
}
