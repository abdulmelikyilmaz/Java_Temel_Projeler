import java.util.Scanner;

public class Ornek8 {
    // Kullanicidan bir sayi al ve bu sayinin asal olup olmadigini do while
    // kullanarak kontrol et.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = girdi.nextInt();

        // 13
        int bolen = 0;
        int i = 2;

        if (sayi < 2) {
            System.out.println("Asal degil");
        } else {
            do {
                if (sayi % i == 0) {
                    bolen++;
                    break;
                }
                i++;
            } while (i * i <= sayi);

            if (bolen != 0) {
                System.out.println("Asal degil");
            } else {
                System.out.println("Asal");
            }
        }

    }

}
