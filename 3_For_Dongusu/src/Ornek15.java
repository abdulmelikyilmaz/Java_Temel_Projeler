import java.util.Scanner;

public class Ornek15 {
    // Kullanicidan bir sayi al ve rakamlarinin toplamini bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int sayi2 = sayi;
        int basamakSayisi = 0;

        // 123
        for (; sayi > 0; sayi /= 10) {
            basamakSayisi++;
        }

        System.out.println("Basamak sayisi: " + basamakSayisi);
    }
}
