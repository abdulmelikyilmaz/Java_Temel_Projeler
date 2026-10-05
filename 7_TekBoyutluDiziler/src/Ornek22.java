import java.util.Scanner;

public class Ornek22 {
    /* Bir diziyi verilen bir index noktasindan iki parcaya ayir. */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = { 10, 20, 30, 40, 50, 60 };
        System.out.println("Diziyi hangi indisten parcalamak istiyorsunuz?");
        System.out.println("Dizinin eleman sayisi: " + (dizi.length));
        int parcalama = girdi.nextInt() - 1;

        if (parcalama > dizi.length) {
            System.out.println("Dizi eleman sayisindan daha buyuk deger girdiniz");
        }

        for (int i = 0; i < dizi.length; i++) {
            if (parcalama >= i) {
                if (i == 0) {
                    System.out.print("Ilk dizi: ");
                }
                System.out.print(dizi[i] + " ");
                if (i == parcalama) {
                    System.out.println();
                }
            }
            if (parcalama < i) {
                if (parcalama == i - 1) {
                    System.out.print("Ikinci dizi: ");
                }
                System.out.print(dizi[i] + " ");
            }
        }
    }
}
