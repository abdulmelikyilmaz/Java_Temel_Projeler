import java.util.Scanner;

public class Ornek8 {
    // Kullanicidan bir sayi al ve carpim tablosunu olustur.
    public static void main(String[] args) {
        System.out.println("Sayinizi giriniz: ");
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
        }
    }
}
