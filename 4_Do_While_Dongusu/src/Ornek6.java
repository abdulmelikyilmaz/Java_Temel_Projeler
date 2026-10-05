import java.util.Scanner;

public class Ornek6 {
    // Kullanicidan bir sayi al ve o sayinin carpim tablosunu (1 ile 10 arasi)
    // yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();

        int i = 1;

        do {
            System.out.println((sayi * i));
            i++;
        } while (i <= 10);

    }
}
