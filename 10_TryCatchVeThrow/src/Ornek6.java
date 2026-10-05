import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek6 {
    /*
     * Kullanicidan bir int sayi iste.
     * 
     * Kullanici sayi yerine:
     * 
     * "abc"
     * "hello"
     * "12x"
     * 
     * gibi bir deger girerse program hata vermesin.
     * 
     * Hatayi yakala.
     * "Please enter a valid integer" yazdir.
     * InputMismatchException kullan.
     * 
     * Ek sart: Program hata aldiktan sonra tamamen kapanmasin.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        boolean sonuc = true;
        while (sonuc == true) {
            try {
                int sayi = girdi.nextInt();
                sonuc = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please enter a valid integer");
                girdi.next();
                sonuc = true;
                System.out.print("Bir sayi giriniz: ");
            }
        }

    }
}
