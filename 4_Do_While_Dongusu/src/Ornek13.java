import java.util.Random;
import java.util.Scanner;

public class Ornek13 {
    // Bir sayi tahmin oyunu yap. Bilgisayar 1-100 arasinda bir sayi tutsun.
    // Kullanici dogru tahmin edene kadar do while ile devam et. Her tahminde "daha
    // buyuk" veya "daha kucuk" ipucu ver.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rand = new Random();
        int randomSayi = rand.nextInt(101) + 1;

        System.out.println("Sayi tahmin oyununa hos geldiniz!");
        System.out.println();
        System.out.println("Sayi olusturuldu!");
        System.out.println();
        System.out.print("1 ile 100 arasindaki sayiyi tahmin ediniz: ");
        int sayi = girdi.nextInt();
        int denemeSayisi = 0;

        do {
            if (sayi != randomSayi) {
                denemeSayisi++;
                if (sayi > randomSayi) {
                    System.out.print("Daha kucuk sayi giriniz: ");
                    sayi = girdi.nextInt();
                } else {
                    System.out.print("Daha buyuk sayi giriniz: ");
                    sayi = girdi.nextInt();
                }
            } else {
                break;
            }
        } while (sayi != randomSayi);

        System.out.println("Tebrikler!");
        System.out.println("Deneme sayiniz: " + denemeSayisi);

    }
}
