import java.util.Scanner;

public class palindromSayilar {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        palindromSayiMi();
    }

    // palindrom sayilar kendisi ile tersi ayni olan sayilardir
    // 121 , 123321 gibi
    static void palindromSayiMi() {
        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        int basamak, ters = 0, sayi2;
        sayi2 = sayi;
        while (true) {
            if (sayi > 0) {
                basamak = sayi % 10;
                ters = ters * 10 + basamak;
                sayi /= 10;
            } else {
                break;
            }
        }
        if (sayi2 == ters) {
            System.out.println(sayi2 + " Palindrom sayidir");
        } else
            System.out.println(sayi2 + " Palindrom sayi degildir.");
    }
}
