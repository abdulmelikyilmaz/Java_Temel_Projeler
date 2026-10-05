import java.util.Scanner;

public class Ornek9 {
    // Trafik Lambası
    public static void main(String[] args) {
        System.out.println("Suan hangi isik yaniyor");
        Scanner girdi = new Scanner(System.in);

        String yananIsik;
        yananIsik = girdi.nextLine();

        switch (yananIsik) {
            case "Kirmizi" -> System.out.println("Dur,Geçme!");
            case "Sari" -> System.out.println("Hazir ol");
            case "Yesil" -> System.out.println("Gec");
            default -> System.out.println("Yanlis girim!");
        }

    }
}
