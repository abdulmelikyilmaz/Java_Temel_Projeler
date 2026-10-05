import java.util.Scanner;

public class Ornek17 {
    // Asal sayi kontrolu
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();

        boolean asalMi = true;

        int i = 2;
        while (i != sayi) {
            if (sayi % i != 0) {
                i++;
                continue;
            } else {
                asalMi = false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("Sayiniz asal sayidir!");
        } else {
            System.out.println("Sayiniz asal sayi degildir!");
        }

    }
}
