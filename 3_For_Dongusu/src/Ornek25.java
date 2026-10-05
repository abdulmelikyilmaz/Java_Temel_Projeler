import java.util.Scanner;

public class Ornek25 {
    // 1 ile N arasindaki tum sayilarin basamak sayilarini yazdir.
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = girdi.nextInt();

        int basamakSayisi = 0;
        int temp;
        for (int i = 1; i <= sayi; i++) {
            temp = i;
            for (int j = 1; j <= 10; j++) {
                if (temp == 0) {
                    break;
                }
                temp /= 10;
                basamakSayisi++;
            }
            System.out.println(i + " Sayisinin basamak sayisi: " + basamakSayisi);
            basamakSayisi = 0;
        }

    }

}
