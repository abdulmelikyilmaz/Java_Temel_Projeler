import java.util.Scanner;

public class Ornek29 {
    /*
     * Bir int dizisi ve target degeri ver.
     * 
     * Toplami target olan tum farkli ciftleri bul.
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] dizi = { 2, 7, 4, 3, 5, 8 };
        System.out.println("Dizi olusturuldu!");
        System.out.println();

        System.out.print("Target sayisi giriniz: ");
        int target = girdi.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i == j) {
                    continue;
                }
                if (target == (dizi[i] + dizi[j])) {
                    System.out.println(dizi[i] + " - " + dizi[j]);
                }
            }
        }

    }
}
