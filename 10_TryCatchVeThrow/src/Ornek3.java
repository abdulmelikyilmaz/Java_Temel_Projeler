import java.util.Scanner;

public class Ornek3 {
    /*
     * Kullanicidan bir String al.
     * 
     * Aldigin String'i int degerine cevirmeye calis.
     * Basarili olursa "Number: ..." seklinde yazdir.
     * Kullanici "abc" veya "12x" gibi bir deger girerse program kapanmasin.
     * "Invalid number" yazdir.
     * NumberFormatException kullan.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        String sayi = girdi.nextLine();

        try {
            int sayi2 = Integer.parseInt(sayi);
            System.out.println("Valid number");
            System.out.println("Number: " + sayi2);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try-Catch blogu kullanilmistir");
        }

    }
}
