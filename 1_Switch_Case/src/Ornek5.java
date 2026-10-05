import java.util.Scanner;

public class Ornek5 {
    // Harf Notu Sistemi
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Notunuzu giriniz:");
        int not = girdi.nextInt();

        while (true) {
            if (not < 0 || not > 100) {
                System.out.println("Yanlis not girimi. Tekrar deneyiniz!");
                not = girdi.nextInt();
            } else {
                break;
            }
        }

        not /= 10;

        switch (not) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Yanlis girim yaptiniz!");
                break;
        }

    }

}
