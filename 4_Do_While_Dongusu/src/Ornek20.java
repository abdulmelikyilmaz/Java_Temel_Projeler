import java.util.Scanner;

public class Ornek20 {
    // Kullanicidan iki sayi al ve EKOK'unu do while ile bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Ilk sayinizi giriniz:");
        int sayi = girdi.nextInt();
        System.out.println("Ikinci sayinixi giriniz:");
        int sayi2 = girdi.nextInt();

        int i = 1;
        do {
            if ((i % sayi == 0) && (i % sayi2 == 0)) {
                System.out.println("Ekok: " + i);
                break;
            }
            i++;
        } while (true);

    }
}
