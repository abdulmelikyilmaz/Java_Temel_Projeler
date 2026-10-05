import java.util.Scanner;

public class Ornek3 {
    // Ay ve Mevsim
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yilin hangi ayini merak ediyorsunuz");
        int ay;
        try {
            ay = girdi.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Yanlis girim yaptiniz!");
        }

    }
}
