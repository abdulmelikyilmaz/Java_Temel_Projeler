import java.util.Scanner;

public class Ornek12 {
    // Kullanicidan bir sayi al ve Armstrong sayisi olup olmadigini kontrol et.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = girdi.nextInt();

        int temp = sayi, temp2 = 0, temp3 = 0;
        int basamakSayisi = 0;

        do {
            temp /= 10;
            basamakSayisi++;
        } while (temp > 0);

        temp = sayi;
        do {
            temp3 *= 10;
            temp3 = temp % 10;
            temp /= 10;
            temp2 += Math.pow(temp3, basamakSayisi);
        } while (temp > 0);

        if (sayi != temp2) {
            System.out.println("Sayiniz amstrong sayi degildir.");
        } else {
            System.out.println("Sayiniz amstrong sayidir.");
        }

    }
}
