import java.util.Scanner;

public class Ornek10 {
    // Hafta Sonu Kontrolü
    public static void main(String[] args) {
        System.out.println("Hangi gundesiniz?");
        Scanner girdi = new Scanner(System.in);

        String gun = girdi.nextLine();

        String sonuc = switch (gun) {
            case "pazartesi" -> "Hayir!";
            case "sali" -> "Hayir!";
            case "carsamba" -> "Hayir!";
            case "persembe" -> "Hayir!";
            case "cuma" -> "Hayir!";
            case "cumartesi" -> "Evet!";
            case "pazar" -> "Evet!";
            default -> "";
        };

        System.out.println(gun + " gunu tatil mi ? " + sonuc);

    }
}
