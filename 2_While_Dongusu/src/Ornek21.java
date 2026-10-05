import java.util.Scanner;

public class Ornek21 {
    // Carpan bulma dongusu
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayiyi giriniz:");
        int sayi = girdi.nextInt();
        int i = 1;

        while (i != (sayi + 1)) {
            if (sayi % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
