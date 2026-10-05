import java.util.Scanner;

public class Ornek6 {
    // Kullanici 0 girene kadar sayilari topla
    public static void main(String[] args) {
        System.out.println("Toplamak istediginiz sayiyi giriniz:");
        System.out.println("0 girerseniz program sona erecektir");

        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi;
            sayi = girdi.nextInt();
        }
        System.out.println("Sonuc: " + toplam);

    }
}
