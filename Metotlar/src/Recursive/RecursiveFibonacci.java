package Recursive;
import java.util.Scanner;

public class RecursiveFibonacci {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Kac elemanini gormek istiyorsunuz");
        int sayi = girdi.nextInt();
        System.out.println(RecursiveFibonacciHesaplama(sayi));

    }

    static int RecursiveFibonacciHesaplama(int sayi) {
        if (sayi == 1 || sayi == 2) {
            return 1;
        }
        return RecursiveFibonacciHesaplama(sayi - 1) + RecursiveFibonacciHesaplama(sayi - 2);
    }
}
