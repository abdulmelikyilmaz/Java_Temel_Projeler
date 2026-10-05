import java.util.Scanner;

public class DoWhileDongusu {

    public static void main(String[] args) {
        negatifGirileneKadarTopla();
    }

    // negatif bir deger girilene kadar kullanicidan girisleri kabul eden ve cift
    // sayilari toplayan program
    static void negatifGirileneKadarTopla() {
        Scanner girdi = new Scanner(System.in);
        int sayi, toplam = 0;
        do {
            System.out.print("Sayinizi giriniz:");
            sayi = girdi.nextInt();
            if (sayi % 2 == 0) {
                toplam += sayi;
            }
        } while (sayi > 0);
        System.out.print("Cift sayilarin toplami:" + toplam);
    }
}