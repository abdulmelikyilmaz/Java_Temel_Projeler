import java.util.Random;
import java.util.Scanner;

public class indexHatasi {
    public static void main(String[] args) {
        diziOlustur();
    }

    static void diziOlustur() {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Kac elemanli bir dizi istiyorsunuz?");
        int diziUzunluk = girdi.nextInt();

        int[] dizi = new int[diziUzunluk];

        for (int i = 0; i < dizi.length; i++) {
            Random rand = new Random();
            dizi[i] = rand.nextInt(11);
        }

        System.out.println("Kacinci indexteki elemani merak ediyorsunuz?");
        int merak = girdi.nextInt();
        try {
            System.out.println(dizi[merak]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

}
