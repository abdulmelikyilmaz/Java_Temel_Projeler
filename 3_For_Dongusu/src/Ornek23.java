import java.util.Scanner;

public class Ornek23 {
    // İki sayi al ve aralarindaki tum asal sayilari yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Ilk sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        System.out.print("Ikinci sayinizi giriniz: ");
        int sayi2 = girdi.nextInt();

        int enBuyuk, enKucuk;
        if (sayi > sayi2) {
            enBuyuk = sayi;
            enKucuk = sayi2;
        } else {
            enBuyuk = sayi2;
            enKucuk = sayi;
        }

        int toplam = 0;

        for (int i = enKucuk; i <= enBuyuk; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                    break;
                }
            }
            if (toplam == 0) {
                System.out.println(i);
            }
            toplam = 0;
        }

    }
}
