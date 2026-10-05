import java.util.Scanner;

public class Ornek21 {
    // Kullanicidan bir sayi al ve Fibonacci serisinin ilk n terimini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Fibonacii serisinin kacinci terimini gormek istiyorsun?");
        int fibonacci = girdi.nextInt();

        int toplam = 0;
        int temp = 0;
        int temp2 = 1;

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        do {
            System.out.println(toplam);
            temp = temp2;
            temp2 = toplam;
            toplam = temp + temp2;
            fibonacci--;
        } while (fibonacci > 0);

    }
}
