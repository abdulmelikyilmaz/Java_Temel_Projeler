import java.util.Scanner;

public class bolmeIslemi {
    static int sayi, sayi2;

    public static void main(String[] args) {
        sayilar();
        islemler();
    }

    static void sayilar() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("İlk sayinizi giriniz:");
        sayi = girdi.nextInt();
        System.out.println("İkinci sayinizi giriniz:");
        sayi2 = girdi.nextInt();
    }

    static void islemler() {
        double sonuc;
        try {
            sonuc = sayi / sayi2;
            System.out.println(sonuc); // hata olmazsa yazdıracak
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
            System.out.println("İkiye bolme hatasi olabilir ");
        }
    }

}
