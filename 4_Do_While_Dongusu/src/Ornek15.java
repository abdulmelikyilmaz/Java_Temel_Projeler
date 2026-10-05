import java.util.Arrays;
import java.util.Scanner;

public class Ornek15 {
    // Kullanicidan bir sayi al ve rakamlarini buyukten kucuge siralayarak yeni bir
    // sayi olustur.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = girdi.nextInt();
        int sayi2 = sayi;
        int basamakSayisi = 0;

        do {
            sayi /= 10;
            basamakSayisi++;
        } while (sayi > 0);

        int[] dizi = new int[basamakSayisi];

        int enBuyukBasamak;
        int i = 0;
        do {
            dizi[i] = sayi2 % 10;
            sayi2 /= 10;
            i++;
        } while (sayi2 > 0);

        Arrays.sort(dizi); // Dizinin elemanlarini kucukten buyuge siralar
        System.out.print("Yeni sayiniz: ");

        int j = 0;
        do {
            System.out.print(dizi[j]);
            j++;
        } while (j < dizi.length);

    }
}
