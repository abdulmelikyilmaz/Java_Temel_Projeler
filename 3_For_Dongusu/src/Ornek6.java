import java.util.Scanner;

public class Ornek6 {
    // Kullanicidan bir sayi al ve 1'den o sayiya kadar olan sayilarin toplamini
    // bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + " ");
        }

    }
}
