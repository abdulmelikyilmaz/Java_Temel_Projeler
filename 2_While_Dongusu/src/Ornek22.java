import java.util.Scanner;

public class Ornek22 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String sifre = "admin";
        int hak = 3;

        while (hak > 0) {
            System.out.println("Şifrenizi giriniz:");
            String sifrem = girdi.nextLine();

            if (sifre.equals(sifrem)) {
                System.out.println("Şifre başarılı");
                return;
            } else {
                hak--;
                System.out.println("Şifre yanlış! Kalan hak: " + hak);
            }
        }

        System.out.println("Hesabınız bloke oldu");
    }
}