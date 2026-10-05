import java.util.Scanner;

public class Ornek13 {
    /*
     * 1 ile n arasindaki cift sayilari recursive olarak yazdir.
     * 
     * Ornek:
     * 
     * n = 10
     * 
     * 2 4 6 8 10
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz:");
        int sayi = girdi.nextInt();
        yazdir(sayi);
    }

    static void yazdir(int sayi) {
        if (sayi == 1) {
            return;
        }

        if (sayi % 2 == 0) {
            System.out.println(sayi);
        }

        yazdir(sayi - 1);

    }

}
