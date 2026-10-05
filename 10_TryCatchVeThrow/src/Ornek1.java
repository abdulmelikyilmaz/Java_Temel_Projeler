import java.util.Scanner;

public class Ornek1 {
    /*
     * Ilk sayiyi ikinci sayiya bol.
     * Sonucu ekrana yazdir.
     * Kullanici ikinci sayi olarak 0 girerse program hata vermek yerine
     * "Cannot divide by zero" yazdirsin.
     */
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz:");
        int sayi2 = girdi.nextInt();
        int sonuc;

        try {
            sonuc = sayi / sayi2;
            System.out.println("Sonuc: " + sonuc);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try-catch blogu kullanilmistir");
        }

    }
}