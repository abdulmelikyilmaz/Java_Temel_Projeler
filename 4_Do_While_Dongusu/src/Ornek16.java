import java.util.Scanner;

public class Ornek16 {
    // Kullanicidan bir sayi al ve bu sayinin tum bolenlerini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayinizi giriniz:");
        int sayi = girdi.nextInt();

        int i = 1;
        do {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= sayi);
        System.out.println();
        System.out.println("Program sona erdi");
    }
}
