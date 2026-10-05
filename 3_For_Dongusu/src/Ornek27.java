import java.util.Scanner;

public class Ornek27 {
    // Kullanicidan bir sayi al ve bu sayinin tam kare olup olmadigini bul.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi = girdi.nextInt();

        boolean tamKareMi = false;

        for (int i = 1; i <= Math.sqrt(sayi); i++) {
            if (i == Math.sqrt(sayi)) {
                tamKareMi = true;
            }
        }

        if (tamKareMi == true) {
            System.out.println("Tam karedir.");
        } else {
            System.out.println("Tam kare degildir.");
        }

    }
}
