package Recursive;

import java.util.Scanner;

public class RecursiveUsAlma {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Us alinacak sayiyi giriniz:");
        int sayi = girdi.nextInt();
        System.out.print("Ussu alinacak sayiyi giriniz:");
        int us = girdi.nextInt();
        System.out.println(usAlma(sayi, us));
    }

    static int usAlma(int sayi, int us) {
        if (us == 0) {
            return 1;
        }
        return sayi * usAlma(sayi, us - 1);
    }
}