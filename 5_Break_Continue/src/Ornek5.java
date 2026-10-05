import java.util.Scanner;

public class Ornek5 {
    // Dizi icine kullanicidan sayi al
    // Negatif sayilari continue ile atla.
    // Pozitif sayilari yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi;
        System.out.println("Diziniz kac elemanli olsun?");
        int diziSayisi = girdi.nextInt();
        dizi = new int[diziSayisi];

        // Dizi icinden sayi aldik
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanini giriniz: ");
            dizi[i] = girdi.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < 0) {
                continue;
            }
            System.out.println(dizi[i]);
        }
    }
}
