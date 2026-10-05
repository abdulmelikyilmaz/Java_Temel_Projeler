import java.util.Scanner;

public class Ornek18 {
    // Kullanicidan bir sayi al ve bu sayiye kadar olan tum asal sayilari yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        int i = 1, j = 2;
        int bolenSayisi = 0;

        do {
            do {
                if (j % i == 0) {
                    bolenSayisi++;
                }
                if (i == j) {
                    if (bolenSayisi == 2) {
                        System.out.println(j);
                    }
                }
                i++;
            } while (i <= j);
            bolenSayisi = 0;
            i = 1;
            j++;
        } while (j <= sayi);

    }
}
