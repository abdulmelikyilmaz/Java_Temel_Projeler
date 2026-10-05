import java.util.Scanner;

public class Ornek26 {
    // 1 ile N arasinda son rakami 5 olan sayilari yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.println(i);
            }
        }

    }
}
