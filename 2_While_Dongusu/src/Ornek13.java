import java.util.Scanner;

public class Ornek13 {
    // Faktoriyel hesapla
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Faktoriyeli alinacak sayiyi giriniz!");
        int faktoriyel = girdi.nextInt();
        int toplam = 1;

        int i = 1;
        while (i != (faktoriyel + 1)) {
            toplam *= i;
            i++;
        }
        System.out.println("Faktoriyel sonucunuz:" + toplam);

    }
}
