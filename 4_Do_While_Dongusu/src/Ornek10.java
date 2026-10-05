import java.util.Scanner;

public class Ornek10 {
    // Kullanicidan bir sayi al ve tersini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = girdi.nextInt();

        int temp = 0;

        do {
            temp *= 10;
            temp += sayi % 10;
            sayi /= 10;

        } while (sayi > 0);
        System.out.println("Sayinin tersi: " + temp);

    }
}
