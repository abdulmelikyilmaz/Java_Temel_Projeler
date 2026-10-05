import java.util.Scanner;

public class sayiTahminOyunu {
    static Scanner girdi = new Scanner(System.in);

    public static void main(String[] args) {
        tahminEt();
    }

    static void tahminEt() {
        int sayi = (int) (Math.random() * 100), tahmin, hak = 5;

        System.out.println("1 ile 100 arasindaki sayiyi tahmin ediniz: ");

        for (int i = 1; i <= 5; i++) {
            tahmin = girdi.nextInt();
            if (tahmin == sayi) {
                System.out.println("Tebrikler!");
                break;
            }
            hak--;
            if (hak > 0) {
                if (tahmin > sayi) {
                    System.out.println("Yuksek sayi girdiniz. Tekrar deneyiniz");
                } else {
                    System.out.println("Dusuk sayi girdiniz. Tekrar deneyiniz:");
                }
            } else {
                System.out.println("Hakkiniz bitti. Sayi:" + sayi);
            }
        }

    }

}
