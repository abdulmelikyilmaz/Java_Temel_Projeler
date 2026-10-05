import java.util.Scanner;

public class Ornek12 {
    // Kullanicidan bir sayi al ve o sayinin kaç tane boleni oldugunu bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();
        int bolenSayini = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                bolenSayini++;
            }
        }
        System.out.println(sayi + " sayisinini boleni: " + bolenSayini);
    }
}
