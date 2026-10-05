import java.util.Scanner;

public class Ornek7 {
    // Kac sayi girildiğini bul
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Toplamak istediginiz sayiyi giriniz:");
        System.out.println("0 girerseniz program sona erecektir");

        int sayi = girdi.nextInt();
        int toplam = 0, girimSayisi = 0;

        while (sayi != 0) {
            toplam += sayi;
            girimSayisi++;
            sayi = girdi.nextInt();
        }

        System.out.println("Toplam: " + toplam);
        System.out.println("Girim sayisi: " + girimSayisi);
    }
}
