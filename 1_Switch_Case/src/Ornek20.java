import java.util.Scanner;

public class Ornek20 {
    // Ay gunleri
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hangi ayi merak ediyorsunuz?");
        int ay = girdi.nextInt();

        switch (ay) {
            case 2:
                System.out.println("Gun sayisi: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Gun sayisi: 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Gun sayisi: 31");
                break;
            default:
                System.out.println("Yanlis girim");
                break;
        }
    }
}
