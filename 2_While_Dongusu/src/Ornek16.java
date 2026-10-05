import java.util.Random;
import java.util.Scanner;

public class Ornek16 {
    // Tahmin oyunu
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rand = new Random();
        int randomSayi = rand.nextInt(10) + 1;
        System.out.println("Random sayi olusturuldu");

        System.out.println(randomSayi);

        System.out.println("Tahmininizi yapiniz:");
        int tahmin = girdi.nextInt();

        while (tahmin != randomSayi) {
            if (tahmin > randomSayi) {
                System.out.println("Tahmininizi kucultun!");
                tahmin = girdi.nextInt();
            } else if (tahmin < randomSayi) {
                System.out.println("Tahmininizi buyultun!");
                tahmin = girdi.nextInt();
            }

        }
        System.out.println("Tebrikler!");
    }

}
