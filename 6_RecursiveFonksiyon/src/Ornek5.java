import java.util.Scanner;

public class Ornek5 {
    /*
     * usAl(int taban, int us) fonksiyonu yaz.
     * 
     * Ornek:
     * 
     * taban = 2
     * us = 5
     * 
     * Sonuc = 32
     * 
     * Math.pow() kullanma. Recursive olarak coz.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int sayi = girdi.nextInt();
        System.out.print("Ussu giriniz:");
        int us = girdi.nextInt();

        System.out.println(sayi + " sayisinin " + us + ". dereceden ussu: " + usAlma(sayi, us));

    }

    static double usAlma(int sayi, int us) {
        if (us == 1) {
            return sayi;
        }
        return usAlma(sayi, us - 1) * sayi;
    }
}
