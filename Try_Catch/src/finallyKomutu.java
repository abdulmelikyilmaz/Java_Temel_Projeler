import java.util.Scanner;

public class finallyKomutu {
    public static void main(String[] args) {
        islemler();
    }

    static void islemler() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz.");
        int sayi = girdi.nextInt();
        System.out.print("Ikinci sayiyi giriniz");
        int sayi2 = girdi.nextInt();

        try {
            double sonuc = (double) sayi / sayi2;
            System.out.println(sonuc);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Islem tamamlandi!");
        }

    }

}
