import java.util.Scanner;

public class Ornek5 {
    // 1 ile N arasindaki sayilarin toplami
    public static void main(String[] args) {
        System.out.println("Kaca kadar toplamak istiyorsunuz?");
        int sayi;
        Scanner girdi = new Scanner(System.in);
        sayi = girdi.nextInt();
        int i = 0;
        int toplam = 0;
        while (i <= sayi) {
            toplam += i;
            i++;
        }
        System.out.println("Sonuc: " + toplam);

    }
}
