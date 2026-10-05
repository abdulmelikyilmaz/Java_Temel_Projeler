import java.util.Scanner;

public class Ornek7 {
    /*
     * 7. Rakamlar toplami
     * 
     * Bir sayinin rakamlarini recursive olarak topla.
     * 
     * Ornek:
     * 
     * sayi = 58321
     * 
     * 5 + 8 + 3 + 2 + 1 = 19
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
        return basamakSayisi(sayi / 10) + (sayi % 10);
    }
}
