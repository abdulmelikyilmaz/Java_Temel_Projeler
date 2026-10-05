import java.util.Scanner;

public class Ornek17 {
    // Kullanicidan bir sayi al ve kac basamakli oldugunu bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int basamakSayisi = 0;
        for (; sayi > 0; sayi /= 10) {
            basamakSayisi++;
        }
        System.out.println("Basamak sayisi: " + basamakSayisi);
    }
}
