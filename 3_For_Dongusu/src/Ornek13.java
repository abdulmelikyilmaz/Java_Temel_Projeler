import java.util.Scanner;

public class Ornek13 {
    // Kullanicidan bir sayi al ve asal olup olmadigini kontrol et.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        if (asalMi == false) {
            System.out.println("Asal degil");
        } else if (sayi == 1) {
            System.out.println("asal degil");
        } else {
            System.out.println("Asal");
        }
    }

}
