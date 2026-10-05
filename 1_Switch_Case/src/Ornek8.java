import java.util.Scanner;

public class Ornek8 {
    // Sayıya Göre Ay
    public static void main(String[] args) {
        System.out.println("Yilin hangi ayini merak ediyorsunuz?");
        Scanner girdi = new Scanner(System.in);
        int sayi;
        while (true) {
            sayi = girdi.nextInt();
            if (sayi > 0 && sayi <= 12) {
                break;
            } else {
                System.out.println("Yanlis girim tekrar dene");
            }
        }
        switch (sayi) {
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Subat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayis");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Agustos");
            case 9 -> System.out.println("Eylul");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasim");
            case 12 -> System.out.println("Aralik");
        }

    }
}
