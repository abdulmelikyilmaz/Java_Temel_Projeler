import java.util.Random;
import java.util.Scanner;

public class Ornek19 {
    /*
     * Dizide en cok tekrar eden sayiyi bul.
     * Bu sayinin kac kere tekrar ettigini bul.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dizi kac elemanli olsun?");
        int elemanSayisi = girdi.nextInt();
        int[] dizi = new int[elemanSayisi];
        System.out.println("Dizi olusturuldu");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Elemanlar atandi");

        for (int i : dizi) {
            System.out.print(i + " ");
        }

        int tekrarSayisi = 0, temp = 0, index = -1, indexTemp = 0;

        for (int i : dizi) {
            index++;
            for (int j : dizi) {
                if (i == j) {
                    temp++;
                }
            }
            if (tekrarSayisi < temp) {
                tekrarSayisi = temp;
                indexTemp = index;
            }
            temp = 0;
        }

        System.out.println();
        if (tekrarSayisi != 1) {
            System.out.println(
                    "Dizide en cok tekrar eden eleman: " + dizi[indexTemp] + " Tekrar sayisi ise: " + tekrarSayisi);
        } else {
            System.out.println("Dizide tekrar eden sayi yoktur");
        }

    }
}
