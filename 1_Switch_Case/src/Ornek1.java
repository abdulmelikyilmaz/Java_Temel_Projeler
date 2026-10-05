import java.util.Scanner;

public class Ornek1 {

    // Sayıya Göre Gün Yazdır
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Haftanin hangi gununu merak ediyorsunuz?");
        int gun = 0;
        try {
            gun = girdi.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        switch (gun) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Yanlis girim yaptiniz!");

        }
    }
}
