import java.util.Scanner;

public class Ornek6 {
    /*
     * 6. Basamak sayisi bulma
     * 
     * Pozitif bir tam sayinin kac basamakli oldugunu recursive olarak bul.
     * 
     * Ornek:
     * 
     * sayi = 58321
     * Sonuc = 5
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println(sayi + " sayisinin basamak sayisi: " + basamakSayisi(sayi));

    }

    static int basamakSayisi(int sayi) {
        if (sayi == 0) {
            return 0;
        }
        return basamakSayisi(sayi / 10) + 1;
    }
}
