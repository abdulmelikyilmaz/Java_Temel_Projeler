package Recursive;

import java.util.Scanner;

public class RecursiveFaktoriyel {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Faktoriyeli hesaplanacak sayiyi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println(RecursiveFaktoriyelHesaplama(sayi));
    }

    static int RecursiveFaktoriyelHesaplama(int sayi) {
        if (sayi == 1) {
            return 1;
        }
        return sayi * RecursiveFaktoriyelHesaplama(sayi - 1);

    }
}
