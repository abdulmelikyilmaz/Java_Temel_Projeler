import java.util.Scanner;

public class Ornek8 {
    /*
     * fibonacci(int n) fonksiyonunu recursive olarak yaz.
     * 
     * Ornek:
     * 
     * n = 7
     * Sonuc = 13
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println(fibonacciSerisi(sayi));
    }

    static int fibonacciSerisi(int sayi) {
        if (sayi == 1 || sayi == 2) {
            return 1;
        }
        return (fibonacciSerisi(sayi - 2) + fibonacciSerisi(sayi - 1));
    }
}
