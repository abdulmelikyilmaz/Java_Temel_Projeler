import java.util.Scanner;

public class Ornek15 {
    /*
     * Bir sayinin icindeki en buyuk rakami recursive olarak bul.
     * 
     * Ornek:
     * 
     * sayi = 583217
     * 
     * Sonuc = 8
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println(sayi + " sayisinin en buyuk hanesi: " + enBuyuk(sayi));
    }

    static int temp = 0;

    static int enBuyuk(int sayi) {

        if (sayi == 0) {
            return temp;
        }
        if (temp < sayi % 10) {
            temp = sayi % 10;
        }
        return enBuyuk(sayi / 10);

    }

}
