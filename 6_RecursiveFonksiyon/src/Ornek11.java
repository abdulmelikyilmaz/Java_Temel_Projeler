import java.util.Scanner;

public class Ornek11 {
    /*
     * Recursive fonksiyon kullanarak dizinin icinde verilen sayinin olup olmadigini
     * bul.
     * 
     * Ornek:
     * 
     * dizi = [4, 8, 15, 16, 23, 42]
     * aranan = 23
     * 
     * Sonuc = true
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = { 4, 8, 15, 16, 23, 42 };
        System.out.print("Aradiginiz sayiyi giriniz: ");
        int sayi = girdi.nextInt();

        System.out.println(aranan(dizi, sayi, 0));

    }

    static String aranan(int[] dizi, int sayi, int index) {

        if (sayi == dizi[index]) {
            return "Bulundu";
        }
        if (index == dizi.length - 1) {
            return "Bulunamadi";
        }

        return aranan(dizi, sayi, ++index);

    }
}
