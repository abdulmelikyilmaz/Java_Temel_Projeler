import java.util.Scanner;

public class Ornek17 {
    // Kullanicidan bir sayi al ve mukemmel sayi olup olmadigini kontrol et.
    // Mukemmel sayi, kendisi haric tum pozitif bolenlerinin toplami, sayinin
    // kendisine esit olan sayidir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();

        int bolenlerToplami = 0, i = 1;
        ;

        do {
            if (sayi % i == 0) {
                bolenlerToplami += i;
            }
            i++;
        } while (i < sayi);

        if (bolenlerToplami == sayi) {
            System.out.println("Sayi mukemmel sayidir!");
        } else {
            System.out.println("Sayi mukemmel sayi degildir!");
        }

    }
}
