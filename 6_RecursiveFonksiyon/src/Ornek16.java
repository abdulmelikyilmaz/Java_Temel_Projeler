import java.util.Scanner;

public class Ornek16 {
    /*
     * Verilen sayida belirli bir rakamin kac kez tekrarlandigini recursive olarak
     * bul.
     * 
     * Ornek:
     * 
     * sayi = 1232422
     * aranan = 2
     * 
     * Sonuc = 4
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("sayinizi giriniz:");
        int sayi = girdi.nextInt();
        System.out.print("Hangi rakami ariyorsunuz? ");
        int rakam = girdi.nextInt();
        System.out
                .println(sayi + " sayisinin icinde " + rakam + " sayisi " + arananRakam(sayi, rakam) + " kez geciyor!");
    }

    static int arananRakam(int sayi, int rakam) {
        if (sayi == 0) {
            return 0;
        }
        if (rakam == sayi % 10) {
            return arananRakam(sayi / 10, rakam) + 1;
        }
        return arananRakam(sayi / 10, rakam);
    }
}
