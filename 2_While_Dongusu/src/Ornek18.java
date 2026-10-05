import java.util.Scanner;

public class Ornek18 {
    // Armstrong sayisi kontrolu
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int sayi2 = sayi;
        int sayi3 = sayi;

        int basamakSayisi = 0;

        while (true) {
            if (sayi > 0) {
                basamakSayisi++;
                sayi /= 10;
            } else {
                break;
            }
        }
        // 153

        int toplam = 0;
        int basamakDegeri = 1;

        while (true) {
            if (sayi2 > 0) {
                basamakDegeri = (sayi2 % 10);
                sayi2 /= 10;
                toplam += (int) Math.pow(basamakDegeri, basamakSayisi);
            } else {
                break;
            }
        }

        if (toplam != sayi3) {
            System.out.println("Sayiniz amstrong sayi degildir!");
        } else {
            System.out.println("Sayiniz amstrong sayidir!");
        }

    }
}
