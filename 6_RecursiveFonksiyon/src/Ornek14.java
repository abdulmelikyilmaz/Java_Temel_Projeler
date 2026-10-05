import java.util.Scanner;

public class Ornek14 {
    /*
     * a ile b arasindaki tum sayilarin toplamini recursive olarak bul.
     * 
     * Ornek:
     * 
     * a = 4
     * b = 8
     * 
     * 4 + 5 + 6 + 7 + 8 = 30
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hangi iki sayi araligini toplayacaksiniz?");
        int baslangic = girdi.nextInt();
        int bitis = girdi.nextInt();
        System.out.println("Sonuc:" + toplama(baslangic, bitis));

    }

    static double toplama(int baslangic, int bitis) {
        if (baslangic == bitis) {
            return baslangic;
        }
        return toplama(baslangic + 1, bitis) + baslangic;
    }
}
