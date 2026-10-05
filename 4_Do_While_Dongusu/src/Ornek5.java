import java.util.Scanner;

public class Ornek5 {
    // Kullanicidan bir sayi al ve o sayinin faktoriyelini hesapla.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();

        int faktoriyel = 1;
        if (sayi >= 1) {
            do {
                faktoriyel *= sayi;
                sayi--;
            } while (sayi >= 1);
        }
        System.out.println(faktoriyel);

    }
}
