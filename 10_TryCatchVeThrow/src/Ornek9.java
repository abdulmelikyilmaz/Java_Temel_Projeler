import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek9 {
    /*
     * Bir ogrencinin notunu kontrol eden program yaz.
     * 
     * Kullanicidan not al.
     * 
     * Kurallar:
     * 
     * Not 0-100 arasinda olmali.
     * 0-100 disinda ise kendi InvalidGradeException exception'ini firlat.
     * Kullanici sayi yerine String girerse InputMismatchException yakala.
     * Gecerli not girilirse:
     * 90-100 -> A
     * 80-89 -> B
     * 70-79 -> C
     * 60-69 -> D
     * 0-59 -> F
     * 
     * Program hatali inputlarda kapanmamali.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Ogrencinin notunu giriniz: ");

        try {
            int not = girdi.nextInt();
            if (not < 0 || not > 100) {
                throw new notAralikHatasi();
            }
            if (not < 100 && not > 90) {
                System.out.println("Not: A");
            } else if (not <= 90 && not > 80) {
                System.out.println("Not: B");
            } else if (not <= 80 && not > 70) {
                System.out.println("Not: C");
            } else if (not <= 70 && not > 60) {
                System.out.println("Not: D");
            } else {
                System.out.println("Not: F");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Girilen deger sayi degil");
        } catch (notAralikHatasi ex) {
            System.out.println(ex.getMessage());
        }

    }
}
