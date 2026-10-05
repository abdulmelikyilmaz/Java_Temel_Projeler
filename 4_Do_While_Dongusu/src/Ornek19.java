import java.util.Scanner;

public class Ornek19 {
    // Kullanicidan iki sayi al ve EBOB'unu do while ile bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Ilk sayinizi giriniz: ");
        int sayi1 = girdi.nextInt();
        System.out.print("Ikinci sayinizi giriniz: ");
        int sayi2 = girdi.nextInt();
        int enBuyukOrtakBolen = 1;

        int i = 1;
        if (sayi1 > sayi2) {
            do {
                if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                    enBuyukOrtakBolen = i;
                }
                i++;
            } while (i <= sayi1);
        } else {
            do {
                if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                    enBuyukOrtakBolen = i;
                }
                i++;
            } while (i <= sayi2);
        }

        System.out.println(sayi1 + " ile " + sayi2 + "'nin EBOB'u: " + enBuyukOrtakBolen);

    }
}
