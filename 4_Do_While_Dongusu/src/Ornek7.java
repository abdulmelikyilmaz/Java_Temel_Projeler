import java.util.Scanner;

public class Ornek7 {
    // Kullanicidan sayilar almaya devam et. Kullanici 0 girdiginde dongu bitsin ve
    // girilen sayilarin toplamini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi, toplam = 0;

        do {
            sayi = girdi.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        System.out.print("Girilen sayilarin toplami: " + toplam);
    }
}