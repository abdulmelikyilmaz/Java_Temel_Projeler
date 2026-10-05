import java.util.Scanner;

public class Ornek7 {
    // Kullanicidan bir sayi al ve faktoriyelini hesapla.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel: " + faktoriyel);
    }
}
