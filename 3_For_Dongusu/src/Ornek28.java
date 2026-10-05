import java.util.Scanner;

public class Ornek28 {
    // 1 ile N arasinda rakamlari birbirinden farkli olan sayilari yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int temp;
        int basamakSayisi = 0;
        int[] dizi;
        boolean farkliMi = true;

        // 214 222
        for (int i = 1; i <= sayi; i++) {
            temp = i;
            for (int j = 1; j <= 10; j++) {
                if (temp == 0) {
                    break;
                }
                temp /= 10;
                basamakSayisi++;
            }

            temp = i;
            dizi = new int[basamakSayisi];

            for (int k = 0; k < dizi.length; k++) {
                if (temp == 0) {
                    break;
                }
                dizi[k] = temp % 10;
                temp /= 10;
            }

            basamakSayisi = 0;

            for (int l = 0; l < dizi.length - 1; l++) {
                for (int m = l + 1; m < dizi.length; m++) {
                    if (dizi[l] == dizi[m]) {
                        farkliMi = false;
                        break;
                    }
                }
            }

            if (farkliMi == true) {
                System.out.println(i);
            }

            farkliMi = true;
        }
    }
}